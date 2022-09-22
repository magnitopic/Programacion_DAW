package EjerciciosCondicionales5;

import java.util.Scanner;

public class Ejer11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Introduce un numero: ");
		num = sc.nextInt();

		if ((num % 3 == 0) || (num % 3 == 0))
			System.out.println("El numero es multiplo de dos o de tres");

		sc.close();
	}
}
