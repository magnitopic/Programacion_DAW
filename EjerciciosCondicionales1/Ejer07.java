package EjerciciosCondicionales1;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num1, num2;

		System.out.print("Introduce un numero: ");
		num1 = sn.nextInt();
		System.out.print("Introduce otro numero: ");
		num2 = sn.nextInt();

		if ((num1+num2)<=50)
			System.out.println("La suma de los numero es menor a 50");
		else
			System.out.println("La suma de los numero no es menor a 50");

		sn.close();
	}

}
