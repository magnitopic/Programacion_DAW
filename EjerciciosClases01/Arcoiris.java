package EjerciciosClases01;

public class Arcoiris {
	private double duracion;
	private String lugar;
	private String valoracion;

	public Arcoiris(double duracion, String lugar, String valoracion) {
		this.duracion = duracion;
		this.lugar = lugar;
		this.valoracion = valoracion;
	}

	public double getDuracion() {
		return this.duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getValoracion() {
		return this.valoracion;
	}

	public void setValoracion(String valoracion) {
		this.valoracion = valoracion;
	}

}
