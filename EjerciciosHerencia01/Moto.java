package EjerciciosHerencia01;

public class Moto extends Vehiculo {
	public String cilindro;

	public Moto(String cilindro) {
		this.cilindro = cilindro;
	}

	public Moto(String caballos, String cilindradas, String peso, String precio, String cilindro) {
		super(caballos, cilindradas, peso, precio);
		this.cilindro = cilindro;
	}

	public String getCilindro() {
		return this.cilindro;
	}

	public void setCilindro(String cilindro) {
		this.cilindro = cilindro;
	}

	@Override
	public String toString() {
		return "Moto [cilindro=" + cilindro + ", caballos=" + super.getCaballos() + ", cilindradas=" + super.getCilindradas()
				+ ", peso=" + super.getPeso() + ", precio=" + super.getPrecio() + "]";
	}

}
