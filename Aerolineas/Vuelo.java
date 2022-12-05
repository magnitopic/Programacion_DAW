package Aerolineas;

public class Vuelo {
	private int cod_vuelo;
	private Avion avion;
	private Pasajero[] pasajeros;
	private Aeropuerto aeropuerto_salida;
	private Aeropuerto aeropuerto_llegada;

	public Vuelo() {
	}

	public Vuelo(int cod_vuelo) {
		this.cod_vuelo = cod_vuelo;
	}

	public Vuelo(int cod_vuelo, Avion avion, Pasajero[] pasajeros, Aeropuerto aeropuerto_salida,
			Aeropuerto aeropuerto_llegada) {
		this.cod_vuelo = cod_vuelo;
		this.avion = avion;
		this.pasajeros = pasajeros;
		this.aeropuerto_salida = aeropuerto_salida;
		this.aeropuerto_llegada = aeropuerto_llegada;
	}

	public int getCod_vuelo() {
		return this.cod_vuelo;
	}

	public void setCod_vuelo(int cod_vuelo) {
		this.cod_vuelo = cod_vuelo;
	}

	public Avion getAvion() {
		return this.avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Pasajero[] getPasajeros() {
		return this.pasajeros;
	}

	public void setPasajeros(Pasajero[] pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Aeropuerto getAeropuerto_salida() {
		return this.aeropuerto_salida;
	}

	public void setAeropuerto_salida(Aeropuerto aeropuerto_salida) {
		this.aeropuerto_salida = aeropuerto_salida;
	}

	public Aeropuerto getAeropuerto_llegada() {
		return this.aeropuerto_llegada;
	}

	public void setAeropuerto_llegada(Aeropuerto aeropuerto_llegada) {
		this.aeropuerto_llegada = aeropuerto_llegada;
	}

	public void mostrarDatosVuelo() {
		for (int i = 0; i < 40; i++)
			System.out.print("*");
		System.out.println("\n*	Vuelo: " + this.cod_vuelo);
		System.out.println("*	Aeropurto de salida: " + this.aeropuerto_salida);
		System.out.println("*	Aeropuerto de llegada: " + this.aeropuerto_llegada);
		System.out.print("*	Lista de pasajeros:	");
		for (int i = 0; i < this.pasajeros.length; i++)
			System.out.println(pasajeros[i].getNombre() + ", ");
		for (int i = 0; i < 40; i++)
			System.out.print("*");
		System.out.print("\n");
	}
}
