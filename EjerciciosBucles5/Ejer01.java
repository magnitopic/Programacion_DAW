package EjerciciosBucles5;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		do {
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
			if (num > 0)
				System.out.println("El numero es positivo");
			else if (num < 0)
				System.out.println("El numero es negativo");
		} while (num != 0);

		sc.close();
	}
}
