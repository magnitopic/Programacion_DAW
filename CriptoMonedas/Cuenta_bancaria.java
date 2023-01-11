package CriptoMonedas;

import java.util.ArrayList;

public class Cuenta_bancaria {
	private String n_cuenta;
	private Cliente propietario;
	private double saldo;
	private ArrayList<Operacion_cuenta> historial;

	public Cuenta_bancaria() {
	}

	public Cuenta_bancaria(String n_cuenta, Cliente propietario, double saldo, ArrayList<Operacion_cuenta> historial) {
		this.n_cuenta = n_cuenta;
		this.propietario = propietario;
		this.saldo = saldo;
		this.historial = historial;
	}

	public String getN_cuenta() {
		return this.n_cuenta;
	}

	public void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
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

	public ArrayList<Operacion_cuenta> getHistorial() {
		return this.historial;
	}

	public void setHistorial(ArrayList<Operacion_cuenta> historial) {
		this.historial = historial;
	}

	public double valOperaEu() {
		double total = 0;
		for (Operacion_cuenta l : this.historial) {
			total += l.getValor();
		}
		return total;
	}

}
