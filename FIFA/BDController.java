package FIFA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BDController {
	private Connection conexion;

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public BDController() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/fifa", "root", "");
		} catch (Exception e) {
			System.out.println("Error in BDControler constructor: " + e);
		}
	}

	public ArrayList<Jugadores> todosJugadores() {
		ArrayList<Jugadores> jugadores = new ArrayList<>();
		String sql = "SELECT * FROM jugadores";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				Jugadores newJugador = new Jugadores(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4),
						rs.getInt(5), rs.getString(6));
				jugadores.add(newJugador);
			}
		} catch (Exception e) {
			System.out.println("Error en todosJugadores: " + e);
		}

		return jugadores;
	}

	public ArrayList<Equipos> todosEquipos() {
		ArrayList<Equipos> equipos = new ArrayList<>();
		String sql = "SELECT * FROM equipos";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				Equipos newJugador = new Equipos(rs.getInt(1), rs.getString(2), rs.getInt(3));
				equipos.add(newJugador);
			}
		} catch (Exception e) {
			System.out.println("Error en todosEquipos: " + e);
		}

		return equipos;
	}

	public ArrayList<Cartas> todasCartas() {
		ArrayList<Cartas> cartas = new ArrayList<>();
		String sql = "SELECT * FROM cartas";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				Cartas newCarta = new Cartas(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(5),
						rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11),
						rs.getInt(12), rs.getInt(13));
				cartas.add(newCarta);
			}
		} catch (Exception e) {
			System.out.println("Error en todosCartas: " + e);
		}

		return cartas;
	}

	public ArrayList<Ligas> todasLigas() {
		ArrayList<Ligas> ligas = new ArrayList<>();
		String sql = "SELECT * FROM ligas";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				Ligas newLiga = new Ligas(rs.getInt(1), rs.getString(2), rs.getString(3));
				ligas.add(newLiga);
			}
		} catch (Exception e) {
			System.out.println("Error en todasLigas: " + e);
		}

		return ligas;
	}

	public Ligas dameLiga(int cod_liga) {
		Ligas liga = null;
		String sql = "SELECT * FROM ligas where cod_liga='" + cod_liga + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			rs.next();
			liga = new Ligas(rs.getInt(1), rs.getString(2), rs.getString(3));

		} catch (Exception e) {
			System.out.println("Error en dameLiga: " + e);
		}
		return liga;
	}

	public Equipos dameEquipo(int cod_equipo) {
		Equipos equipo = null;
		String sql = "SELECT * FROM equipos where cod_equipo='" + cod_equipo + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			rs.next();
			equipo = new Equipos(rs.getInt(1), rs.getString(2), rs.getInt(3));

		} catch (Exception e) {
			System.out.println("Error en dameEquipo: " + e);
		}
		return equipo;
	}

	public Equipos dameJugador(int cod_jugador) {
		Equipos equipo = null;
		String sql = "SELECT * FROM equipos where cod_jugador='" + cod_jugador + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			rs.next();
			equipo = new Equipos(rs.getInt(1), rs.getString(2), rs.getInt(3));

		} catch (Exception e) {
			System.out.println("Error en todosCartas: " + e);
		}
		return equipo;
	}

	public Cartas dameCarta(String nombre, int cod_jugador) {
		Cartas carta = null;
		String sql = "SELECT * FROM equipos where cod_jugador='" + cod_jugador + "' and nombre='" + nombre + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			rs.next();
			carta = new Cartas(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getInt(6),
					rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11), rs.getInt(12),
					rs.getInt(13));

		} catch (Exception e) {
			System.out.println("Error en todosCartas: " + e);
		}
		return carta;
	}

	public boolean existeCarta(String nombre, int cod_jugador) {
		boolean result = false;
		String sql = "SELECT * FROM equipos where cod_jugador='" + cod_jugador + "' and nombre='" + nombre + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			if (rs.next())
				result = true;
		} catch (Exception e) {
			System.out.println("Error en existeCarta: " + e);
		}
		return result;
	}
	
	public boolean existeEquipo(int cod_equipo) {
		boolean result = false;
		String sql = "SELECT * FROM equipos where cod_equipo='" + cod_equipo + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			if (rs.next())
				result = true;
		} catch (Exception e) {
			System.out.println("Error en existeCarta: " + e);
		}
		return result;
	}
	
	public boolean existeLiga(int cod_liga) {
		boolean result = false;
		String sql = "SELECT * FROM ligas where cod_liga='" + cod_liga + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			if (rs.next())
				result = true;
		} catch (Exception e) {
			System.out.println("Error en existeCarta: " + e);
		}
		return result;
	}
	
	public boolean existeJugador(int cod_jugador) {
		boolean result = false;
		String sql = "SELECT * FROM equipos where cod_jugador='" + cod_jugador + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			if (rs.next())
				result = true;
		} catch (Exception e) {
			System.out.println("Error en existeCarta: " + e);
		}
		return result;
	}
}