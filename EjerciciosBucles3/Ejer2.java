package EjerciciosBucles3;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		int num, par = 0, impar = 0, primo = 0;
		boolean flag;

		do {
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
			if (num % 2 == 0)
				par++;
			else
				impar++;
			flag = true;
			/* Comprobar que el numero es primo */
			for (int j = 2; j < (num - 1); j++) {
				if (num % j == 0 || num == 1) {
					flag = false;
					break;
				}
			}
			if (flag) {
				primo++;
			}
			System.out.print("Desea seguir introduciendo numeros?: ");
		} while (si.nextLine().equalsIgnoreCase("si"));

		System.out.println("Hay " + par + " numeros pares.");
		System.out.println("Hay " + impar + " numeros impares.");
		System.out.println("Hay " + primo + " numeros primos.");

		sc.close();
		si.close();
	}

}
