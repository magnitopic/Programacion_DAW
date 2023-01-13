package TiendaVideojuegos;

public class Linea_venta {
	private double importe;
	private Videojuego videojuego;
	private int unidades;

	public Linea_venta() {
	}

	public Linea_venta(double importe, Videojuego videojuego, int unidades) {
		this.importe = importe;
		this.videojuego = videojuego;
		this.unidades = unidades;
	}

	public double getImporte() {
		return this.importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Videojuego getVideojuego() {
		return this.videojuego;
	}

	public void setVideojuego(Videojuego videojuego) {
		this.videojuego = videojuego;
	}

	public int getUnidades() {
		return this.unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

}
