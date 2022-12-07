package Aerolineas;

public class Avion {
	private String modelo;
	private int capacidad;
	private String matricula;
	private double capacidadDepo;
	private int yearFabrication;
	private Comandante comandante;

	public Avion() {
	}

	public Avion(String matricula) {
		this.matricula = matricula;
	}

	public Avion(String modelo, int capacidad, String matricula, double capacidadDepo, int yearFabrication,
			Comandante comandante) {
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.matricula = matricula;
		this.capacidadDepo = capacidadDepo;
		this.yearFabrication = yearFabrication;
		this.comandante = comandante;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getCapacidadDepo() {
		return this.capacidadDepo;
	}

	public void setCapacidadDepo(double capacidadDepo) {
		this.capacidadDepo = capacidadDepo;
	}

	public int getYearFabrication() {
		return this.yearFabrication;
	}

	public void setYearFabrication(int yearFabrication) {
		this.yearFabrication = yearFabrication;
	}

	public Comandante getComandante() {
		return this.comandante;
	}

	public void setComandante(Comandante comandante) {
		this.comandante = comandante;
	}

	public void mostrarDatosAvion() {
		for (int i = 0; i < 40; i++)
			System.out.print("*");
		System.out.println("\n*	Modelo Avión: " + this.modelo);
		System.out.println("*	Capacidad: " + this.capacidad + " pasajeros.");
		System.out.println("*	Matrícula: " + this.matricula);
		System.out.println("*	Capacidad depósito: " + this.capacidadDepo + " litros.");
		System.out.println("*	Comandante: ");
		this.comandante.mostrarDatosComandante();
		System.out.println("*	Año de fabricación: " + this.yearFabrication);
		for (int i = 0; i < 40; i++)
			System.out.print("*");
		System.out.print("\n");
	}

}
