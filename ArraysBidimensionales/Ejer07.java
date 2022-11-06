package ArraysBidimensionales;

import java.util.Scanner;

public class Ejer07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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

		for (int i = 0; i < players.length; i++) {
			System.out.println(players[i][0] + " - nº " + players[i][1] + ", " + players[i][2] + " puntos, "
					+ players[i][3] + " rebotes y " + players[i][4] + " robos");
		}

		sc.close();
	}
}
