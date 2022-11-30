package ControladoresAereos3;

public class Main {

	public static void main(String[] args) {
		
	}

	public static int npasajerosNombre(Vuelo[] vuelos, String nombre) {
		int count = 0;

		for (int i = 0; i < vuelos.length; i++) {
			for (int j = 0; j < vuelos[i].getPasajeros().length; j++) {
				if (vuelos[i].getPasajeros()[i].getNombre().equalsIgnoreCase(nombre))
					count++;
			}
		}

		return count;
	}

	public static Vuelo[] vuelosDestino(Vuelo[] vuelos, String destino) {
		int count = 0;
		for (int i = 0; i < vuelos.length; i++) {
			if (!vuelos[i].getCiudadDest().equals(destino))
				count++;
		}
		Vuelo[] destinos = new Vuelo[count];

		int j = 0;
		for (int i = 0; i < vuelos.length; i++) {
			if (!vuelos[i].getCiudadDest().equals(destino))
				destinos[j++] = vuelos[i];
		}

		return destinos;
	}

	public static Pasajero[] pasajerosDniLetra(Vuelo[] vuelos, char letra) {
		int count = 0;
		for (int i = 0; i < vuelos.length; i++) {
			for (int j = 0; j < vuelos[i].getPasajeros().length; j++) {
				String DNI = vuelos[i].getPasajeros()[j].getDni();
				if (DNI.charAt(DNI.length()) == letra)
					count++;
			}
		}
		Pasajero[] pasajeros = new Pasajero[count];
		for (int i = 0; i < vuelos.length; i++) {
			for (int j = 0; j < vuelos[i].getPasajeros().length; j++) {
				String DNI = vuelos[i].getPasajeros()[j].getDni();
				if (DNI.charAt(DNI.length()) == letra)
					count++;
			}
		}
		return pasajeros;
	}

	public static Vuelo[] vuelosDniLetra(Vuelo[] vuelos, char letra) {
		int count = 0;
		for (int i = 0; i < vuelos.length; i++) {
			if (pasajerosDniLetra(vuelos[i], letra).length >= 3)
				count++;
		}
		Vuelo[] resultado = new Vuelo[count];
		int j = 0;
		for (int i = 0; i < vuelos.length; i++) {
			if (pasajerosDniLetra(vuelos[i], letra).length >= 3)
				resultado[j++] = vuelos[i];
		}
		return resultado;
	}

	// auxiliar
	public static Pasajero[] pasajerosDniLetra(Vuelo vuelos, char letra) {
		int count = 0;
		for (int j = 0; j < vuelos.getPasajeros().length; j++) {
			String DNI = vuelos.getPasajeros()[j].getDni();
			if (DNI.charAt(DNI.length()) == letra)
				count++;
		}
		Pasajero[] pasajeros = new Pasajero[count];
		for (int j = 0; j < vuelos.getPasajeros().length; j++) {
			String DNI = vuelos.getPasajeros()[j].getDni();
			if (DNI.charAt(DNI.length()) == letra)
				count++;
		}
		return pasajeros;
	}
}
