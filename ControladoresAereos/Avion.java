package ControladoresAereos;

public class Avion {
	private String marca;
	private String modelo;
	private double capacidadDepo;
	private int catPasajeros;
	private String matricula;

	public Avion() {
	}

	public Avion(String marca, String modelo, double capacidadDepo, int catPasajeros, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.capacidadDepo = capacidadDepo;
		this.catPasajeros = catPasajeros;
		this.matricula = matricula;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCapacidadDepo() {
		return this.capacidadDepo;
	}

	public void setCapacidadDepo(double capacidadDepo) {
		this.capacidadDepo = capacidadDepo;
	}

	public int getCatPasajeros() {
		return this.catPasajeros;
	}

	public void setCatPasajeros(int catPasajeros) {
		this.catPasajeros = catPasajeros;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void showData() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Capacidad depósito: " + this.capacidadDepo);
		System.out.println("Cantidad pasajeros: " + this.catPasajeros);
		System.out.println("Matricula: " + this.matricula);
	}
}
