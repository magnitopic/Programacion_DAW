package EjerciciosHerencia01;

public class Coche extends Vehiculo {
	private String combustible;

	public Coche(String combustible) {
		this.combustible = combustible;
	}

	public Coche(String caballos, String cilindradas, String peso, String precio, String combustible) {
		super(caballos, cilindradas, peso, precio);
		this.combustible = combustible;
	}

	public String getCombustible() {
		return this.combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "Coche [combustible=" + combustible + ", caballos=" + super.getCaballos() + ", cilindradas="
				+ super.getCilindradas() + ", peso=" + super.getPeso() + ", precio=" + super.getPrecio() + "]";
	}

}
