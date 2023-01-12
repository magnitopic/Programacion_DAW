package CriptoMonedas;

public class L_billetera {
	private Criptomoneda criptomoneda;
	private double unidades;

	public L_billetera() {
	}

	public L_billetera(Criptomoneda criptomoneda, double unidades) {
		this.criptomoneda = criptomoneda;
		this.unidades = unidades;
	}

	public Criptomoneda getCriptomoneda() {
		return this.criptomoneda;
	}

	public void setCriptomoneda(Criptomoneda criptomoneda) {
		this.criptomoneda = criptomoneda;
	}

	public double getUnidades() {
		return this.unidades;
	}

	public void setUnidades(double unidades) {
		this.unidades = unidades;
	}

	/**
	 * Método 3
	 * 
	 * @return El valor de todas las criptomonedas en euros
	 */
	public double valDol() {
		return this.unidades * this.criptomoneda.getValor_d();
	}
}
