package ControladoresAereos2;

public class Main {
	public static void main(String[] args) {

	}

	public static void mostrarDatosPasaje(Vuelo vuelo) {
		for (int i = 0; i < vuelo.getPasajeros().length; i++)
			vuelo.getPasajeros()[i].showData();
	}

	public static void mostrarDatosPasajes(Vuelo[] vuelos) {
		for (int i = 0; i < vuelos.length; i++) {
			mostrarDatosPasaje(vuelos[i]);
		}
	}

	public static Pasajero[] ancianosVuelo(Vuelo vuelo) {
		Pasajero[] ancianos = new Pasajero[4];
		for (int i = 0; i < vuelo.getPasajeros().length; i++) {
			if (ancianos[0] == null || ancianos[0].getEdad() < vuelo.getPasajeros()[i].getEdad()) {
				ancianos[0] = vuelo.getPasajeros()[i];
				break;
			}
			if (ancianos[1] == null || ancianos[1].getEdad() < vuelo.getPasajeros()[i].getEdad()) {
				ancianos[1] = vuelo.getPasajeros()[i];
				break;
			}
			if (ancianos[2] == null || ancianos[2].getEdad() < vuelo.getPasajeros()[i].getEdad()) {
				ancianos[2] = vuelo.getPasajeros()[i];
				break;
			}
			if (ancianos[3] == null || ancianos[3].getEdad() < vuelo.getPasajeros()[i].getEdad()) {
				ancianos[3] = vuelo.getPasajeros()[i];
				break;
			}
		}
		return ancianos;
	}

	public static Pasajero jovencito(Vuelo vuelo) {
		Pasajero joven = vuelo.getPasajeros()[0];
		for (int i = 0; i < vuelo.getPasajeros().length; i++) {
			if (joven.getEdad() > vuelo.getPasajeros()[i].getEdad())
				joven = vuelo.getPasajeros()[i];
		}
		return joven;
	}

	public static Vuelo vueloAnciano(Vuelo[] vuelos) {
		Vuelo anciano = null;
		double maxMedia = 0;
		for (int i = 0; i < vuelos.length; i++) {
			double media = 0;
			for (int j = 0; j < vuelos[i].getPasajeros().length; j++)
				media += vuelos[i].getPasajeros()[j].getEdad();
			media /= 200;
			if (anciano == null || media > maxMedia) {
				anciano = vuelos[i];
				maxMedia = media;
			}
		}
		return anciano;
	}

	public static int matriculaCiudad(String provincia, Vuelo[] vuelos) {
		int numVuelo = 0;
		int counts = 0;
		for (int i = 0; i < vuelos.length; i++) {
			int counter = 0;
			for (int j = 0; j < vuelos[i].getPasajeros().length; j++) {
				if (vuelos[i].getPasajeros()[j].getProvincia() != provincia)
					counter++;
			}
			if (counter > counts) {
				numVuelo = vuelos[i].getNVuelo();
				counts = counter;
			}
		}

		return numVuelo;
	}
}
