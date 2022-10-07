package EjerciciosBucles5;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		do {
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
			if (num % 2 == 0 && num != 0)
				System.out.println("El numero es par");
			else if (num % 2 != 0 && num != 0)
				System.out.println("El numero es impar");
		} while (num != 0);

		sc.close();
	}
}
