package ControladoresAereos2;

public class Vuelo {
	private int nVuelo;
	private String ciudadDest;
	private double precio;
	private Pasajero[] pasajeros;

	public Vuelo() {
	}

	public Vuelo(int nVuelo, String ciudadDest, double precio, Pasajero[] pasajeros) {
		this.nVuelo = nVuelo;
		this.ciudadDest = ciudadDest;
		this.precio = precio;
		this.pasajeros = pasajeros;
	}

	public int getNVuelo() {
		return this.nVuelo;
	}

	public void setNVuelo(int nVuelo) {
		this.nVuelo = nVuelo;
	}

	public String getCiudadDest() {
		return this.ciudadDest;
	}

	public void setCiudadDest(String ciudadDest) {
		this.ciudadDest = ciudadDest;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pasajero[] getPasajeros() {
		return this.pasajeros;
	}

	public void setPasajeros(Pasajero[] pasajeros) {
		this.pasajeros = pasajeros;
	}

	public void showData() {
		System.out.println("Numero de vuelo: " + this.nVuelo);
		System.out.println("Ciudad de destino: " + this.ciudadDest);
		System.out.println("Precio: " + this.precio);
	}

	public void mostrarDatosPasaje() {
		for (int i = 0; i < this.pasajeros.length; i++)
			this.pasajeros[i].showData();
	}
}
