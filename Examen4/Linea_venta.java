package Examen4;

public class Linea_venta {
	private double importe;
	private Videojuego videojuego;
	private int unidades;

	public Linea_venta() {
		super();
	}

	public Linea_venta(double importe, Videojuego videojuego, int unidades) {
		super();
		this.importe = importe;
		this.videojuego = videojuego;
		this.unidades = unidades;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Videojuego getVideojuego() {
		return videojuego;
	}

	public void setVideojuego(Videojuego videojuego) {
		this.videojuego = videojuego;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

}