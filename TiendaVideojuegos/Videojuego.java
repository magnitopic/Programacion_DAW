package TiendaVideojuegos;

import java.util.ArrayList;

public class Videojuego {
	private String nombre;
	private String categoria;
	private ArrayList<Personaje> personajes;
	private Compannia compannia;

	public Videojuego() {
	}

	public Videojuego(String nombre, String categoria, ArrayList<Personaje> personajes, Compannia compannia) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.personajes = personajes;
		this.compannia = compannia;
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

	public Compannia getCompannia() {
		return this.compannia;
	}

	public void setCompannia(Compannia compannia) {
		this.compannia = compannia;
	}

	/**
	 * Ejercicio 6
	 * 
	 * @param letra
	 * @return los personajes que empiezan y terminan con la letra dada
	 */
	public ArrayList<Personaje> personajeNombreLetra(char letra) {
		ArrayList<Personaje> personajesLetra = new ArrayList<Personaje>();
		for (Personaje personaje : personajes) {
			if (personaje.getNombre().charAt(0) == letra
					&& personaje.getNombre().charAt(personaje.getNombre().length() - 1) == letra) {
				personajesLetra.add(personaje);
			}
		}
		return personajesLetra;
	}

}
