package EjerciciosArrays2;

import java.util.Scanner;

public class Ejer07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		double[] salaries = new double[20];
		String[] names = new String[20];
		int maxPos = 0;
		double maxSalary = Integer.MIN_VALUE;

		for (int i = 0; i < 20; i++) {
			System.out.print("Introduce el nombre de un trabajador: ");
			names[i] = si.nextLine();
			System.out.print("Introduce su salario: ");
			salaries[i] = sc.nextDouble();
			if (salaries[i] > maxSalary) {
				maxPos = i;
				maxSalary = salaries[i];
			}
		}

		System.out.println("El empleado que más gana es " + names[maxPos] + " ganando " + salaries[maxPos] + "€");

		sc.close();
		si.close();
	}
}
