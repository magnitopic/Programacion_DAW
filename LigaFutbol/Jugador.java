package LigaFutbol;

public class Jugador {

	private String nombre;
	private String apellidos;
	private String fecha_n;
	private Estadistica datos;
	private String posicion;
	private String DNI;

	public Jugador() {
		super();
	}

	public Jugador(String nombre, String apellidos, String fecha_n, Estadistica datos, String posicion, String DNI) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_n = fecha_n;
		this.datos = datos;
		this.posicion = posicion;
		this.DNI = DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFecha_n() {
		return fecha_n;
	}

	public void setFecha_n(String fecha_n) {
		this.fecha_n = fecha_n;
	}

	public Estadistica getDatos() {
		return datos;
	}

	public void setDatos(Estadistica datos) {
		this.datos = datos;
	}

	public String getPosicion() {
		return this.posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getDNI() {
		return this.DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_n=" + fecha_n + ", datos=" + datos
				+ "]";
	}

}