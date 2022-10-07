package EjerciciosCondicionales1;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num;

		System.out.print("Introduce un numero: ");
		num = sn.nextInt();

		if (num == 0)
			System.out.println("El numero es 0");

		sn.close();
	}

}
