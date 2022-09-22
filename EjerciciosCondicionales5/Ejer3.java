package EjerciciosCondicionales5;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Introduzca un numero: ");
		num = sc.nextInt();

		if (num < 1000)
			System.out.println("Para llegar a 1000 te faltan " + (1000 - num) + " unidades");
		else if (num > 1000 && num < 15000)
			System.out.println("Para llegar a 15000 te faltan " + (15000 - num) + " unidades");
		else if (num == 1000)
			System.out.println("El 3% de 1000 es 30");
		sc.close();
	}
}
