package EjerciciosBucles5;

import java.util.Scanner;

public class Ejer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, numCount = 0;

		do {
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
			numCount++;
		} while (num >= 0);

		System.out.println("Se han introducido " + numCount + " numeros.");

		sc.close();
	}
}
