package EjercicioNBA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BDControler {
	private Connection conexion;

	public BDControler() {
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/NBA", "root", "");
		} catch (Exception e) {
			System.out.println("Error in BDControler constructor: " + e);
		}
	}

	public Jugador dameJugador(int codigo) {
		String sql = "SELECT * FROM jugadores WHERE codigo='" + codigo + "'";
		try {
			Statement mySatement = this.conexion.createStatement();
			System.out.println(sql);
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
}
