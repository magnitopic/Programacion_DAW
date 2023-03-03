import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BDController {
	private Connection conexion;

	public BDController() {
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/nba", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	// Ejercicio 1

	public ArrayList<String> dameTemporadasEquipos(String nomEquipoL, String nomEquipoV, String temp) {
		ArrayList<String> resultados = new ArrayList<String>();
		String sql = "SELECT * FROM partidos WHERE ((equipo_local='" + nomEquipoL + "' AND equipo_visitante='"
				+ nomEquipoV + "') OR (equipo_local='" + nomEquipoV + "' AND equipo_visitante='" + nomEquipoL
				+ "')) AND temporada='" + temp + "'";
		resultados.add("Temporada " + temp);
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				resultados.add(rs.getString("equipo_visitante") + " " + rs.getString("puntos_visitante") + ":"
						+ rs.getString("puntos_local") + " " + rs.getString("equipo_local"));
			}
		} catch (Exception e) {
			System.out.println("Error en dameTemporadasEquipos: " + e);
		}
		return resultados;
	}

	public boolean existeTemporada(String temp) {
		String sql = "select * from partidos";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				if (rs.getString("temporada").equalsIgnoreCase(temp)) {
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println("Error en existeTemporada: " + e);
		}
		return false;
	}

	public boolean existeEquipo(String nombreEquipo) {
		String sql = "select * from equipos";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				if (rs.getString("nombre").equalsIgnoreCase(nombreEquipo)) {
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println("Error en existeEquipo: " + e);
		}
		return false;
	}

	// Ejercicio 2

	public ArrayList<Equipo> dameEquipos() {
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		String sql = "select * from equipos";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				equipos.add(new Equipo(rs.getString("nombre"), rs.getString("ciudad"), rs.getString("conferencia"),
						rs.getString("division")));
			}
		} catch (Exception e) {
			System.out.println("Error en dameEquipos: " + e);
		}
		return equipos;
	}

	// Ejercicio 4

	public int puntosEquipo(Equipo equipo) {
		int puntos = 0;
		String sql = "select * from partidos";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				if (rs.getString("equipo_local").equalsIgnoreCase(equipo.getNombre()))
					puntos += rs.getInt("puntos_local");
				else if (rs.getString("equipo_visitante").equalsIgnoreCase(equipo.getNombre()))
					puntos += rs.getInt("puntos_visitante");
			}
		} catch (Exception e) {
			System.out.println("Error en puntosEquipo: " + e);
		}
		return puntos;
	}

	// Ejercicio 5
	public ArrayList<Jugador> dameJugadores() {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		String sql = "select * from jugadores";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				jugadores.add(new Jugador(rs.getInt("codigo"), rs.getString("nombre"), rs.getString("procedencia"),
						rs.getString("altura"), rs.getInt("peso"), rs.getString("posicion"),
						rs.getString("nombre_equipo")));
			}
		} catch (Exception e) {
			System.out.println("Error en dameJugadores: " + e);
		}
		return jugadores;
	}
}