
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
			this.conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Musica20", "root", "");
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

	public boolean cancionExists(String titulo) {
		String sql = "select * from cancion where titulo ='" + titulo + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			if (rs.next())
				return true;
			else
				return false;
		} catch (Exception e) {
			System.out.println("Error en cancionExists(): " + e);
		}
		return false;
	}

	public ArrayList<Disco> getDiscosWhereSong(String titulo) {
		ArrayList<Disco> discos = new ArrayList<Disco>();
		String sql = "select disco.* from disco, esta, cancion where cancion.titulo='" + titulo
				+ "' and cancion.cod=esta.can and esta.cod = disco.cod group by disco.nombre";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				discos.add(new Disco(rs.getString(1), rs.getString(2), rs.getString(3)));
			}
			myStatement.close();
		} catch (Exception e) {
			System.out.println("Error en getDiscosWhereSong(): " + e);
		}
		return discos;
	}

	public String getCompaniaData() {
		ArrayList<String> nombreCompanias = new ArrayList<String>();
		String data = "";
		String sql = "select * from companyia, disco where disco.cod_comp = companyia.cod order by disco.fecha";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				if (!nombreCompanias.contains(rs.getString(2))) {
					data += rs.getString(1) + ";" + rs.getString(2) + ";" + rs.getString(3) + ";" + rs.getString(4)
							+ ";" + rs.getString(5) + rs.getString(6) + ";" + rs.getString(7) + ";" + rs.getString(8)
							+ ";" + rs.getString(9) + ";" + rs.getString(10) + "\n";
					nombreCompanias.add(rs.getString(2));
				}

			}
			myStatement.close();
		} catch (Exception e) {
			System.out.println("Error en getCompaniaData(): " + e);
		}
		return data;
	}

	public String artistaMaxGrupos() {
		String sql = "select artista.nombre, count(grupo.nombre) from artista, grupo, pertenece where artista.dni=pertenece.dni and pertenece.cod=grupo.cod group by artista.nombre";
		String nombreArtista = "";
		int maxGrupos = 0;
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				if (rs.getInt(2) > maxGrupos) {
					nombreArtista = rs.getString(1);
					maxGrupos = rs.getInt(2);
				}
			}
			myStatement.close();
		} catch (Exception e) {
			System.out.println("Error en artistaMaxGrupos(): " + e);
		}
		String grupos = "";
		sql = "select grupo.nombre from artista, pertenece, grupo where artista.dni=pertenece.dni and pertenece.cod=grupo.cod and artista.nombre='"
				+ nombreArtista + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				grupos += rs.getString(1) + " ";
			}
			myStatement.close();
		} catch (Exception e) {
			System.out.println("Error en artistaMaxGrupos(): " + e);
		}
		return "Artista: " + nombreArtista + " - Grupos: " + grupos;
	}

	public ArrayList<Listado> getListado() {
		String sql = "select disco.nombre, disco.cod_gru, companyia.nombre from companyia, disco where disco.cod_comp = companyia.cod order by disco.nombre;";
		ArrayList<Listado> listadoDatos = new ArrayList<Listado>();
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			while (rs.next()) {
				listadoDatos.add(new Listado(rs.getString(1), getNombreGrupo(rs.getString(2)), rs.getString(3)));
			}
			myStatement.close();
		} catch (Exception e) {
			System.out.println("Error en getListado(): " + e);
		}
		return listadoDatos;
	}

	public String getNombreGrupo(String cod) {
		String nombre = "";
		String sql = "select nombre from grupo where cod ='" + cod + "'";
		try {
			Statement myStatement = this.conexion.createStatement();
			ResultSet rs = myStatement.executeQuery(sql);
			rs.next();
			nombre = rs.getString(1);
			rs.close();
		} catch (Exception e) {
			System.out.println("Error en getNombreGrupo(): " + e);
		}
		return nombre;
	}
}