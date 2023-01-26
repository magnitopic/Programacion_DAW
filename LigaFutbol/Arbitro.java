package LigaFutbol;

public class Arbitro {
	private String nombre;
	private String apellidos;
	private String fecha_n;
	private String DNI;
	private int edad;
	private int antiguedad;

	public Arbitro() {
	}

	public Arbitro(String nombre, String apellidos, String fecha_n, int edad, int antiguedad, String DNI) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_n = fecha_n;
		this.edad = edad;
		this.antiguedad = antiguedad;
		this.DNI = DNI;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFecha_n() {
		return this.fecha_n;
	}

	public void setFecha_n(String fecha_n) {
		this.fecha_n = fecha_n;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAntiguedad() {
		return this.antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getDNI() {
		return this.DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

}
