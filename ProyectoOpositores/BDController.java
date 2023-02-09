package ProyectoOpositores;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BDController {
	private Connection conexion;

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

	public BDController() {
		super();
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/opositores", "root", "");
		} catch (Exception e) {
			System.out.println("Error en Costructor DBControler: " + e);
		}
	}

	public ArrayList<Opositor> dameOpositores() {
		ArrayList<Opositor> opositores = new ArrayList<Opositor>();
		String sql = "SELECT * FROM opositor";
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				Opositor opo = new Opositor(rs.getString("nombre"), rs.getString("dni"), rs.getString("telefono"),
						rs.getString("ciudad"));
				opositores.add(opo);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en dameOpositores(): " + e);
		}

		return opositores;
	}

	public ArrayList<String> dameNombresOpositores() {
		ArrayList<String> nombres = new ArrayList<String>();

		String sql = "SELECT * FROM opositor";
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				String opo = rs.getString("nombre");
				nombres.add(opo);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en dameNombresOpositores(): " + e);
		}

		return nombres;
	}

	public ArrayList<String> dameNombresComaOpositores() {
		ArrayList<String> nombres = new ArrayList<String>();

		String sql = "SELECT * FROM opositor";
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				String opo = rs.getString("nombre") + ", ";
				nombres.add(opo);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en dameNombresComaOpositores(): " + e);
		}

		return nombres;
	}

	public void dnisOpositoresArchivo() {
		ArrayList<String> nombres = new ArrayList<String>();

		String sql = "SELECT * FROM opositor";
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				String opo = rs.getString("dni");
				nombres.add(opo);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en dnisOpositoresArchivo(): " + e);
		}

		File file = new File("./ProyectoOpositores/dnisOpos.txt");
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(file, true));
			for (String s : nombres) {
				br.write(s);
				br.newLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error al crear archivo: " + e);
		}
	}
}
