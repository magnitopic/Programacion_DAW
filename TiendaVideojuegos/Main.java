package TiendaVideojuegos;

import java.sql.Array;
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
	 * @param cliente
	 * @param clientes
	 * @return booleano dependiendo si está el cliente en la lista
	 */
	public static boolean existeCliente(Cliente cliente, ArrayList<Cliente> clientes) {
		for (Cliente c : clientes) {
			if (c.getNombre().equals(cliente.getNombre()))
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
	 * @return el nombre de los videojuegos vendidos superiores a 70€
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

	// Ejercicio 7
	/**
	 * 
	 * @param clientes
	 * @param dniCliente
	 * @return el cliente o null si no se encuentra
	 */
	public static Cliente dameCliente(ArrayList<Cliente> clientes, String dniCliente) {
		for (Cliente c : clientes) {
			if (c.getDni().equalsIgnoreCase(dniCliente))
				return c;
		}
		return null;
	}

	/**
	 * 
	 * @param empleados
	 * @param dniEmpleado
	 * @return el empleado o null si no se encuentra
	 */
	public static Empleado dameEmpleado(ArrayList<Empleado> empleados, String dniEmpleado) {
		for (Empleado e : empleados) {
			if (e.getDni().equalsIgnoreCase(dniEmpleado))
				return e;
		}
		return null;
	}

	/**
	 * 
	 * @param tiendas
	 * @param nombreTienda
	 * @return la tienda o null si no se encuentra
	 */
	public static Tienda dameTienda(ArrayList<Tienda> tiendas, String nombreTienda) {
		for (Tienda t : tiendas) {
			if (t.getNombre().equalsIgnoreCase(nombreTienda))
				return t;
		}
		return null;
	}

	/**
	 * Ejercicio 8
	 * 
	 * @param ventas
	 * @return nombre de los videojuegos que se han vendido en meses pares
	 */
	public static ArrayList<String> nombresJuegosMesesPares(ArrayList<Venta> ventas) {
		ArrayList<String> videojuegos = new ArrayList<String>();
		for (Venta v : ventas) {
			if (Integer.parseInt(v.getFecha_venta().substring(4, 6)) % 2 == 0) {
				for (Linea_venta l : v.getLineas_venta()) {
					if (!videojuegos.contains(l.getVideojuego().getNombre()))
						videojuegos.add(l.getVideojuego().getNombre());
				}
			}
		}
		return videojuegos;
	}

	/**
	 * Ejercicio 9 - añadir un objeto venta al arrayList con los datos recibidos
	 * 
	 * @param ventas
	 * @param dniCliente
	 * @param dniEmpleado
	 * @param fechaVenta
	 * @param nombreTienda
	 * @param lineas_venta
	 * @param clientes
	 * @param empleados
	 * @param tiendas
	 */
	public static void darAltaVenta(ArrayList<Venta> ventas, String dniCliente, String dniEmpleado, String fechaVenta,
			String nombreTienda, ArrayList<Linea_venta> lineas_venta, ArrayList<Cliente> clientes,
			ArrayList<Empleado> empleados, ArrayList<Tienda> tiendas) {
		Cliente cliente = dameCliente(clientes, dniCliente);
		Empleado empleado = dameEmpleado(empleados, dniEmpleado);
		Tienda tienda = dameTienda(tiendas, nombreTienda);
		if (cliente == null || empleado == null || tienda == null) {
			System.out.println("Error al dar de alta la venta");
			return;
		}
		double totalImporte = 0;
		for (Linea_venta l : lineas_venta) {
			totalImporte += l.getImporte() * l.getUnidades();
		}
		Venta venta = new Venta(empleado, fechaVenta, totalImporte, tienda, cliente, lineas_venta);
		ventas.add(venta);
	}

	public static void printPopularGames(ArrayList<Venta> ventas) {
		ArrayList<String> videojuegos = new ArrayList<String>();
		for (Venta v : ventas) {
			for (Linea_venta l : v.getLineas_venta()) {
				
			}
		}
		for ()
	}

	/**
	 * Ejercicio 11
	 * @param ventas
	 * @return nombre del cliente con la compra con mayor importe
	 */
	public static String clienteCompraMasImporte(ArrayList<Venta> ventas) {
		String name = ventas.get(0).getCliente().getNombre();
		double importeMax = 0;
		for (Venta v : ventas) {
			if (v.getImporte_tot_venta() > importeMax) {
				importeMax = v.getImporte_tot_venta();
				name = v.getCliente().getNombre();
			}
		}
		return name;
	}

	public static void name() {
		
	}
}
