package ControladoresAereos;

public class Aerolinea {
	private String nombre;
	private String paisOrigen;

	public Aerolinea() {
	}

	public Aerolinea(String nombre, String paisOrigen) {
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaisOrigen() {
		return this.paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public void showData() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Pais de origen: " + this.paisOrigen);
	}
}
