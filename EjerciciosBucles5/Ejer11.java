package EjerciciosBucles5;

import java.util.Scanner;

public class Ejer11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Introduce un numero: ");
		num = sc.nextInt();

		sc.close();
		if (num > 10 || num < 0)
			return;

		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= num; j++)
				System.out.print(i + " x " + j + " = " + (i * j) + " \t");
			System.out.print("\n");
		}

	}
}
