package EjerciciosCondicionales1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num;

		System.out.print("Introduce un numero: ");
		num = sn.nextInt();

		if (num >= 0)
			System.out.println("El numero es positivo");
		else
			System.out.println("El numero es negativo");

		sn.close();
	}

}
