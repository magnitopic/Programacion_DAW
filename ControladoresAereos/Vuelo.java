package ControladoresAereos;

public class Vuelo {
	private int nVuelo;
	private String ciudadDest;
	private double precio;

	public Vuelo() {
	}

	public Vuelo(int nVuelo, String ciudadDest, double precio) {
		this.nVuelo = nVuelo;
		this.ciudadDest = ciudadDest;
		this.precio = precio;
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

	public void showData() {
		System.out.println("Numero de vuelo: " + this.nVuelo);
		System.out.println("Ciudad de destino: " + this.ciudadDest);
		System.out.println("Precio: " + this.precio);
	}
}
