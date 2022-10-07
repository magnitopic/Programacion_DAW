package EjerciciosCondicionales1;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double salary;

		System.out.print("Introduce tu salario mensual: ");
		salary = sn.nextDouble();

		if (salary >= 1000)
			System.out.println("Eres un afortunado");
		else
			System.out.println("Eres un Héroe");

		sn.close();
	}

}
