package EjerciciosCondicionales1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num;

		System.out.print("Introduce un numero: ");
		num = sn.nextInt();

		if (num%2==0)
			System.out.println("El numero es par");
		else
			System.out.println("El numero es impar");

		sn.close();
	}

}
