package CriptoMonedas;

import java.util.ArrayList;

public class Main {

	public static boolean checkClient(Cliente cliente, ArrayList<Cliente> clientes) {
		for (Cliente c : clientes) {
			if (c.getDni().equals(cliente.getDni()))
				return true;
		}
		return false;
	}

	public static boolean checkCriptocoin(Criptomoneda criptomoneda, ArrayList<Criptomoneda> criptomonedas) {
		for (Criptomoneda c : criptomonedas) {
			if (c.getNombre().equals(criptomoneda.getNombre()))
				return true;
		}
		return false;
	}

	public static ArrayList<Operacion_cuenta> operationsIngreso(Cliente cliente) {
		ArrayList<Operacion_cuenta> operaciones = new ArrayList<Operacion_cuenta>();
		for (Cuenta_bancaria c : cliente.getCuentas()) {
			for (Operacion_cuenta o : c.getHistorial()) {
				if (o.getTipo_op().equals("Ingreso") && o.getValor() > 500)
					operaciones.add(o);
			}
		}
		return operaciones;
	}

	public static ArrayList<String> clientsBitcoin(ArrayList<Cliente> clientes) {
		ArrayList<String> clientesBitcoin = new ArrayList<String>();
		for (Cliente c : clientes) {
			for (L_billetera b : c.getBilletera().getLineas_b()) {
				if (b.getCriptomoneda().getNombre().equals("Bitcoin")) {
					clientesBitcoin.add(c.getDni());
					break;
				}
			}
		}
		return clientesBitcoin;
	}
}
