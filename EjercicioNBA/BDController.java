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
				return new Jugador(rs.getInt("codigo"),
						rs.getString("altura"),
						rs.getString("nombre"),
						rs.getString("nombre_equipo"),
						rs.getInt("peso"),
						rs.getString("posicion"),
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
				Jugador newJugador = new Jugador(rs.getInt("codigo"),
						rs.getString("altura"),
						rs.getString("nombre"),
						rs.getString("nombre_equipo"),
						rs.getInt("peso"),
						rs.getString("posicion"),
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
				return new Equipo(rs.getString("nombre"),
						rs.getString("ciudad"),
						rs.getString("conferencia"),
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
				Equipo newEquipo = new Equipo(rs.getString("nombre"),
						rs.getString("ciudad"),
						rs.getString("conferencia"),
						rs.getString("division"));
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
				+ jugador.getAltura() + "', '" + jugador.getPeso() + "', '" + jugador.getPosicion() + "', '"
				+ jugador.getProcedencia() + "', '" + jugador.getNombre_equipo() + "')";
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.executeQuery(sql);
		} catch (Exception e) {
			System.out.println("Error en insertJugador: " + e);
		}
	}

	public void eliminarJugador(int codigo) {
		String sql = "DELETE FROM jugadores WHERE codigo='" + codigo + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error en eliminarJugador: " + e);
		}
	}
}
