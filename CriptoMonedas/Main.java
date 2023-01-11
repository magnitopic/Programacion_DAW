package CriptoMonedas;

import java.util.ArrayList;
import java.util.List;

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

	public static ArrayList<String> mostCriptoValue(ArrayList<Cliente> clientes) {
		String nameClient = "";
		String nameCripto = "";
		double maxValue = 0;

		for (Cliente c : clientes) {
			for (L_billetera l : c.getBilletera().getLineas_b()) {
				if (l.getCriptomoneda().getValor_e() > maxValue) {
					maxValue = l.getCriptomoneda().getValor_e();
					nameClient = c.getNombre();
					nameCripto = l.getCriptomoneda().getNombre();
				}
			}
		}

		return new ArrayList<String>(List.of(nameClient, nameCripto));
	}

	public static ArrayList<Cliente> maxWalletLines(ArrayList<Cliente> clientes) {
		ArrayList<Cliente> maxLines = new ArrayList<Cliente>();
		maxLines.add(clientes.get(0));
		for (Cliente c : clientes) {
			if (c.getBilletera().getLineas_b().size() > maxLines.get(0).getBilletera().getLineas_b().size()) {
				maxLines.clear();
				maxLines.add(c);
			}
			if (c.getBilletera().getLineas_b().size() == maxLines.get(0).getBilletera().getLineas_b().size())
				maxLines.add(c);
		}
		return maxLines;
	}

	public static ArrayList<Cliente> maxTransactionsClient(ArrayList<Cliente> clientes) {
		ArrayList<Cliente> maxTransactions = new ArrayList<Cliente>();
		maxTransactions.add(clientes.get(0));
		double maxValue = 0;
		for (Cliente c : clientes) {
			// Recorremos las cuentas del cliente
			for (Cuenta_bancaria b : c.getCuentas()) {
				// La variable que almacenará el dinero que ha movido el cliente se resetea en
				// cada cuenta ya que solo se considera la cuenta más alta del cliente y no la
				// suma de sus cuentas
				double clienteMoved = 0;
				// Contamos el dinero que ha movido el cliente
				for (Operacion_cuenta o : b.getHistorial())
					clienteMoved += o.getValor();
				// Si el cliente ha movido más dinero que el máximo, lo actualizamos
				if (clienteMoved > maxValue) {
					maxTransactions.clear();
					maxTransactions.add(c);
					maxValue = clienteMoved;
				}
				if (clienteMoved == maxValue)
					maxTransactions.add(c);
			}
		}
		return maxTransactions;
	}

	public static void buyCripto(Cliente cliente, String nombreCripto, int numUnidades,
			ArrayList<Criptomoneda> criptomonedas, ArrayList<Cliente> clientes) {
		// Comprobamos que el cliente y la criptomoneda existen
		if (!checkClient(cliente, clientes) || !checkCripto(nombreCripto, criptomonedas))
			return;
		// Buscamos la criptomoneda
		Criptomoneda cripto = null;
		for (Criptomoneda c : criptomonedas) {
			if (c.getNombre().equalsIgnoreCase(nombreCripto)) {
				cripto = c;
				break;
			}
		}
		// Comprobamos que el cliente tiene suficiente saldo
		if (cliente.getBilletera().getLineas_b().size() >= numUnidades * cripto.getValor_e())
			cliente.getBilletera().getLineas_b().add(new L_billetera(cripto, numUnidades));
	}
}
