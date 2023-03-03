
public class Equipo {
	public String nombre;
	public String ciudad;
	public String conferencia;
	public String division;

	public Equipo() {
	}

	public Equipo(String nombre, String ciudad, String conferencia, String division) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.conferencia = conferencia;
		this.division = division;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getConferencia() {
		return conferencia;
	}

	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getData() {
		return (this.nombre + " - " + this.ciudad + " - " + this.conferencia + " - " + this.division + "\n");
	}

}
