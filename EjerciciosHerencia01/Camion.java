package EjerciciosHerencia01;

public class Camion extends Vehiculo {
	private String ejes;

	public Camion() {
		super();
	}

	public Camion(String caballos, String cilindradas, String peso, String precio, String ejes) {
		super(caballos, cilindradas, peso, precio);
		this.ejes = ejes;
	}

	public Camion(String ejes) {
		this.ejes = ejes;
	}

	public String getEjes() {
		return this.ejes;
	}

	public void setEjes(String ejes) {
		this.ejes = ejes;
	}

	public Camion ejes(String ejes) {
		setEjes(ejes);
		return this;
	}

	@Override
	public String toString() {
		return "Camion [ejes=" + ejes + ", caballos=" + super.getCaballos() + ", cilindradas=" + super.getCilindradas()
				+ ", peso=" + super.getPeso() + ", precio=" + super.getPrecio() + "]";
	}

}
