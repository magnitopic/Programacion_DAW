package ArraysBidimensionales;

import java.util.Scanner;

public class Ejer04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] people = new String[10][2];

		for (int i = 0; i < people.length; i++) {
			for (int j = 0; j < people[i].length; j++) {
				System.out.print("Introduce un nombre: ");
				people[i][0] = sc.nextLine();
				System.out.print("Introduce un DNI: ");
				people[i][1] = sc.nextLine();
				System.out.print(people[i][j] + "\t");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
