package EjerciciosCondicionales1;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num1, num2, num3;

		System.out.print("Introduce un numero: ");
		num1 = sn.nextInt();
		System.out.print("Introduce otro numero: ");
		num2 = sn.nextInt();
		System.out.print("Introduce un ultimo numero: ");
		num3 = sn.nextInt();

		if (num1 > num2)
			System.out.println("El primer numero es mayor");
		else if (num1 < num2)
			System.out.println("El segundo numero es mayor");
		else
			System.out.println("Los dos numero son iguales");

		sn.close();
	}

}