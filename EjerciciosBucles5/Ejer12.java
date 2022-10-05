package EjerciciosBucles5;

import java.util.Scanner;

public class Ejer12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce una nota: ");
			if (sc.nextDouble() < 5)
				flag = true;
		}
		if (flag)
			System.out.println("Algún alumno ha suspendido.");
		else
			System.out.println("Ningún alumno ha suspendido");
		sc.close();
	}
}
