package EjercicioNBA;

public class Equipo {
	private String nombre;
	private String division;
	private String conferencia;
	private String ciudad;

	public Equipo() {
	}

	public Equipo(String nombre, String division, String conferencia, String ciudad) {
		this.nombre = nombre;
		this.division = division;
		this.conferencia = conferencia;
		this.ciudad = ciudad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getConferencia() {
		return this.conferencia;
	}

	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void printData() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Division: " + this.division);
		System.out.println("Conferencia: " + this.conferencia);
		System.out.println("Ciudad: " + this.ciudad);
	}

}
