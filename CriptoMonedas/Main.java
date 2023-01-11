package CriptoMonedas;

import java.util.ArrayList;

public class Main {

	public static boolean checkClient(Cliente cliente, ArrayList<Cliente> clientes) {
		for (Cliente c : clientes) {
			if (c.getDni().equalsIgnoreCase(cliente.getDni()))
				return true;
		}
		return false;
	}

	public static boolean checkCripto(String criptomoneda, ArrayList<Criptomoneda> criptomonedas) {
		for (Criptomoneda c : criptomonedas) {
			if (c.getNombre().equalsIgnoreCase(criptomoneda))
				return true;
		}
		return false;
	}

	public static ArrayList<Operacion_cuenta> operationsIngreso(Cliente cliente) {
		ArrayList<Operacion_cuenta> operaciones = new ArrayList<Operacion_cuenta>();
		for (Cuenta_bancaria c : cliente.getCuentas()) {
			for (Operacion_cuenta o : c.getHistorial()) {
				if (o.getTipo_op().equalsIgnoreCase("Ingreso") && o.getValor() > 500)
					operaciones.add(o);
			}
		}
		return operaciones;
	}

	public static ArrayList<String> clientsBitcoin(ArrayList<Cliente> clientes) {
		ArrayList<String> clientesBitcoin = new ArrayList<String>();
		for (Cliente c : clientes) {
			for (L_billetera b : c.getBilletera().getLineas_b()) {
				if ((b.getCriptomoneda().getNombre().equalsIgnoreCase("Bitcoin"))
						&& (b.getCriptomoneda().getValor_e() > 35000)) {
					clientesBitcoin.add(c.getDni());
					break;
				}
			}
		}
		return clientesBitcoin;
	}

	public static ArrayList<Double> unidadesdeMonedas(Cliente cliente) {
		ArrayList<Double> unidades = new ArrayList<Double>();
		for (L_billetera b : cliente.getBilletera().getLineas_b())
			unidades.add(b.getUnidades());
		return unidades;
	}

	public static Billetera maxUnitOfMaxCripto(ArrayList<Billetera> billeteras, ArrayList<Criptomoneda> criptomonedas) {
		// Se necesita saber la criptomenda con mayor valor
		Criptomoneda max = criptomonedas.get(0);

		for (Criptomoneda c : criptomonedas) {
			if (c.getValor_e() > max.getValor_e())
				max = c;
		}
		// Ahora podemos sacar la billetera con más unidades de la criptomoneda con
		// mayor valor
		Billetera maxB = billeteras.get(0);

		for (Billetera b : billeteras) {
			for (L_billetera l : b.getLineas_b()) {
				if (l.getCriptomoneda().getNombre().equalsIgnoreCase(max.getNombre())) {
					if (l.getUnidades() > maxB.getLineas_b().get(0).getUnidades())
						maxB = b;
				}
			}
		}
		return maxB;
	}

	public static ArrayList<String> name(ArrayList<Cliente> clientes) {
		ArrayList<String> nombres = new ArrayList<String>();

		for (Cliente c : clientes) {
			for (L_billetera l:  c.getBilletera().getLineas_b()){
				if (c.getBilletera().getLineas_b().getCriptomoneda())
				
			}
				nombres.add(c.getNombre());
		}

		return nombres;
	}
}
