package CriptoMonedas;

public class Criptomoneda {
	private String nombre;
	private double valor_e;
	private double valor_d;
	private double capitalizacion;

	public Criptomoneda() {
	}

	public Criptomoneda(String nombre, double valor_e, double valor_d, double capitalizacion) {
		this.nombre = nombre;
		this.valor_e = valor_e;
		this.valor_d = valor_d;
		this.capitalizacion = capitalizacion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor_e() {
		return this.valor_e;
	}

	public void setValor_e(double valor_e) {
		this.valor_e = valor_e;
	}

	public double getValor_d() {
		return this.valor_d;
	}

	public void setValor_d(double valor_d) {
		this.valor_d = valor_d;
	}

	public double getCapitalizacion() {
		return this.capitalizacion;
	}

	public void setCapitalizacion(double capitalizacion) {
		this.capitalizacion = capitalizacion;
	}

}
