package TiendaVideojuegos;

import java.util.ArrayList;

public class Main {

	// Ejercicio 2

	/**
	 * 
	 * @param videojuego
	 * @param videojuegos
	 * @return booleano dependiendo si está el videojuego en la lista
	 */
	public static boolean existeVideojuego(Videojuego videojuego, ArrayList<Videojuego> videojuegos) {
		for (Videojuego v : videojuegos) {
			if (v.getNombre().equals(videojuego.getNombre()))
				return true;
		}
		return false;
	}

	/**
	 * 
	 * @param clietes
	 * @param clientes
	 * @return booleano dependiendo si está el cliente en la lista
	 */
	public static boolean existeCliente(Cliente clietes, ArrayList<Cliente> clientes) {
		for (Cliente c : clientes) {
			if (c.getNombre().equals(clietes.getNombre()))
				return true;
		}
		return false;
	}

	/**
	 * 
	 * @param empleado
	 * @param empleados
	 * @return booleano dependiendo si está el empleado en la lista
	 */
	public static boolean existeEmpleado(Empleado empleado, ArrayList<Empleado> empleados) {
		for (Empleado e : empleados) {
			if (e.getNombre().equals(empleado.getNombre()))
				return true;
		}
		return false;
	}

	/**
	 * Ejercicio 3
	 * 
	 * @param venta
	 * @param ventas
	 * @return booleano dependiendo si está la venta en la lista
	 */
	public static double importeVentas(ArrayList<Venta> ventas, Cliente cliente) {
		double importe = 0;
		for (Venta v : ventas) {
			if (v.getCliente().getNombre().equalsIgnoreCase(cliente.getNombre()))
				importe += v.getImporte_tot_venta();
		}
		return importe;
	}

	/**
	 * Ejercicio 4
	 * 
	 * @param ventas
	 * @param tienda
	 * @return
	 */
	public static ArrayList<String> gameNameOver70(ArrayList<Venta> ventas, Tienda tienda) {
		ArrayList<String> videojuegos = new ArrayList<String>();
		for (Venta v : ventas) {
			if (v.getTienda().getNombre().equalsIgnoreCase(tienda.getNombre())) {
				for (Linea_venta l : v.getLineas_venta()) {
					if (l.getImporte() > 70)
						videojuegos.add(l.getVideojuego().getNombre());
				}
			}
		}
		return videojuegos;
	}
}
