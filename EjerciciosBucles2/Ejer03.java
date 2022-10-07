package EjerciciosBucles2;

import java.util.Scanner;

public class Ejer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fails = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce la nota de un alumno: ");
			if (sc.nextDouble() <= 5)
				fails++;
		}

		System.out.println("Hay "+fails+" suspensos");

		sc.close();
	}
}
