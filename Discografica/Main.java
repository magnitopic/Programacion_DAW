package Discografica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
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
					mayorDuracion(canciones);
					break;
				case 4:
					showNames(canciones);
					break;
				case 5:
					sumDuration(canciones);
					break;
				case 6:
					durations(canciones);
					break;
				case 7:
					infoDiskName(null);
					break;
				case 8:
					findSongName(null);
					break;
				case 9:
					allFindSongNames(null);
					break;
				case 10:
					maxDurationDisk(null);
					break;
				case 11:
					repeatDiscs(null);
					break;
				case 12:
					durationSongsEA(null);
					break;
				case 13:
					emptyDiskOfSongs(null);
					break;
				case 14:
					discoRecopilatorioDurationMax(null);
					break;
				case 15:
					discoRecopilatorioDurationMin(null);
					break;
				case 16:
					twoMaxDuration(null);
					break;
				case 17:
					twoMinDuration(null);
					break;
				case 18:
					discsProduced(null);
					break;
				case 19:
					showPublishedYear(null);
					break;
			}
		} while (opc != 20);
		System.out.println("Adiós.");
		sn.close();
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

	public static void mayorDuracion(Cancion[] canciones) {
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].getDuracion() > canciones[max].getDuracion())
				max = i;
		}
		System.out.println("Nombre de la canción: " + canciones[max].getTitulo());
		System.out.println("Duración: " + canciones[max].getDuracion());
	}

	public static void showNames(Cancion[] canciones) {
		for (int i = 0; i < canciones.length - 1; i++)
			System.out.println(canciones[i] + ", ");
		System.out.println(canciones[canciones.length - 1]);
	}

	public static void sumDuration(Cancion[] canciones) {
		int sum = 0;
		for (int i = 0; i < canciones.length; i++)
			sum += canciones[i].getDuracion();
		System.out.println("Suma de suraciones: " + sum);
	}

	public static Double[] durations(Cancion[] canciones) {
		Double[] durations = new Double[canciones.length];
		for (int i = 0; i < canciones.length; i++)
			durations[i] = canciones[i].getDuracion();
		return durations;
	}

	public static void infoDiskName(Disco[] discos) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Introduce el nombre del disco del que quieres ver la info: ");
		String name = sn.nextLine();
		for (int i = 0; i < discos.length; i++) {
			if (discos[i].getTitulo().equalsIgnoreCase(name)) {
				Cancion[] canciones = discos[i].getCanciones();
				for (int j = 0; j < canciones.length; j++) {
					System.out.println("Titulo Cancion " + j + ": " + canciones[j].getTitulo() + " - Duración: "
							+ canciones[j].getDuracion());
				}
			}
		}
		sn.close();
	}

	public static void findSongName(Disco[] discos) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Introduce la letra por la que tiene que empezar la canción: ");
		char name = sn.nextLine().charAt(0);

		for (int i = 0; i < discos.length; i++) {
			Cancion[] canciones = discos[i].getCanciones();
			for (int j = 0; j < canciones.length; j++) {
				if (canciones[j].getTitulo().charAt(0) == name) {
					System.out.println(canciones[j].getTitulo());
					sn.close();
					return;
				}
			}
		}

		sn.close();
	}

	public static String[] allFindSongNames(Disco[] discos) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Introduce el nombre del disco del que quieres ver la info: ");
		char name = sn.nextLine().charAt(0);
		int count = 0;
		for (int i = 0; i < discos.length; i++) {
			Cancion[] canciones = discos[i].getCanciones();
			for (int j = 0; j < canciones.length; j++) {
				if (canciones[j].getTitulo().charAt(0) == name) {
					count++;
				}
			}
		}
		String[] nombres = new String[count];
		int x = 0;
		for (int i = 0; i < discos.length; i++) {
			Cancion[] canciones = discos[i].getCanciones();
			for (int j = 0; j < canciones.length; j++) {
				if (canciones[j].getTitulo().charAt(0) == name) {
					nombres[x++] = canciones[j].getTitulo();
				}
			}
		}

		sn.close();
		return nombres;
	}

	public static Disco maxDurationDisk(Disco[] discos) {
		double[] duraciones = new double[discos.length];
		for (int i = 0; i < discos.length; i++) {
			Cancion[] canciones = discos[i].getCanciones();
			for (int j = 0; j < canciones.length; j++) {
				duraciones[j] += canciones[j].getDuracion();
			}
		}

		int max = 0;
		for (int i = 0; i < duraciones.length - 1; i++) {
			if (duraciones[i] > duraciones[max])
				max = i;
		}
		return discos[max];
	}

	public static void repeatDiscs(Disco[] discos) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Introduce el título de la canción: ");
		String name = sn.nextLine();
		int count = 0;
		for (int i = 0; i < discos.length; i++) {
			Cancion[] canciones = discos[i].getCanciones();
			for (int j = 0; j < canciones.length; j++) {
				if (canciones[j].getTitulo().equalsIgnoreCase(name)) {
					count++;
				}
			}
		}
		System.out.println("La canción aparece " + count + " veces");
		sn.close();
	}

	public static void durationSongsEA(Disco[] discos) {
		double duracition = 0;
		for (int i = 0; i < discos.length; i++) {
			if (discos[i].getTitulo().charAt(0) == 'o' || discos[i].getTitulo().charAt(0) == 'e') {
				Cancion[] canciones = discos[i].getCanciones();
				for (int j = 0; j < canciones.length; j++) {
					duracition += canciones[j].getDuracion();
				}
			}
		}
		System.out.println("Duración de las canciones: " + duracition);
	}

	public static void emptyDiskOfSongs(Disco[] discos) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Introduce el nombre del disco del que quieres borrar las canciones: ");
		String name = sn.nextLine();

		for (int i = 0; i < discos.length; i++) {
			if (discos[i].getTitulo().equalsIgnoreCase(name)) {
				Cancion[] canciones = discos[i].getCanciones();
				for (int j = 0; j < canciones.length; j++) {
					canciones[j] = null;
				}
				break;
			}

		}

		sn.close();
	}

	public static void discoRecopilatorioDurationMax(DiscoRecopilatorio[] discosReco) {
		int max = 0;
		double maxDuration = 0;
		for (int i = 0; i < discosReco.length; i++) {
			double duration = 0;
			for (int j = 0; j < discosReco[i].getDiscos().length; j++) {
				for (int k = 0; k < discosReco[i].getDiscos().length; k++)
					duration += sum(durations(discosReco[i].getDiscos()[k].getCanciones()));
			}
			if (duration > maxDuration) {
				max = i;
				maxDuration = duration;
			}
		}
		discosReco[max].showData();
	}

	public static void discoRecopilatorioDurationMin(DiscoRecopilatorio[] discosReco) {
		int min = 0;
		double minDuration = 0;
		for (int i = 0; i < discosReco.length; i++) {
			double duration = 0;
			for (int j = 0; j < discosReco[i].getDiscos().length; j++) {
				for (int k = 0; k < discosReco[i].getDiscos().length; k++)
					duration += sum(durations(discosReco[i].getDiscos()[k].getCanciones()));
			}
			if (duration < minDuration) {
				min = i;
				minDuration = duration;
			}
		}
		discosReco[min].showData();
	}

	public static DiscoRecopilatorio[] twoMaxDuration(DiscoRecopilatorio[] discosReco) {
		DiscoRecopilatorio[] discosRecoMax = new DiscoRecopilatorio[2];
		int resultado = findMaxOrMin(discosReco, false);
		discosReco[resultado] = null;
		discosRecoMax[0] = discosReco[resultado];
		resultado = findMaxOrMin(discosReco, false);
		discosReco[resultado] = null;
		discosRecoMax[1] = discosReco[resultado];

		return discosRecoMax;
	}

	public static DiscoRecopilatorio[] twoMinDuration(DiscoRecopilatorio[] discosReco) {
		DiscoRecopilatorio[] discosRecoMax = new DiscoRecopilatorio[2];
		int resultado = findMaxOrMin(discosReco, true);
		discosReco[resultado] = null;
		discosRecoMax[0] = discosReco[resultado];
		resultado = findMaxOrMin(discosReco, true);
		discosReco[resultado] = null;
		discosRecoMax[1] = discosReco[resultado];

		return discosRecoMax;
	}

	public static void discsProduced(DiscoRecopilatorio[] discosReco) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Introduce el nombre del productor: ");
		String name = sn.nextLine();
		for (int i = 0; i < discosReco.length; i++) {
			for (int j = 0; j < discosReco[i].getDiscos().length; j++) {
				if (discosReco[i].getDiscos()[j].getProductor().equalsIgnoreCase(name)) {
					discosReco[i].showData();
					break;
				}
			}
		}
		sn.close();
	}

	public static void showPublishedYear(DiscoRecopilatorio[] discosReco) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Introduce el año de producción del disco: ");
		int year = sn.nextInt();
		for (int i = 0; i < discosReco.length; i++) {
			for (int j = 0; j < discosReco[i].getDiscos().length; j++) {
				if (discosReco[i].getDiscos()[j].getAñopublicacion() > year) {
					discosReco[i].showData();
					break;
				}
			}
		}
		sn.close();
	}

	// Auxiliares
	private static double sum(Double[] arr) {
		double sum = 0;
		int i;
		for (i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}

	private static int findMaxOrMin(DiscoRecopilatorio[] discosReco, boolean flag) {
		int min = 0;
		double minDuration = 0;
		for (int i = 0; i < discosReco.length; i++) {
			double duration = 0;
			if (discosReco[i] == null)
				break;
			for (int j = 0; j < discosReco[i].getDiscos().length; j++) {
				for (int k = 0; k < discosReco[i].getDiscos().length; k++)
					duration += sum(durations(discosReco[i].getDiscos()[k].getCanciones()));
			}
			if ((duration < minDuration && flag) || (duration > minDuration && !flag)) {
				min = i;
				minDuration = duration;
			}
		}
		return min;
	}
}
