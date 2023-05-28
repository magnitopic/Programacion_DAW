package NBA;

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
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/NBA", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error en el contructor de BDController" + e.getMessage());
		}
	}

	/**
	 * @return the conexion
	 */
	public Connection getConexion() {
		return conexion;
	}

	/**
	 * @param conexion the conexion to set
	 */
	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public ArrayList<Jugador> getJugadoresNacionalidad(String nacionalidad) {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		String sql = "SELECT * FROM jugadores WHERE procedencia ='" + nacionalidad + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				jugadores.add(new Jugador(rs.getInt("codigo"), rs.getString("nombre"), rs.getString("procedencia"),
						rs.getString("altura"), rs.getInt("peso"), rs.getString("posicion"),
						rs.getString("nombre_equipo")));
			}
		} catch (Exception e) {
			System.out.println("Error en getJugadoresNacionalidad: " + e);
		}
		return jugadores;
	}
	
	public ArrayList<Jugador> dameJugadores() {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		String sql = "SELECT * FROM jugadores";
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
	
	
	public ArrayList<Equipo> dameEquipos() {
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		String sql = "SELECT * FROM equipos";
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

	public Equipo getEquipo(String nomEquipo) {
		Equipo equipos = null;
		String sql = "SELECT * FROM equipos WHERE nombre ='" + nomEquipo + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			rs.next();
			equipos = new Equipo(rs.getString("nombre"), rs.getString("ciudad"), rs.getString("conferencia"),
					rs.getString("division"));
		} catch (Exception e) {
			System.out.println("Error en getEquipo: " + e);
		}
		return equipos;
	}
	
	public void delJugador(String codigo) {
		String sql = "DELETE FROM estadisticas WHERE jugador = '"+codigo+"';";
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.execute(sql);
		} catch (Exception e) {
			System.out.println("Error el la primera query de delJugador: "+e);
		}
		sql = "delete from jugadores where codigo = '"+codigo+"'";
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.execute(sql);
		} catch (Exception e) {
			System.out.println("Error el la segunda query de delJugador: "+e);
		}
	}
	
	public void createEquipo(Equipo eq) {
		String sql = "insert into equipos values ('"+eq.getNombre()+"','"+eq.getCiudad()+"','"+eq.getConferencia()+"','"+eq.getDivision()+"');";
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.execute(sql);
		} catch (Exception e) {
			System.out.println("Error el la primera query de createEquipo: "+e);
		}
	}
	
	
	public boolean checkJugador(String cod) {
		boolean bool = false;
		String sql = "SELECT * FROM jugadores WHERE codigo ='"+cod+"'";
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.executeQuery(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			bool = rs.next();
		} catch (Exception e) {
			System.out.println("Error en checkJugador: "+e);
		}
		return bool;
	}
	
	
	public boolean checkEquipo(String nombre) {
		boolean bool = false;
		String sql = "SELECT * FROM equipos WHERE nombre ='"+nombre+"'";
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.executeQuery(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			bool = rs.next();
		} catch (Exception e) {
			System.out.println("Error en checkEquipo: "+e);
		}
		return bool;
	}
	
	public void modEquipo(Equipo eq) {
		String sql = "UPDATE equipos SET nombre= '"+eq.getNombre()+"', ciudad= '"+eq.getCiudad()+"', conferencia='"+eq.getConferencia()+"', division = '"+eq.getDivision()+"'  WHERE nombre ='"+eq.getNombre()+"';";
		try {
			Statement myStatement = this.conexion.createStatement();
			myStatement.execute(sql);
		} catch (Exception e) {
			System.out.println("Error el la primera query de modEquipo: "+e);
		}
	}
}