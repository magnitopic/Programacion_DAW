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

	/**
	 * Ejercicio 10
	 * 
	 * @param ventas
	 * @return listado de los 5 videojuegos más vendidos y sus ventas
	 */
	public static ArrayList<String> printPopularGames(ArrayList<Venta> ventas) {
		ArrayList<Integer> topVentas = new ArrayList<Integer>();
		ArrayList<String> nombresJuegos = new ArrayList<String>();
		for (Venta v : ventas) {
			for (Linea_venta l : v.getLineas_venta()) {
				if (topVentas.size() < 5) {
					topVentas.add(l.getUnidades());
					nombresJuegos.add(l.getVideojuego().getNombre());
				} else {
					for (int i = 0; i < topVentas.size(); i++) {
						if (l.getUnidades() > topVentas.get(i)) {
							topVentas.add(i, l.getUnidades());
							nombresJuegos.add(i, l.getVideojuego().getNombre());
							break;
						}
					}
				}
			}
		}
		ArrayList<String> top5 = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			top5.add(nombresJuegos.get(i) + " - " + topVentas.get(i));
		}
		return top5;
	}

	/**
	 * Ejercicio 11
	 * 
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

	/**
	 * Ejercicio 12
	 * 
	 * @param ventas
	 * @return nombre del juego más vendido en las ventas
	 */
	public static String nombreMasVendido(ArrayList<Venta> ventas) {
		String gameName = "";
		int undVendidas = 0;
		for (Venta v : ventas) {
			for (Linea_venta l : v.getLineas_venta()) {
				if (l.getUnidades() > undVendidas) {
					gameName = l.getVideojuego().getNombre();
					undVendidas = l.getUnidades();
				}
			}
		}
		return gameName;
	}

	/**
	 * Ejercicio 14
	 * 
	 * @param ventas
	 * @return
	 */
	public static ArrayList<String> empresasTop5Juegos(ArrayList<Venta> ventas) {
		ArrayList<Integer> topVentas = new ArrayList<Integer>();
		ArrayList<String> nombresEmpresas = new ArrayList<String>();
		for (Venta v : ventas) {
			for (Linea_venta l : v.getLineas_venta()) {
				if (topVentas.size() < 5) {
					topVentas.add(l.getUnidades());
					nombresEmpresas.add(l.getVideojuego().getCompannia().getNombre());
				} else {
					for (int i = 0; i < topVentas.size(); i++) {
						if (l.getUnidades() > topVentas.get(i)) {
							topVentas.add(i, l.getUnidades());
							nombresEmpresas.add(i, l.getVideojuego().getCompannia().getNombre());
							break;
						}
					}
				}
			}
		}
		return nombresEmpresas;
	}
}
