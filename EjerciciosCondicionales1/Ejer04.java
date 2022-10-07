package EjerciciosCondicionales1;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double num1, num2, num3, num4;

		System.out.print("Introduce el primer salario: ");
		num1 = sn.nextDouble();
		System.out.print("Introduce el segundo salario: ");
		num2 = sn.nextDouble();
		System.out.print("Introduce el tercer salario: ");
		num3 = sn.nextDouble();
		System.out.print("Introduce el cuarto salario: ");
		num4 = sn.nextDouble();

		if ((num1 + num2 + num3 + num4) > 5000)
			System.out.println("La suma de los salarios es mayor a 5000€");

		sn.close();
	}
}
