package EjerciciosSwitchCondicionales;

import java.util.Scanner;

public class Ejer03 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String name;

		System.out.print("Introduce tu nombre: ");
		name = sn.nextLine();

		switch (name) {
			case "Antonio":
				System.out.println("Normalito");
				break;
			case "Erique":
				System.out.println("Resutón");
				break;
			case "Raúl":
				System.out.println("Del montón");
				break;
			case "Rafael":
				System.out.println("Pufff...");
				break;
			case "Jośe":
				System.out.println("Guapete");
				break;
			case "Jorge":
				System.out.println("Tremendamente Atractivo");
				break;
		}

		sn.close();
	}
}
