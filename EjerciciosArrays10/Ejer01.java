package EjerciciosArrays10;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int num;

		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
			if (num == 1)
				flag = false;
			for (int j = 2; j < num - 1; j++) {
				if (num % j == 0)
					flag = false;
			}
		}

		if (flag)
			System.out.println("Los cinco numeros son primos");
		else
			System.out.println("No todos los numero son primos");

		sc.close();
	}
}
