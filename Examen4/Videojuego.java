package Examen4;

import java.util.ArrayList;

public class Videojuego {
	private String nombre;
	private String pais_origen;
	private ArrayList<Personaje> personajes;

	public Videojuego() {
		super();
	}

	public Videojuego(String nombre, String pais_origen, ArrayList<Personaje> personajes) {
		super();
		this.nombre = nombre;
		this.pais_origen = pais_origen;
		this.personajes = personajes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais_origen() {
		return pais_origen;
	}

	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}

	public ArrayList<Personaje> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(ArrayList<Personaje> personajes) {
		this.personajes = personajes;
	}

}