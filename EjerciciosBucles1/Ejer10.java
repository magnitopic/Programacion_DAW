package EjerciciosBucles1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min, max, num;

		System.out.print("Introduce el menor numero: ");
		min = sc.nextInt();

		System.out.print("Introduce el mayor numero: ");
		max = sc.nextInt();
		if (min > max) {
			sc.close();
			return;
		}
		do {
			System.out.print("Introduce un numero entre los anteriores: ");
			num = sc.nextInt();
		} while (!((num > min) && (num < max)));

		System.out.println(num + " se encuentra entre " + max + " y " + min);

		sc.close();

	}

}
