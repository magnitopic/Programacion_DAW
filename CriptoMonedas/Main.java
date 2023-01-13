package CriptoMonedas;

import java.util.ArrayList;

public class Main {

	/**
	 * Método 4
	 * 
	 * @param cliente
	 * @param clientes
	 * @return booleano que depende si se encuentra el cliente en la lista o no
	 */
	public static boolean checkClient(Cliente cliente, ArrayList<Cliente> clientes) {
		for (Cliente c : clientes) {
			if (c.getDni().equalsIgnoreCase(cliente.getDni()))
				return true;
		}
		return false;
	}

	/**
	 * Método 5
	 * 
	 * @param criptomoneda
	 * @param criptomonedas
	 * @return booleano que depende si se encuentra la criptomoneda en la lista o no
	 */
	public static boolean checkCripto(String criptomoneda, ArrayList<Criptomoneda> criptomonedas) {
		for (Criptomoneda c : criptomonedas) {
			if (c.getNombre().equalsIgnoreCase(criptomoneda))
				return true;
		}
		return false;
	}

	/**
	 * Método 6
	 * 
	 * @param cliente
	 * @return una lista de todas las operaciones de tipo "ingreso" y superiores a
	 *         500€
	 */
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

	/**
	 * Método 7
	 * 
	 * @param clientes
	 * @return una lista de DNIs de clientes que tengan más de 35000€ en Bitcoin
	 */
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

	/**
	 * Método 8
	 * 
	 * @param cliente
	 * @return una lista de las unidades de cada criptomoneda de la billetera de un
	 *         cliente
	 */
	public static ArrayList<Double> unidadesdeMonedas(Cliente cliente) {
		ArrayList<Double> unidades = new ArrayList<Double>();
		for (L_billetera b : cliente.getBilletera().getLineas_b())
			unidades.add(b.getUnidades());
		return unidades;
	}

	/**
	 * Método 9
	 * 
	 * @param billeteras
	 * @param criptomonedas
	 * @return la billetera con más unidades de la criptomoneda con más valor
	 */
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

	/**
	 * Método 10
	 * 
	 * @param clientes
	 * @return el nombre nombre del cliente y la criptomoneda con mayor valor
	 */
	public static String mostCriptoValue(ArrayList<Cliente> clientes) {
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

		return nameClient + " " + nameCripto;
	}

	/**
	 * Método 11
	 * 
	 * @param clientes
	 * @return una lista con los clientes que tengan más lineas de billetera
	 */
	public static ArrayList<Cliente> maxWalletLines(ArrayList<Cliente> clientes) {
		ArrayList<Cliente> maxLines = new ArrayList<Cliente>();
		for (Cliente c : clientes) {
			if (maxLines.size() == 0
					|| c.getBilletera().getLineas_b().size() == maxLines.get(0).getBilletera().getLineas_b().size())
				maxLines.add(c);
			if (c.getBilletera().getLineas_b().size() > maxLines.get(0).getBilletera().getLineas_b().size()) {
				maxLines.clear();
				maxLines.add(c);
			}
		}
		return maxLines;
	}

	/**
	 * Método 12
	 * 
	 * @param clientes
	 * @return una lista con los clientes que hayan movido más dinero en
	 *         transacciones
	 */
	public static ArrayList<Cliente> maxTransactionsClient(ArrayList<Cliente> clientes) {
		ArrayList<Cliente> maxTransactions = new ArrayList<Cliente>();
		double maxValue = 0;
		for (Cliente c : clientes) {
			// Recorremos las cuentas del cliente
			double clienteMoved = 0;
			for (Cuenta_bancaria b : c.getCuentas()) {
				// Contamos el dinero que ha movido el cliente
				for (Operacion_cuenta o : b.getHistorial())
					clienteMoved += o.getValor();
			}
			// Si el cliente ha movido más dinero que el máximo, lo actualizamos
			if (maxTransactions.size() == 0 || clienteMoved == maxValue)
				maxTransactions.add(c);
			if (clienteMoved > maxValue) {
				maxTransactions.clear();
				maxTransactions.add(c);
				maxValue = clienteMoved;
			}
		}
		return maxTransactions;
	}

	/**
	 * Método 13 - Realiza una acción de compara de una criptomoneda
	 * 
	 * @param cliente
	 * @param nombreCripto
	 * @param numUnidades
	 * @param criptomonedas
	 * @param clientes
	 */
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
		if (cliente.getBilletera().getLineas_b().size() >= numUnidades * cripto.getValor_e()) {
			double saldo = cliente.getBilletera().getSaldo();
			cliente.getBilletera().setSaldo(saldo - numUnidades * cripto.getValor_e());
			cliente.getBilletera().getLineas_b().add(new L_billetera(cripto, numUnidades));
		}
	}

	/**
	 * Método 17
	 * 
	 * @param clientes
	 * @return el nombre del cliente con más operaciones
	 */
	public static String nCuentaMaxOperations(ArrayList<Cliente> clientes) {
		Cliente clientMax = clientes.get(0);

		for (Cliente c : clientes) {
			if (c.maxOperations() > clientMax.maxOperations())
				clientMax = c;
		}

		return clientMax.nCuentaMaxOperations();
	}

	/**
	 * Método 19/16
	 * 
	 * @param clientes
	 * @return el nombre de cuenta del cliente con más operaciones
	 */
	public static String nCuentaMayorTransacciones(ArrayList<Cliente> clientes) {
		int maxTransacciones = 0;
		Cliente clientMax = null;
		for (Cliente c : clientes) {
			if (c.maxOperations() > maxTransacciones) {
				maxTransacciones = c.maxOperations();
				clientMax = c;
			}
		}
		return clientMax.nCuentaMaxOperations();
	}

	/**
	 * Método 20 - Imprime las criptomonedas de los clientes
	 * 
	 * @param clientes
	 */
	public static void listClientCriptos(ArrayList<Cliente> clientes) {
		ArrayList<String> printerdCriptos = new ArrayList<String>();
		for (Cliente c : clientes) {
			for (L_billetera l : c.getBilletera().getLineas_b()) {
				if (!printerdCriptos.contains(l.getCriptomoneda().getNombre())) {
					System.out.println(l.getCriptomoneda().getNombre());
					printerdCriptos.add(l.getCriptomoneda().getNombre());
				}
			}
		}
	}

	/**
	 * Método 21 - Imprime la criptomoneda con mayor valor
	 * @param clientes
	 */
	public static void maxClientCripto(ArrayList<Cliente> clientes) {
		String maxCripto = "";
		double maxPrice = 0;
		for (Cliente c : clientes) {
			for (L_billetera b : c.getBilletera().getLineas_b()) {
				if (b.getCriptomoneda().getValor_e() > maxPrice) {
					maxCripto = b.getCriptomoneda().getNombre();
					maxPrice = b.getCriptomoneda().getValor_e();
				}
			}
		}
		System.out.println(maxCripto);
	}
}
