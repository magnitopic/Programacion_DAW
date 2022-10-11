package EjerciciosArrays2;

import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		double[] nums = new double[10];
		String[] names = new String[10];
		String[] marks = new String[10];
		double num;

		for (int i = 0; i < names.length; i++) {
			System.out.print("Introduce el nombre del alumno: ");
			names[i] = si.nextLine();
			do {
				System.out.print("Introduce una nota: ");
				num = sc.nextDouble();
			} while (!(num <= 10 && num >= 0));

			nums[i] = num;
			if (num < 5)
				marks[i] = "Suspenso";
			else if (num < 7)
				marks[i] = "Bien";
			else if (num < 9)
				marks[i] = "Notable";
			else
				marks[i] = "Sobresaliente";
		}

		for (int i = 0; i < names.length; i++) {
			System.out.println("Alumno nº" + (i + 1) + ": " + names[i] + " - Nota: " + nums[i] + " - " + marks[i]);
		}

		sc.close();
		si.close();
	}
}
