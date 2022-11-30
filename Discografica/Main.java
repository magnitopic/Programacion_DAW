package Discografica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		// Declaro un array de 10 objetos de tipo cancion.
		Cancion[] canciones = new Cancion[12];

		// Llamo al método que rellena el array de canciones con canciones reales
		Main.rellenarCanciones(canciones);

		int opc = 0;
		do {
			// Llamo al método que muestra el menú de nuestra aplicación.
			Main.mostrarMenu(canciones);
			opc = sn.nextInt();
			switch (opc) {
				case 1:
					mostrarCanciones(canciones);
				case 2:
					mostrarCancionesCortas(canciones);
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;
				case 6:

					break;
				case 7:

					break;
				case 8:

					break;
				case 9:

					break;
				case 10:

					break;
				case 11:

					break;
				case 12:

					break;
				default:
					sn.close();
					return;
			}
		} while (opc != 8);

	}

	/**
	 * Método que muestra en pantalla el menú de opciones del ejercicio en el que
	 * estás.
	 */
	public static void mostrarMenu(Cancion[] canciones) {
		System.out.println("1.	Mostrar canciones");
		System.out.println("2.	Mostrar canciones de menos de 4 mins");
		System.out.print("--> ");
	}

	/**
	 * Método que rellena el array de canciones con 12 canciones del fántastico
	 * grupo Indie Izal.
	 * 
	 * @param canciones (Array de objetos de la clase Cancion)
	 */
	public static void rellenarCanciones(Cancion[] canciones) {
		canciones[0] = new Cancion("La mujer de verde", 2.1);
		canciones[1] = new Cancion("Copacabana", 3.9);
		canciones[2] = new Cancion("Pausa", 3);
		canciones[3] = new Cancion("Que bién", 3);
		canciones[4] = new Cancion("Pánico Práctico", 3.6);
		canciones[5] = new Cancion("El pozo", 3);
		canciones[6] = new Cancion("La increible historia del hombre que no sabía volar", 3);
		canciones[7] = new Cancion("Autoterapia", 4.3);
		canciones[8] = new Cancion("Bill Murray", 1);
		canciones[9] = new Cancion("El baile", 6);
		canciones[10] = new Cancion("Magia y efectos especiales", 4);
		canciones[11] = new Cancion("Pequeña gran revolución", 2);
	}

	// opciones del menu

	public static void mostrarCanciones(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println(i + ".\t" + canciones[i]);
		}
	}

	public static void mostrarCancionesCortas(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].getDuracion() <= 4)
				System.out.println(i + ".\t" + canciones[i]);
		}
	}

}
