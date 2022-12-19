package Examen3;

public class Vuelo {

	private int cod_vuelo;
	private Avion avion;
	private Pasajero[] pasajeros;
	private Aeropuerto aeropuerto_salida;
	private Aeropuerto aeropuerto_llegada;

	public Vuelo() {
	}

	public Vuelo(int cod_vuelo, Avion avion, Pasajero[] pasajeros, Aeropuerto aeropuerto_salida,
			Aeropuerto aeropuerto_llegada) {
		super();
		this.cod_vuelo = cod_vuelo;
		this.avion = avion;
		this.pasajeros = pasajeros;
		this.aeropuerto_salida = aeropuerto_salida;
		this.aeropuerto_llegada = aeropuerto_llegada;
	}

	public Vuelo(int cod_vuelo) {
		this.cod_vuelo = cod_vuelo;
	}

	public int getCod_vuelo() {
		return cod_vuelo;
	}

	public void setCod_vuelo(int cod_vuelo) {
		this.cod_vuelo = cod_vuelo;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Pasajero[] getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Pasajero[] pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Aeropuerto getAeropuerto_salida() {
		return aeropuerto_salida;
	}

	public void setAeropuerto_salida(Aeropuerto aeropuerto_salida) {
		this.aeropuerto_salida = aeropuerto_salida;
	}

	public Aeropuerto getAeropuerto_llegada() {
		return aeropuerto_llegada;
	}

	public void setAeropuerto_llegada(Aeropuerto aeropuerto_llegada) {
		this.aeropuerto_llegada = aeropuerto_llegada;
	}

	public void mostrarDatosVuelo() {
		System.out.println(
				"****************************************\n* Vuelo: " + this.cod_vuelo + "\n* Aeropuerto Salida: "
						+ this.aeropuerto_salida + "\n* Aeropuerto llegada: " + this.aeropuerto_salida);
		System.out.println("Lista de Pasajeros: ");
		for (int i = 0; i < this.pasajeros.length; i++) {
			System.out.print(pasajeros[i].getNombre() + ", ");
		}
		System.out.println("* \n****************************************");
		System.out.println("Los datos del avion son:");
		this.avion.mostrarDatosAvion();
		System.out.println("El aeropuerto de salida es:");
		this.aeropuerto_salida.mostrarDatosAeropuerto();
		System.out.println("El aeropuerto de llegada es:");
		this.aeropuerto_llegada.mostrarDatosAeropuerto();
	}
}
