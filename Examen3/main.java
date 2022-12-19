package Examen3;

public class main {

	public static void main(String[] args) {
		// Pruebas de las funciones

		// variables
		Pasajero[] pasajeros = { new Pasajero("Alex", "Mag", "4323242", "2435243D", 34) };
		Avion avion = new Avion("a", 20, "Air7372000", 5.34, 2022);
		Avion[] aviones1 = { new Avion("747", 42, "Boe7472005", 2543.4, 2005),
				new Avion("737", 153, "Air7372000", 23424.3, 2000) };
		Avion[] aviones2 = { new Avion("340", 324, "Air3402010", 23424.32, 2010),
				new Avion("544", 15, "Boe5442004", 3214.3, 2004) };
		Avion[] aviones3 = { new Avion("324", 3, "Air3241998", 2344, 1998),
				new Avion("123", 32, "Air1231998", 3234.32, 1998) };
		Avion[] aviones4 = { new Avion("743", 20, "Boe7432007", 324, 2007),
				new Avion("893", 42, "Boe8932021", 324.2, 2021) };
		Avion[] aviones5 = { new Avion("123", 12, "Boe1232004", 3242, 2004) };
		Aeropuerto[] aeropuertos1 = { new Aeropuerto("MAD", "Madrid", "4321", aviones1) };
		Aeropuerto[] aeropuertos2 = { new Aeropuerto("PAR", "Paris", "765", aviones2) };
		Aeropuerto[] aeropuertos3 = { new Aeropuerto("ROM", "Roma", "5432", aviones3) };
		Aeropuerto[] aeropuertos4 = { new Aeropuerto("BER", "Berlin", "4327", aviones4),
				new Aeropuerto("BRU", "Bruselas", "354", aviones5), new Aeropuerto("LON", "Londres", "321", aviones3),
				new Aeropuerto("SOF", "Sofia", "321", aviones2) };
		Vuelo[] vuelos = { new Vuelo(432, avion, pasajeros, aeropuertos1[0], aeropuertos2[0]) };

		// llamadas a funciones
		System.out.println("modeloAvion:\n" + modeloAvion(avion));
		System.out.println("avionesMarca:");
		Avion[] avionesDeMarca = avionesMarca(aviones1, aviones2, "Air");
		for (int i = 0; i < avionesDeMarca.length; i++) {
			System.out.println(avionesDeMarca[i].getModelo());
		}
		System.out.println("numAviones:\n" + numAviones(aviones1, aviones2, aviones3, "Air", "1998"));
		System.out.println("pasajerosDni:");
		Pasajero[] pasajerosDni = pasajerosDni(vuelos, 'D');
		for (int i = 0; i < pasajerosDni.length; i++) {
			System.out.println(pasajerosDni[i].getDni());
		}
		System.out.println("aerosMenos:");
		Aeropuerto[] aeroMenos = aerosMenos(aeropuertos1, aeropuertos2, aeropuertos3, aeropuertos4);
		for (int i = 0; i < aeroMenos.length; i++) {
			System.out.println(aeroMenos[i].getAviones().length);
		}
		System.out.println("nvuelosCiudad:\n" + nvuelosCiudad(vuelos, "paris"));
		System.out.println("aerosMuchosAviones:");
		Aeropuerto[] aerosMuchos = aerosMuchosAviones(aeropuertos4);
		for (int i = 0; i < aerosMuchos.length; i++) {
			System.out.println(aerosMuchos[i].getNombre());
		}
		System.out.println("El aeropuerto de bruselas no se muestra porque tiene 'aviones5' que solo tiene un avión");
		System.out.println("avionesVuelo:");
		Avion[] avionesVuelo = avionesVuelo(vuelos);
		for (int i = 0; i < avionesVuelo.length; i++) {
			System.out.println(avionesVuelo[i].getCapacidad_pasajeros());
		}
		System.out.println("dnisPasajeros:\n" + dnisPasajeros(vuelos, "Pedro", "Paris"));
	}

	public static String modeloAvion(Avion avion) {
		String modelo = "";
		for (int i = 3; i <= 5; i++) {
			modelo += avion.getMatricula().charAt(i);
		}
		return modelo;
	}

	public static Avion[] avionesMarca(Avion[] aviones1, Avion[] aviones2, String marca) {
		int counter = 0;
		for (int i = 0; i < aviones1.length; i++) {
			if (aviones1[i].getMatricula().substring(0, 3).equalsIgnoreCase(marca))
				counter++;
		}
		for (int i = 0; i < aviones2.length; i++) {
			if (aviones2[i].getMatricula().substring(0, 3).equalsIgnoreCase(marca))
				counter++;
		}
		Avion[] avionesMarca = new Avion[counter];
		counter = 0;
		for (int i = 0; i < aviones1.length; i++) {
			if (aviones1[i].getMatricula().substring(0, 3).equalsIgnoreCase(marca))
				avionesMarca[counter++] = aviones1[i];
		}
		for (int i = 0; i < aviones2.length; i++) {
			if (aviones2[i].getMatricula().substring(0, 3).equalsIgnoreCase(marca))
				avionesMarca[counter++] = aviones2[i];
		}
		return avionesMarca;
	}

	public static int numAviones(Avion[] aviones1, Avion[] aviones2, Avion[] aviones3, String marca, String year) {
		int counter = 0;

		for (int i = 0; i < aviones1.length; i++) {
			if (aviones1[i].getMatricula().substring(6).equalsIgnoreCase(year)
					&& aviones1[i].getMatricula().substring(0, 3).equalsIgnoreCase(marca))
				counter++;
		}
		for (int i = 0; i < aviones2.length; i++) {
			if (aviones2[i].getMatricula().substring(6).equalsIgnoreCase(year)
					&& aviones2[i].getMatricula().substring(0, 3).equalsIgnoreCase(marca))
				counter++;
		}
		for (int i = 0; i < aviones3.length; i++) {
			if (aviones3[i].getMatricula().substring(6).equalsIgnoreCase(year)
					&& aviones3[i].getMatricula().substring(0, 3).equalsIgnoreCase(marca))
				counter++;
		}

		return counter;
	}

	public static Pasajero[] pasajerosDni(Vuelo[] vuelos, char letra) {
		int counter = 0;

		// Necesito saber cuantos pasajeros cumplen con la condición para poder crear el
		// array
		for (int i = 0; i < vuelos.length; i++) {
			Pasajero[] pasajeros = vuelos[i].getPasajeros();
			for (int j = 0; j < pasajeros.length; j++) {
				if (pasajeros[j].getDni().charAt(pasajeros[j].getDni().length() - 1) == letra)
					counter++;
			}
		}

		// Ahora puedo crear el array con ese tamaño
		Pasajero[] pasajerosConLetra = new Pasajero[counter];

		// Por ultimo lo lleno de datos
		counter = 0;
		for (int i = 0; i < vuelos.length; i++) {
			Pasajero[] pasajeros = vuelos[i].getPasajeros();
			for (int j = 0; j < pasajeros.length; j++) {
				if (pasajeros[j].getDni().charAt(pasajeros[j].getDni().length() - 1) == letra)
					pasajerosConLetra[counter++] = pasajeros[j];
			}
		}
		return pasajerosConLetra;
	}

	public static Aeropuerto[] aerosMenos(Aeropuerto[] aeropuertos1, Aeropuerto[] aeropuertos2,
			Aeropuerto[] aeropuertos3, Aeropuerto[] aeropuertos4) {
		Aeropuerto[] menoresAviones = new Aeropuerto[4];
		for (int i = 0; i < aeropuertos1.length; i++) {
			for (int j = 0; j < menoresAviones.length; j++) {
				// Si no hay un valor en menoresAviones o si el aeropurto que estamos
				// comprobando tiene menos aviones
				// Si la primera condición se cumple, no comprueba la segunda por que es un "or"
				// entonces no tenemos problemas de
				// acceder a un objeto que no existe
				// El break es necesario para que no llenar todo el array del mismo objeto
				if (menoresAviones[j] == null
						|| menoresAviones[j].getAviones().length > aeropuertos1[i].getAviones().length) {
					menoresAviones[j] = aeropuertos1[i];
					break;
				}
			}
		}
		for (int i = 0; i < aeropuertos2.length; i++) {
			for (int j = 0; j < menoresAviones.length; j++) {
				if (menoresAviones[j] == null
						|| menoresAviones[j].getAviones().length > aeropuertos2[i].getAviones().length) {
					menoresAviones[j] = aeropuertos2[i];
					break;
				}
			}
		}
		for (int i = 0; i < aeropuertos3.length; i++) {
			for (int j = 0; j < menoresAviones.length; j++) {
				if (menoresAviones[j] == null
						|| menoresAviones[j].getAviones().length > aeropuertos3[i].getAviones().length) {
					menoresAviones[j] = aeropuertos3[i];
					break;
				}
			}
		}
		for (int i = 0; i < aeropuertos4.length; i++) {
			for (int j = 0; j < menoresAviones.length; j++) {
				if (menoresAviones[j] == null
						|| menoresAviones[j].getAviones().length > aeropuertos4[i].getAviones().length) {
					menoresAviones[j] = aeropuertos4[i];
					break;
				}
			}
		}
		return menoresAviones;
	}

	public static int nvuelosCiudad(Vuelo[] vuelos, String ciudad) {
		int counter = 0;

		for (int i = 0; i < vuelos.length; i++) {
			if (vuelos[i].getAeropuerto_llegada().getCiudad().equalsIgnoreCase(ciudad))
				counter++;
		}

		return counter;
	}

	public static Aeropuerto[] aerosMuchosAviones(Aeropuerto[] aeropuertos) {
		Aeropuerto[] aeropuertosMasAviones = new Aeropuerto[3];

		for (int i = 0; i < aeropuertos.length; i++) {
			for (int j = 0; j < aeropuertosMasAviones.length; j++) {
				if (aeropuertosMasAviones[j] == null
						|| aeropuertosMasAviones[j].getAviones().length < aeropuertos[i].getAviones().length) {
					aeropuertosMasAviones[j] = aeropuertos[i];
					break;
				}
			}
		}

		return aeropuertosMasAviones;
	}

	public static Avion[] avionesVuelo(Vuelo[] vuelos) {
		int counter = 0;

		for (int i = 0; i < vuelos.length; i++) {
			if (vuelos[i].getAvion().getCapacidad_pasajeros() >= 20)
				counter++;
		}

		Avion[] avionesPasajeros = new Avion[counter];
		counter = 0;
		for (int i = 0; i < vuelos.length; i++) {
			if (vuelos[i].getAvion().getCapacidad_pasajeros() >= 20)
				avionesPasajeros[counter++] = vuelos[i].getAvion();
		}

		return avionesPasajeros;
	}

	public static String dnisPasajeros(Vuelo[] vuelos, String nombre, String ciudad) {
		String dnis = "";

		for (int i = 0; i < vuelos.length; i++) {
			Pasajero[] pasajeros = vuelos[i].getPasajeros();
			if (vuelos[i].getAeropuerto_llegada().getCiudad().equalsIgnoreCase(ciudad)) {
				for (int j = 0; j < pasajeros.length; j++) {
					if (!pasajeros[j].getNombre().equalsIgnoreCase(nombre))
						dnis += (pasajeros[j].getDni() + ", ");
				}
			}
		}
		return dnis;
	}
}