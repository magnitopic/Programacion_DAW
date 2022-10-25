package EjerciciosArrays10;

import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int num, count = 0;

		for (int i = 0; i < 20; i++) {
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
			if (num == 1)
				flag = false;
			for (int j = 2; j < num - 1; j++) {
				if (num % j == 0)
					flag = false;
			}
			if (flag)
				count++;
		}

		if (count > 15)
			System.out.println("Hay más de 15 numeros primos");
		else
			System.out.println("No hay más de 15 numeros primos");

		sc.close();
	}
}
