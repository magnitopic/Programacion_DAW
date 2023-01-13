package TiendaVideojuegos;

import java.util.ArrayList;

public class Videojuego {
	private String nombre;
	private String categoria;
	private ArrayList<Personaje> personajes;

	public Videojuego() {
	}

	public Videojuego(String nombre, String categoria, ArrayList<Personaje> personajes) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.personajes = personajes;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Personaje> getPersonajes() {
		return this.personajes;
	}

	public void setPersonajes(ArrayList<Personaje> personajes) {
		this.personajes = personajes;
	}

}
