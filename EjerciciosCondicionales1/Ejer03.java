package EjerciciosCondicionales1;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num1, num2;

		System.out.print("Introduce un numero: ");
		num1 = sn.nextInt();
		System.out.print("Introduce otro numero: ");
		num2 = sn.nextInt();

		if ((num1*num2)>=200)
			System.out.println("La suma de los numero es mayor o igual a 200");

		sn.close();
	}

}
