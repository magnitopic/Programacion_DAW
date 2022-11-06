package ArraysBidimensionales;

import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número de personas: ");
		int num = sc.nextInt();

		boolean[][] people = new boolean[num][2];

		for (int i = 0; i < people.length; i++) {
			System.out.print("Introduce si esta persona es religiosa: ");
			people[i][0] = sc.nextBoolean();
			System.out.print("Introduce si esta persona es vegetariana: ");
			people[i][1] = sc.nextBoolean();
		}

		for (int i = 0; i < people.length; i++)
			System.out.println("Persona " + i + ": Religiosa" + people[i][0] + " - Vegetariana: " + people[i][1]);

		sc.close();
	}
}
