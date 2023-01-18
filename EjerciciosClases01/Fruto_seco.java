package EjerciciosClases01;

public class Fruto_seco {
	private String nombre;
	private double calorias;
	private int grasas;
	private double precioKG;
	private String color;
	private boolean dulce;

	public Fruto_seco(String nombre, double calorias, int grasas, double precioKG, String color, boolean dulce) {
		this.nombre = nombre;
		this.calorias = calorias;
		this.grasas = grasas;
		this.precioKG = precioKG;
		this.color = color;
		this.dulce = dulce;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCalorias() {
		return this.calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public int getGrasas() {
		return this.grasas;
	}

	public void setGrasas(int grasas) {
		this.grasas = grasas;
	}

	public double getPrecioKG() {
		return this.precioKG;
	}

	public void setPrecioKG(double precioKG) {
		this.precioKG = precioKG;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isDulce() {
		return this.dulce;
	}

	public boolean getDulce() {
		return this.dulce;
	}

	public void setDulce(boolean dulce) {
		this.dulce = dulce;
	}

}