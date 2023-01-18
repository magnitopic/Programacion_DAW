package EjerciciosClases01;

public class Estrella_fugaz {
	private String origen;
	private String lugar;
	private String color;

	public Estrella_fugaz(String origen, String lugar, String color) {
		this.origen = origen;
		this.lugar = lugar;
		this.color = color;
	}

	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
