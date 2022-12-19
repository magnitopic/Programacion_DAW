package Examen3;

public class Avion {

	private String modelo;
	private int capacidad_pasajeros;
	private String matricula;
	private double capacidad_deposito;
	private int año_fabricacion;

	public Avion() {
	}

	public Avion(String modelo, int capacidad_pasajeros, String matricula, double capacidad_deposito,
			int año_fabricacion) {
		this.modelo = modelo;
		this.capacidad_pasajeros = capacidad_pasajeros;
		this.matricula = matricula;
		this.capacidad_deposito = capacidad_deposito;
		this.capacidad_deposito = capacidad_deposito;

	}

	public Avion(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidad_pasajeros() {
		return capacidad_pasajeros;
	}

	public void setCapacidad_pasajeros(int capacidad_pasajeros) {
		this.capacidad_pasajeros = capacidad_pasajeros;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getCapacidad_deposito() {
		return capacidad_deposito;
	}

	public void setCapacidad_deposito(double capacidad_deposito) {
		this.capacidad_deposito = capacidad_deposito;
	}

	public int getAño_fabricacion() {
		return año_fabricacion;
	}

	public void setAño_fabricacion(int año_fabricacion) {
		this.año_fabricacion = año_fabricacion;
	}

	public void mostrarDatosAvion() {
		System.out.println("****************************************\n* Modelo Avion: " + this.modelo
				+ "\n* Capacidad: " + this.capacidad_pasajeros + " pasajeros" + "\n* Matricula: " + this.matricula
				+ "\n* Capacidad Deposito: " + this.capacidad_deposito + " litros" + "\nAño de Fabricación: "
				+ this.año_fabricacion + "\n*" + "\n****************************************");
		System.out.println("El comandante que pilota el avion es:");
	}
}
