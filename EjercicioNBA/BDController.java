package EjercicioNBA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BDController {
	private Connection conexion;

	public BDController() {
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/NBA", "root", "");
		} catch (Exception e) {
			System.out.println("Error in BDControler constructor: " + e);
		}
	}

	/* Funciones básicas jugador */
	public Jugador dameJugador(int codigo) {
		String sql = "SELECT * FROM jugadores WHERE codigo='" + codigo + "'";
		try {
			Statement mySatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = mySatement.executeQuery(sql);
			if (rs.next()) {
				return new Jugador(rs.getInt("codigo"), rs.getString("altura"), rs.getString("nombre"),
						rs.getString("nombre_equipo"), rs.getInt("peso"), rs.getString("posicion"),
						rs.getString("procedencia"));
			}
		} catch (Exception e) {
			System.out.println("Error en dameJugador: " + e);
		}
		return null;
	}

	public ArrayList<Jugador> dameJugadores() {
		ArrayList<Jugador> jugadores = new ArrayList<>();
		String sql = "SELECT * FROM jugadores";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				Jugador newJugador = new Jugador(rs.getInt("codigo"), rs.getString("altura"), rs.getString("nombre"),
						rs.getString("nombre_equipo"), rs.getInt("peso"), rs.getString("posicion"),
						rs.getString("procedencia"));
				jugadores.add(newJugador);
			}
		} catch (Exception e) {
			System.out.println("Error en dameJugadores: " + e);
		}

		return jugadores;
	}

	public boolean existeJugador(int codigo) {
		boolean returnValue = false;
		String sql = "SELECT * FROM jugadores WHERE codigo='" + codigo + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			returnValue = rs.next();
		} catch (Exception e) {
			System.out.println("Error en existeJugador: " + e);
		}
		return returnValue;
	}

	/* Funciones básicas equipo */
	public Equipo dameEquipo(String nombre) {
		String sql = "SELECT * FROM equipos WHERE nombre='" + nombre + "'";
		try {
			Statement mySatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = mySatement.executeQuery(sql);
			if (rs.next()) {
				return new Equipo(rs.getString("nombre"), rs.getString("ciudad"), rs.getString("conferencia"),
						rs.getString("division"));
			}
		} catch (Exception e) {
			System.out.println("Error en dameEquipo: " + e);
		}
		return null;
	}

	public ArrayList<Equipo> dameEquipos() {
		ArrayList<Equipo> equipos = new ArrayList<>();
		String sql = "SELECT * FROM equipos";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				Equipo newEquipo = new Equipo(rs.getString("nombre"), rs.getString("ciudad"),
						rs.getString("conferencia"), rs.getString("division"));
				equipos.add(newEquipo);
			}
		} catch (Exception e) {
			System.out.println("Error en dameEquipos: " + e);
		}

		return equipos;
	}

	public boolean existeEquipo(String nombre) {
		boolean returnValue = false;
		String sql = "SELECT * FROM equipos WHERE nombre='" + nombre + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			returnValue = rs.next();
		} catch (Exception e) {
			System.out.println("Error en existeEquipo: " + e);
		}
		return returnValue;
	}

	public void insertJugador(Jugador jugador) {
		String sql = "INSERT INTO jugadores VALUES ('" + jugador.getCodigo() + "', '" + jugador.getNombre() + "', '"
				+ jugador.getProcedencia() + "', '" + jugador.getAltura() + "', '" + jugador.getPeso() + "', '"
				+ jugador.getPosicion() + "', '" + jugador.getNombre_equipo() + "')";
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error en insertJugador: " + e);
		}
	}

	public void eliminarJugador(int codigo) {
		String sql1 = "DELETE FROM jugadores WHERE codigo='" + codigo + "'";
		String sql2 = "DELETE FROM estadisticas WHERE jugador='" + codigo + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.executeUpdate(sql2);
			myStatement.executeUpdate(sql1);
		} catch (Exception e) {
			System.out.println("Error en eliminarJugador: " + e);
		}
	}

	public void insertEstadistica(Estadistica estadistica) {
		String sql = "INSERT INTO estadisticas values ('" + estadistica.getTemporada() + "', '"
				+ estadistica.getJugador() + "', '" + estadistica.getPuntos() + "', '" + estadistica.getAsitencias()
				+ "', '" + estadistica.getTapones() + "', '" + estadistica.getRebotes() + "')";
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error en insertEstadistica: " + e);
		}
	}

	public boolean existeEstadistica(String temporada, int codJugador) {
		Boolean existe = false;
		String sql = "SELECT * from estadisticas WHERE teporada='" + temporada + "' AND jugador='" + codJugador + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			existe = rs.next();
		} catch (Exception e) {
			System.out.println("Error en existeEstadistica: " + e);
		}
		return existe;
	}

	public void eliminarEstadistica(String temporada, int codJugador) {
		String sql = "DELETE FROM estadisticas WHERE teporada='" + temporada + "' AND jugador='" + codJugador + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error en eliminarEstadistica: " + e);
		}
	}

	public ArrayList<Estadistica> dameEstadisticas() {
		ArrayList<Estadistica> estadisticas = new ArrayList<Estadistica>();
		String sql = "SELECT * FROM estadisticas";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				estadisticas.add(new Estadistica(rs.getString(1), rs.getInt(2), rs.getFloat(3), rs.getFloat(4),
						rs.getFloat(5), rs.getFloat(6)));
			}
		} catch (Exception e) {
			System.out.println("Error en dameEstadisticas: " + e);
		}
		return estadisticas;
	}

	public void printPartidosEquipos(String nameEqu1, String nameEqu2) {
		String sql = "SELECT * FROM partidos WHERE (equipo_local like '" + nameEqu1 + "' AND equipo_visitante like '"
				+ nameEqu2 + "') OR (equipo_local like '" + nameEqu2 + "' AND equipo_visitante like '" + nameEqu1
				+ "')";
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				System.out.println("Temporada: " + rs.getString("temporada") + " " + rs.getString("equipo_local") + " "
						+ rs.getString("puntos_local") + ":" + rs.getString("puntos_visitante") + " "
						+ rs.getString("equipo_visitante"));
			}
		} catch (Exception e) {
			System.out.println("Error en printPartidosEquipos: " + e);
		}
	}

	public ArrayList<Equipo> dameEquiposOrdenados() {
		ArrayList<Equipo> equiposOrdenados = new ArrayList<Equipo>();
		String sql = "SELECT * FROM equipos ORDER BY division";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next())
				equiposOrdenados.add(new Equipo(rs.getString("nombre"), rs.getString("division"),
						rs.getString("conferencia"), rs.getString("ciudad")));
		} catch (Exception e) {
			System.out.println("Error en dameEquiposOrdenados: " + e);
		}
		return equiposOrdenados;
	}

	public ArrayList<String> partidosGanadosEquipo(String nomEqu) {
		ArrayList<String> partidos = new ArrayList<String>();
		String sql = "SELECT * FROM partidos WHERE (equipo_local like '" + nomEqu
				+ "' AND puntos_local > puntos_visitante)" + "OR (equipo_Visitante like '" + nomEqu
				+ "' AND puntos_visitante > puntos_local)";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next())
				partidos.add("Temporada: " + rs.getString("temporada") + " " + rs.getString("equipo_local") + " "
						+ rs.getString("puntos_local") + ":" + rs.getString("puntos_visitante") + " "
						+ rs.getString("equipo_visitante"));
		} catch (Exception e) {
			System.out.println("Error en partidosGanadosEquipo: " + e);
		}
		return partidos;
	}

	public ArrayList<Jugador> jugadoresEspecificos(String procedencia, String nomEqu, String ciudad, String conferencia,
			String division) {
		String sql = "SELECT * FROM jugadores WHERE procedencia = " + procedencia + " AND " + nomEqu + " in "
				+ "(SELECT nombre FROM equipos WHERE ciudad!= " + ciudad + " AND conferencia= " + conferencia
				+ " AND division = " + division + ")";
		return null;
	}
	
	public ArrayList<Equipo> equiposConJugadores(){
		ArrayList<Equipo> equipos = dameEquipos();
		ArrayList<Jugador> jugadores = dameJugadores();
		for (Equipo e: equipos) {
			for (Jugador j : jugadores) {
				if (j.getNombre_equipo().equals(e.getNombre()))
					e.getJugadores().add(j);
			}
		}
		return equipos;
	}

	public ArrayList<Equipo> equiposCon15Jugadores(){
		ArrayList<Equipo> equipos = dameEquipos();
		ArrayList<Equipo> equipos15 = new ArrayList<Equipo>();
		ArrayList<Jugador> jugadores = dameJugadores();
		int i=0;
		for (Equipo e: equipos) {
			for (Jugador j : jugadores) {
				if (j.getNombre_equipo().equals(e.getNombre()))
					e.getJugadores().add(j);
			}
			if (e.getJugadores().size()>15)
				equipos15.add(e);
		}
		return equipos15;
	}
	
	public ArrayList<Equipo> equpos7pies(String nombreDiv){
		ArrayList<Equipo> equipos = equiposConJugadores();
		ArrayList<Equipo> equipos7Pies = equiposConJugadores();
		for (Equipo e : equipos) {
			boolean hasPlayer = false;
			if (!e.getDivision().equalsIgnoreCase(nombreDiv)) {
				for (Jugador j:e.getJugadores())
				{
					if (Integer.valueOf(j.getAltura())>=7)
						hasPlayer=true;
				}
				if (hasPlayer)
					equipos7Pies.add(e);
			}
		}
		return equipos7Pies;
	}
}
