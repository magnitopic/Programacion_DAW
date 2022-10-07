package EjerciciosFor;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		int age;

		System.out.print("Introduce tu edad: ");
		age = si.nextInt();

		for (int i = 0 + 1; i < age; i++) {
			System.out.println("Paisano");
		}

		si.close();
	}

}
