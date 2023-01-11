package CriptoMonedas;

import java.util.ArrayList;

public class Billetera {
	private String n_billetera;
	private Cliente propietario;
	private double saldo;
	private ArrayList<L_billetera> lineas_b;

	public Billetera() {
	}

	public Billetera(String n_billetera, Cliente propietario, double saldo, ArrayList<L_billetera> lineas_b) {
		this.n_billetera = n_billetera;
		this.propietario = propietario;
		this.saldo = saldo;
		this.lineas_b = lineas_b;
	}

	public String getN_billetera() {
		return this.n_billetera;
	}

	public void setN_billetera(String n_billetera) {
		this.n_billetera = n_billetera;
	}

	public Cliente getPropietario() {
		return this.propietario;
	}

	public void setPropietario(Cliente propietario) {
		this.propietario = propietario;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<L_billetera> getLineas_b() {
		return this.lineas_b;
	}

	public void setLineas_b(ArrayList<L_billetera> lineas_b) {
		this.lineas_b = lineas_b;
	}

	public double totalValEu() {
		double total = 0;

		for (L_billetera l : this.lineas_b) {
			total += l.getUnidades() * l.getCriptomoneda().getValor_e();
		}

		return total;
	}
}
