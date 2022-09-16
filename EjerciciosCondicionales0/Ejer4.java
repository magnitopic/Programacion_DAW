package EjerciciosCondicionales0;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double time, salary = 0;

		System.out.print("Introduce el numero de horas trabajadas esta semana: ");
		time = sn.nextDouble();

		if (time > 20) {
			salary = (time - 20) * 30;
			time = 20;
		}
		salary += time * 25;

		System.out.println("Tu sueldo semanal es de: " + salary + "€");

		sn.close();
	}

}
