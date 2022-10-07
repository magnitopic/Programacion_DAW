package EjerciciosCondicionales1;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num;

		System.out.print("Introduce un numero: ");
		num = sn.nextInt();

		if (num > 100)
			System.out.println("El numero es mayor que 100");

		sn.close();
	}

}
