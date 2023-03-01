package EjercicioNBA;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private String division;
	private String conferencia;
	private String ciudad;
	private ArrayList<Jugador> jugadores;

	public Equipo() {
	}

	public Equipo(String nombre, String division, String conferencia, String ciudad) {
		this.nombre = nombre;
		this.division = division;
		this.conferencia = conferencia;
		this.ciudad = ciudad;
		this.jugadores = new ArrayList<Jugador>(); 
	}


	public Equipo(String nombre, String division, String conferencia, String ciudad, ArrayList<Jugador> jugadores) {
		this.nombre = nombre;
		this.division = division;
		this.conferencia = conferencia;
		this.ciudad = ciudad;
		this.jugadores = jugadores;
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


	public ArrayList<Jugador> getJugadores() {
		return this.jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}


	public void printData() {
		System.out.println("==========================");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Division: " + this.division);
		System.out.println("Conferencia: " + this.conferencia);
		System.out.println("Ciudad: " + this.ciudad);
	}

}
