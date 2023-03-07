package EjercicioHerencia;

public class Bus extends Vehiculo {
	private String plazas;

	public Bus(String plazas) {
		this.plazas = plazas;
	}

	public Bus(String caballos, String cilindradas, String peso, String precio, String plazas) {
		super(caballos, cilindradas, peso, precio);
		this.plazas = plazas;
	}

	public String getPlazas() {
		return this.plazas;
	}

	public void setPlazas(String plazas) {
		this.plazas = plazas;
	}

	@Override
	public String toString() {
		return "Bus [plazas=" + plazas + ", caballos=" + super.getCaballos() + ", cilindradas=" + super.getCilindradas()
				+ ", peso=" + super.getPeso() + ", precio=" + super.getPrecio() + "]";
	}

}
