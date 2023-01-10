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
}
