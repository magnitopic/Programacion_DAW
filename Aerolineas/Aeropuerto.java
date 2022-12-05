package Aerolineas;

public class Aeropuerto {
	private String nombre;
	private String ciudad;
	private int codigo_aeropuerto;
	private Avion[] aviones;

	public Aeropuerto() {
	}

	public Aeropuerto(int codigo_aeropuerto) {
		this.codigo_aeropuerto = codigo_aeropuerto;
	}

	public Aeropuerto(String nombre, String ciudad, int codigo_aeropuerto, Avion[] aviones) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.codigo_aeropuerto = codigo_aeropuerto;
		this.aviones = aviones;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getCodigo_aeropuerto() {
		return this.codigo_aeropuerto;
	}

	public void setCodigo_aeropuerto(int codigo_aeropuerto) {
		this.codigo_aeropuerto = codigo_aeropuerto;
	}

	public Avion[] getAviones() {
		return this.aviones;
	}

	public void setAviones(Avion[] aviones) {
		this.aviones = aviones;
	}

	public void mostrarDatosAeropuerto() {
		for (int i = 0; i < 40; i++)
			System.out.print("*");
		System.out.println("\n*	Aeropuerto: " + this.nombre);
		System.out.println("*	Ciudad: " + this.ciudad);
		System.out.println("*	Código: " + this.codigo_aeropuerto);
		System.out.println("*	Vuelos:	");
		for (int i = 0; i < this.aviones.length; i++) {
			System.out.println("\t- " + i);
			this.aviones[i].mostrarDatosAvion();
		}
		for (int i = 0; i < 40; i++)
			System.out.print("*");
		System.out.print("\n");
	}

	public void mostrarDatosCod(int valor) {
		if (this.codigo_aeropuerto < valor)
			mostrarDatosAeropuerto();
	}

}
