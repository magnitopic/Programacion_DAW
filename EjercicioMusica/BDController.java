package EjercicioMusica;

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
		super();
		try {
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/musica20", "root", "");
		} catch (Exception e) {
			System.out.println("Error en Costructor DBControler: " + e);
		}
	}

	public ArrayList<Artista> getArtistas() {
		ArrayList<Artista> artistas = new ArrayList<Artista>();
		String sql = "SELECT * FROM artista";
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				Artista art = new Artista(rs.getString("dni"), rs.getString("nombre"));
				artistas.add(art);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en getArtistas(): " + e);
		}
		return artistas;
	}

	public ArrayList<Cancion> getCanciones() {
		ArrayList<Cancion> canciones = new ArrayList<Cancion>();
		String sql = "SELECT * FROM cancion";
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				Cancion can = new Cancion(rs.getString("cod"), rs.getString("titulo"), rs.getString("duracion"));
				canciones.add(can);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en getCanciones(): " + e);
		}
		return canciones;
	}

	public ArrayList<Disco> getDiscos() {
		ArrayList<Disco> discos = new ArrayList<Disco>();
		String sql = "SELECT * FROM disco";
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				Disco dis = new Disco(rs.getString("cod"), rs.getString("titulo"), rs.getString("fecha"));
				discos.add(dis);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en getDiscos(): " + e);
		}
		return discos;
	}

	public ArrayList<Grupo> getGrupos() {
		ArrayList<Grupo> grupos = new ArrayList<Grupo>();
		String sql = "SELECT * FROM grupo";
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				Grupo gru = new Grupo(rs.getString("cod"), rs.getString("nombre"), rs.getString("fecha"),
						rs.getString("pais"));
				grupos.add(gru);
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en getGrupos(): " + e);
		}
		return grupos;
	}

	public void deleteCancion(String cod) {
		String sql = "DELETE FROM cancion WHERE cod = " + cod;
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			myStatement.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error en deleteCancion(): " + e);
		}
	}

	public void deleteArtista(String dni) {
		String sql = "DELETE FROM artista WHERE dni = " + dni;
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			myStatement.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error en deleteArtista(): " + e);
		}
	}

	public void insertArtista(String dniArtista, String nombreArtista) {
		String sql = "INSERT INTO artista (dni, nombre) VALUES ('" + dniArtista + "', '" + nombreArtista + "')";
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			myStatement.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error en insertArtista(): " + e);
		}
	}

	public void insertCancion(String codCancion, String tituloCancion, String duracionCancion) {
		String sql = "INSERT INTO cancion (cod, titulo, duracion) VALUES ('" + codCancion + "', '" + tituloCancion
				+ "', '" + duracionCancion + "')";
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			myStatement.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error en insertCancion(): " + e);
		}
	}

	public void insertGrupo(String codGrupo, String nombreGrupo, String fechaGrupo, String paisGrupo) {
		String sql = "INSERT INTO grupo (cod, nombre, fecha, pais) VALUES ('" + codGrupo + "', '" + nombreGrupo
				+ "', '" + fechaGrupo + "', '" + paisGrupo + "')";
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			myStatement.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error en insertGrupo(): " + e);
		}
	}

	// insert artista grupo
	public void insertArtistaGrupo(String dniArtista, String codGrupo) {
		String sql = "INSERT INTO artista_grupo (dni, cod) VALUES ('" + dniArtista + "', '" + codGrupo + "')";
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			myStatement.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error en insertArtistaGrupo(): " + e);
		}
	}

	// insert cancion disco
	public void insertCancionDisco(String codCancion, String codDisco) {
		String sql = "INSERT INTO cancion_disco (cod_cancion, cod_disco) VALUES ('" + codCancion + "', '" + codDisco
				+ "')";
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			myStatement.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error en insertCancionDisco(): " + e);
		}
	}

	// delete artista grupo
	public void deleteArtistaGrupo(String dniArtista, String codGrupo) {
		String sql = "DELETE FROM artista_grupo WHERE dni = " + dniArtista + " AND cod = " + codGrupo;
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			myStatement.executeUpdate(sql);
		} catch (Exception e) {
			System.out.println("Error en deleteArtistaGrupo(): " + e);
		}
	}

	// comprueba si existe en la BBDD
	// el artista
	public boolean existeArtista(String dni) {
		boolean existe = false;
		String sql = "SELECT * FROM artista WHERE dni = " + dni;
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			if (rs.next()) {
				existe = true;
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en existeArtista(): " + e);
		}
		return existe;
	}

	// la cancion
	public boolean existeCancion(String cod) {
		boolean existe = false;
		String sql = "SELECT * FROM cancion WHERE cod = " + cod;
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			if (rs.next()) {
				existe = true;
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en existeCancion(): " + e);
		}
		return existe;
	}

	// el grupo
	public boolean existeGrupo(String cod) {
		boolean existe = false;
		String sql = "SELECT * FROM grupo WHERE cod = " + cod;
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			if (rs.next()) {
				existe = true;
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en existeGrupo(): " + e);
		}
		return existe;
	}

	// el disco
	public boolean existeDisco(String cod) {
		boolean existe = false;
		String sql = "SELECT * FROM disco WHERE cod = " + cod;
		try {
			Statement myStatement = this.conexion.createStatement();
			// System.out.println(sql);
			ResultSet rs = myStatement.executeQuery(sql);
			if (rs.next()) {
				existe = true;
			}
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en existeDisco(): " + e);
		}
		return existe;
	}
}
