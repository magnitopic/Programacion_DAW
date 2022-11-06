package ArraysBidimensionales;

import java.util.Scanner;

public class Ejer08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int opt;
		String[][] players = new String[12][5];

		for (int i = 0; i < players.length; i++) {
			System.out.print("Introduce el nombre del juagador " + i + ": ");
			players[i][0] = sc.nextLine();
			System.out.print("Introduce el dosal del juagador " + i + ": ");
			players[i][1] = sc.nextLine();
			System.out.print("Introduce los puntos del juagador " + i + ": ");
			players[i][1] = sc.nextLine();
			System.out.print("Introduce los rebotes del juagador " + i + ": ");
			players[i][1] = sc.nextLine();
			System.out.print("Introduce los robos del juagador " + i + ": ");
			players[i][1] = sc.nextLine();
		}

		do {
			printMenu();
			opt = sn.nextInt();
		} while (opt > 3 || opt < 1);

		switch (opt) {
			case 1:
				for (int i = 0; i < players.length; i++)
					printStatistics(i, players);
				break;
			case 2:
				System.out.print("Introduce el jugador del que quieres ver las estadisticas: ");
				printStatistics(sc.nextInt(), players);
				break;
		}

		sc.close();
		sn.close();
	}

	public static void printMenu() {
		System.out.println("1.	Ver estadísticas de todos los jugadores");
		System.out.println("2.	Ver las estadísticas de 1 jugador");
		System.out.println("3.	Salir");
		System.out.print("--> ");
	}

	public static void printStatistics(int i, String[][] players) {
		System.out.println(players[i][0] + " - nº " + players[i][1] + ", " + players[i][2] + " puntos, "
				+ players[i][3] + " rebotes y " + players[i][4] + " robos");
	}
}
