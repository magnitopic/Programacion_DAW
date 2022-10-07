package EjerciciosBucles1;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.print("Introduce un numero: ");
		num1 = sc.nextInt();
		System.out.print("Introduce un numero: ");
		num2 = sc.nextInt();

		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				if (i % 2 != 0)
					System.out.print(i + " ,");
			}
		} else {
			for (int i = num2; i <= num1; i++)
				if (i % 2 != 0)
					System.out.print(i + ", ");
		}
		sc.close();
	}

}
