package EjercicioMusica;

import java.util.ArrayList;

public class Disco {
	private String cod;
	private String nombre;
	private String fecha;
	private ArrayList<Cancion> discos;

	public Disco() {
	}

	public Disco(String cod, String nombre, String fecha, ArrayList<Cancion> discos) {
		this.cod = cod;
		this.nombre = nombre;
		this.fecha = fecha;
		this.discos = discos;
	}

	public String getCod() {
		return this.cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public ArrayList<Cancion> getDiscos() {
		return this.discos;
	}

	public void setDiscos(ArrayList<Cancion> discos) {
		this.discos = discos;
	}

	public void showData() {
		System.out.println("Código: " + this.cod);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Fecha: " + this.fecha);
		System.out.println("=====================================");
	}
}
