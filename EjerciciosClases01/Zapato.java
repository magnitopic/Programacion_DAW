package EjerciciosClases01;

public class Zapato {
	private double talla;
	private String marca;
	private String color;
	private double precio;

	public Zapato(double talla, String marca, String color, double precio) {
		this.talla = talla;
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}

	public double getTalla() {
		return this.talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
