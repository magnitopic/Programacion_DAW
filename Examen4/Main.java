package Examen4;

import java.util.ArrayList;

public class Main {
	/**
	 * Ejercicio 1
	 * 
	 * @param ventas
	 */
	public static void descuentoVentas(ArrayList<Venta> ventas) {
		for (Venta v : ventas) {
			double importeVenta = v.getImporte_tot_venta();
			if ((importeVenta - 20) >= 0)
				v.setImporte_tot_venta(importeVenta - 20);
			else
				v.setImporte_tot_venta(0);
		}
	}

	/**
	 * Ejercicio 2
	 * 
	 * @param personajes
	 * @return lista de los personajes que su nombre acaba en numero
	 */
	public static ArrayList<Personaje> personajesNombreNumero(ArrayList<Personaje> personajes) {
		for (int i = 0; i < personajes.size(); i++) {
			char lastChar = personajes.get(i).getNombre().charAt(personajes.get(i).getNombre().length() - 1);
			// el ultimo caracter del nombre del personaje debe de estar entre estos valores
			// de la tabla ascii. un digito numerico
			if (!(lastChar >= 48 && lastChar <= 57))
				personajes.remove(i);
		}
		return personajes;
	}

	/**
	 * Ejercicio 3
	 * 
	 * @param clientes
	 * @return El cliente encontrado o null si no se encuentra
	 */
	public static Cliente findCliente(ArrayList<Cliente> clientes, String DNI) {
		for (Cliente c : clientes) {
			if (c.getDni().equalsIgnoreCase(DNI))
				return c;
		}
		return null;
	}

	/**
	 * Ejercicio 4
	 * 
	 * @param clientes
	 * @param DNI
	 * @return verdadero o falso dependiendo de si se encuentra el cliente,
	 *         identificado por su DNI, en el array
	 */
	public static boolean isClienteInArray(ArrayList<Cliente> clientes, String DNI) {
		return findCliente(clientes, DNI) != null;
	}

	/**
	 * Ejercicio 5
	 * 
	 * @param ventas
	 * @return El importe total de las ventas que cada linea de venta no supere las
	 *         5 ud y que el empleado tenga un DNI terminado en 'X'
	 */
	public static double importeLineasVentaNoMas5EmpleadoX(ArrayList<Venta> ventas) {
		double impVentas = 0;
		for (Venta v : ventas) {
			for (Linea_venta lv : v.getLineas_venta()) {
				if (lv.getUnidades() <= 5) {
					String dni = v.getEmple().getDni();
					if (dni.charAt(dni.length() - 1) == 'x' || dni.charAt(dni.length() - 1) == 'X')
						impVentas += lv.getImporte();
				}
			}
		}
		return impVentas;
	}

	/**
	 * Ejercicio 7
	 * 
	 * @param DNI
	 * @param ventas
	 * @return lineas de venta de un cliente con más de 5 ud
	 */
	public static ArrayList<Linea_venta> lineasVentaCliente(String DNI, ArrayList<Venta> ventas) {
		ArrayList<Linea_venta> lineasDeVentaCliente = new ArrayList<Linea_venta>();
		for (Venta v : ventas) {
			if (v.getCliente().getDni().equalsIgnoreCase(DNI)) {
				for (Linea_venta lv : v.getLineas_venta()) {
					if (lv.getUnidades() > 5)
						lineasDeVentaCliente.add(lv);
				}
			}
		}
		return lineasDeVentaCliente;
	}

	/**
	 * Ejercicio 8
	 * 
	 * @param ventas
	 * @return verdadero o falso dependiendo en si hay una linea de venta con más de
	 *         10 ud
	 */
	public static boolean lineaVentaMasDiezUd(ArrayList<Venta> ventas) {
		for (Venta v : ventas) {
			for (Linea_venta lv : v.getLineas_venta()) {
				if (lv.getUnidades() > 10)
					return true;
			}
		}
		return false;
	}

	/**
	 * Ejercicio 9
	 * 
	 * @param ventas
	 * @return Nombre del cliente con menor valor de compra
	 */
	public static String clienteMenorCompra(ArrayList<Venta> ventas) {
		String nombre = null;
		double importeMin = Double.MAX_VALUE;
		for (Venta v : ventas) {
			if (nombre == null || v.getImporte_tot_venta() < importeMin) {
				nombre = v.getCliente().getNombre();
				importeMin = v.getImporte_tot_venta();
			}
		}
		return nombre;
	}

	/**
	 * Ejercico 10
	 * 
	 * @param ventas
	 * @return cliente con mayor numero de linea de ventas
	 */
	public static Cliente clienteMasLineasVenta(ArrayList<Venta> ventas) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Integer> countLineaVenta = new ArrayList<Integer>();
		// Tabla con los clientes y las ventas que tienen
		for (Venta v : ventas) {
			// se comprueba si el cliente ya está en la lista
			if (clientes.contains(v.getCliente())) {
				int index = clientes.indexOf(v.getCliente());
				// se incrementa por tantas lineas de venta tenga la venta
				countLineaVenta.set(index, countLineaVenta.get(index) + v.getLineas_venta().size());
			} else {
				// Se añade un cliente nuevo y las lineas de venta que tiene esta venta
				clientes.add(v.getCliente());
				countLineaVenta.add(v.getLineas_venta().size());
			}
		}
		// sacamos el elemento más grande
		int indexBigest = countLineaVenta.get(0);
		for (int i = 1; i < countLineaVenta.size(); i++) {
			if (countLineaVenta.get(i) > indexBigest)
				indexBigest = countLineaVenta.get(i);
		}
		return clientes.get(indexBigest);
	}

	/**
	 * Ejercicio 11
	 * 
	 * @param ventas
	 * @return las 3 tiendas con más lineas ce ventas superiores a 7 ud
	 */
	public static ArrayList<Tienda> tiendas3MasLineasVentaMas7Ud(ArrayList<Venta> ventas) {
		ArrayList<Tienda> tiendas = new ArrayList<Tienda>();
		ArrayList<Integer> countLineaVenta = new ArrayList<Integer>();
		// Tabla con las tiendas y las ventas que tienen
		for (Venta v : ventas) {
			for (Linea_venta lv : v.getLineas_venta()) {
				if (lv.getUnidades() > 7) {
					// se comprueba si la tienda ya está en la lista
					if (tiendas.contains(v.getTienda())) {
						// se incrementa en uno para tiendas ya existentes
						int index = tiendas.indexOf(v.getTienda());
						countLineaVenta.set(index, countLineaVenta.get(index) + 1);
					} else {
						// Se añade una tienda nueva
						tiendas.add(v.getTienda());
						countLineaVenta.add(1);
					}
				}
			}
		}
		// ordenamos las listas con lo elementos más grander al principio
		for (int i = 0; i < countLineaVenta.size(); i++) {
			for (int j = 0; j < countLineaVenta.size() - 1; j++) {
				Integer valorActual = countLineaVenta.get(j), valorSiguiente = countLineaVenta.get(j + 1);
				Tienda tiendaActual = tiendas.get(j), tiendaSiguiente = tiendas.get(j + 1);
				if (valorActual < valorSiguiente) {
					countLineaVenta.set(j, valorSiguiente);
					countLineaVenta.set(j + 1, valorActual);
					tiendas.set(j, tiendaSiguiente);
					tiendas.set(j + 1, tiendaActual);
				}
			}
		}
		// cogemos los 3 primeros elementos
		ArrayList<Tienda> topTiendas = new ArrayList<Tienda>();
		for (int i = 0; i < 3; i++) {
			topTiendas.add(tiendas.get(i));
		}
		return topTiendas;
	}
}
