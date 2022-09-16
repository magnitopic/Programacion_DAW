package EjerciciosCondicionales1;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num1, num2;

		System.out.print("Introduce un numero: ");
		num1 = sn.nextInt();
		System.out.print("Introduce otro numero: ");
		num2 = sn.nextInt();

		if (num1==num2)
			System.out.println("Los numero son iguales");

		sn.close();
	}

}
