package TiendaVideojuegos;

import java.util.ArrayList;

public class Compannia {
	private String nombre;
	private String pais_origen;
	private ArrayList<Videojuego> videojuegos;

	public Compannia() {
	}

	public Compannia(String nombre, String pais_origen, ArrayList<Videojuego> videojuegos) {
		this.nombre = nombre;
		this.pais_origen = pais_origen;
		this.videojuegos = videojuegos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais_origen() {
		return this.pais_origen;
	}

	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}

	public ArrayList<Videojuego> getVideojuegos() {
		return this.videojuegos;
	}

	public void setVideojuegos(ArrayList<Videojuego> videojuegos) {
		this.videojuegos = videojuegos;
	}

}
