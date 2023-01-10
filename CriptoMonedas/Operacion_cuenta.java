package CriptoMonedas;

public class Operacion_cuenta {
	private String tipo_op;
	private String fecha_op;
	private double valor;

	public Operacion_cuenta() {
	}

	public Operacion_cuenta(String tipo_op, String fecha_op, double valor) {
		this.tipo_op = tipo_op;
		this.fecha_op = fecha_op;
		this.valor = valor;
	}

	public String getTipo_op() {
		return this.tipo_op;
	}

	public void setTipo_op(String tipo_op) {
		this.tipo_op = tipo_op;
	}

	public String getFecha_op() {
		return this.fecha_op;
	}

	public void setFecha_op(String fecha_op) {
		this.fecha_op = fecha_op;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
