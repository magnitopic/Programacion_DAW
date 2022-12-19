package Examen3;

public class Aeropuerto {

	private String nombre;
	private String ciudad;
	private String codigo_aeropuerto;
	private Avion aviones[];

	public Aeropuerto() {

	}

	public Aeropuerto(String nombre, String ciudad, String codigo_aeropuerto, Avion aviones[]) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.codigo_aeropuerto = codigo_aeropuerto;
		this.aviones = aviones;
	}

	public Aeropuerto(String codigo_aeropuerto) {
		super();
		this.codigo_aeropuerto = codigo_aeropuerto;
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

	public String getCodigo_aeropuerto() {
		return codigo_aeropuerto;
	}

	public void setCodigo_aeropuerto(String codigo_aeropuerto) {
		this.codigo_aeropuerto = codigo_aeropuerto;
	}

	public Avion[] getAviones() {
		return aviones;
	}

	public void setAviones(Avion[] aviones) {
		this.aviones = aviones;
	}

	public void mostrarDatosAeropuerto() {
		System.out.println("****************************************\n* Nombre: " + this.nombre + "\n* Ciudad: "
				+ this.ciudad + "\n* Codigo: " + this.codigo_aeropuerto + "\n*"
				+ "\n****************************************");
		System.out.println("Los aviones del aereopuerto son: ");
		for (int i = 0; i < this.aviones.length; i++) {
			aviones[i].mostrarDatosAvion();
		}
	}
}
