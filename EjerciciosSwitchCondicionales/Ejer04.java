package EjerciciosSwitchCondicionales;

import java.util.Scanner;

public class Ejer04 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double hourWage, salary = 0;
		int workTime;

		System.out.print("Introduce tu numero de horas trabajadas: ");
		workTime = sn.nextInt();
		System.out.print("Introduce tu tarifa por hora: ");
		hourWage = sn.nextDouble();

		if (workTime > 40) {
			salary += (workTime - 40) * (hourWage + (hourWage * .5));
			workTime = 40;
		}

		salary += workTime * hourWage;

		System.out.println("El salario es de " + salary + "€");

		sn.close();
	}
}
