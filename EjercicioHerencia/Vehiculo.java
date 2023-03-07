package EjercicioHerencia;

public class Vehiculo {
	private String caballos;
	private String cilindradas;
	private String peso;
	private String precio;

	public Vehiculo() {
	}

	public Vehiculo(String caballos, String cilindradas, String peso, String precio) {
		this.caballos = caballos;
		this.cilindradas = cilindradas;
		this.peso = peso;
		this.precio = precio;
	}

	public String getCaballos() {
		return this.caballos;
	}

	public void setCaballos(String caballos) {
		this.caballos = caballos;
	}

	public String getCilindradas() {
		return this.cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}

	public String getPeso() {
		return this.peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vehiculo [caballos=" + caballos + ", cilindradas=" + cilindradas + ", peso=" + peso + ", precio="
				+ precio + "]";
	}
}
