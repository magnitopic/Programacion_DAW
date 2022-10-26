package HundirElImperio;

import java.util.Scanner;

public class HundirElImperio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String[][] tableroAlianza = new String[10][10];
		String[][] tableroImperio = new String[10][10];
		int opt, x, y;
		String opt2;

		// Pedir posiciones de naves
		// user 1
		do {
			System.out.println("Jugador 1, quieres general la posición de las naves de manera aleatoria?(y,n)");
			System.out.print("--> ");
			opt2 = sn.nextLine();
		} while (!opt2.equalsIgnoreCase("y") && !opt2.equalsIgnoreCase("n"));

		if (opt2.equalsIgnoreCase("n")) {
			for (int j = 0; j < 6; j++) {
				do {
					System.out.print("Introduce la posición X de la nave " + (j + 1) + ": ");
					x = sc.nextInt();
					System.out.print("Introduce la posición Y de la nave " + (j + 1) + ": ");
					y = sc.nextInt();
				} while (!(x <= 9 && x >= 0 && y <= 9 && y >= 0) || tableroAlianza[x][y] == "H");
				tableroAlianza[x][y] = "H";
			}
		} else
			randomTable(tableroAlianza);

		// user 2
		do {
			System.out.println("Jugador 2, quieres general la posición de las naves de manera aleatoria?(y,n)");
			System.out.print("--> ");
			opt2 = sn.nextLine();
		} while (!opt2.equalsIgnoreCase("y") && !opt2.equalsIgnoreCase("n"));

		if (opt2.equalsIgnoreCase("n")) {
			for (int j = 0; j < 6; j++) {
				do {
					System.out.print("Introduce la posición X de la nave " + (j + 1) + ": ");
					x = sc.nextInt();
					System.out.print("Introduce la posición Y de la nave " + (j + 1) + ": ");
					y = sc.nextInt();
				} while (!(x <= 9 && x >= 0 && y <= 9 && y >= 0) || tableroImperio[x][y] == "H");
				tableroImperio[x][y] = "H";
			}
		} else
			randomTable(tableroImperio);

		// Gameplay

		while (true) {
			for (int j = 0; j < tableroAlianza.length; j++)
				System.out.print("- ");
			System.out.println("\n1.	Hacer lanzamiento Alianza.");
			System.out.println("2.	Hacer lanzamiento Imperio.");
			System.out.println("3.	Mostrar Tablero Alianza.");
			System.out.println("4.	Mostrar Tablero Imperio.");
			System.out.println("5.	Salir.");
			System.out.print("--> ");
			opt = sc.nextInt();
			switch (opt) {
				case 1:
					makeLauch(tableroImperio, sc);
					break;
				case 2:
					makeLauch(tableroAlianza, sc);
					break;
				case 3:
					printBoard(tableroAlianza, "ALIANZA");
					break;
				case 4:
					printBoard(tableroImperio, "IMPERIO");
					break;
				default:
					sc.close();
					sn.close();
					return;
			}
		}

	}

	public static void makeLauch(String[][] board, Scanner sc) {
		int x, y;
		boolean flag = false;
		do {
			flag = false;
			do {
				System.out.print("Intoduce la cordenada X donde se quiere hacer un lanzamiento: ");
				x = sc.nextInt();
				System.out.print("Intoduce la cordenada Y donde se quiere hacer un lanzamiento: ");
				y = sc.nextInt();
			} while (!(x <= 9 && x >= 0 && y <= 9 && y >= 0));

			if (board[y][x] != null) {
				if (board[y][x].equalsIgnoreCase("h")) {
					System.out.println("Nave destruida!!");
					board[y][x] = "X";
				} else if (board[y][x].equalsIgnoreCase("a")) {
					flag = true;
					System.out.println("Esta posición ya ha sido atacada.");
				} else if (board[y][x].equalsIgnoreCase("x")) {
					flag = true;
					System.out.println("Esta nave ya ha sido destruida.");
				}
			} else {
				System.out.println("No hay nada en esta posición");
				board[y][x] = "A";
			}

		} while (flag);
	}

	public static void randomTable(String[][] board) {
		int i = 0;
		int x, y;
		while (i < 6) {
			x = (int) (Math.random() * 10);
			y = (int) (Math.random() * 10);
			if (board[x][y] != "H") {
				board[x][y] = "H";
				i++;
			}
		}
	}

	public static void printBoard(String[][] board, String name) {
		String[] letrasTablero = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		for (int j = 0; j < board.length * 2 + 1; j++)
			System.out.print("- ");

		System.out.print("\n");
		for (int i = 0; i < name.length(); i++)
			System.out.print("    " + name.charAt(i));

		System.out.print("\n");
		for (int j = 0; j < board.length * 2 + 1; j++)
			System.out.print("- ");

		System.out.print("\n ");
		for (int i = 0; i < 10; i++)
			System.out.print(" | " + i);
		System.out.print("\n");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length * 2 + 1; j++)
				System.out.print("- ");
			System.out.print("\n");
			System.out.print(letrasTablero[i] + " ");
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == null)
					System.out.print("| 0 ");
				else
					System.out.print("| " + board[i][j] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
