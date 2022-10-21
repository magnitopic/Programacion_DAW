package Examen1;

import java.util.Scanner;

public class juegos5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String[] nombre = new String[50];
		double[] nota = new double[50];
		int[] edad = new int[50];
		int[] hijos = new int[50];
		double[] altura = new double[50];

		for (int i = 0; i < 50; i++) {
			System.out.print("Introduce el nombre del alumno: ");
			nombre[i] = sc.nextLine();
			System.out.println("Introduce la nota del alumno: ");
			nota[i] = sn.nextDouble();
			System.out.println("Introduce la edad del alumno: ");
			edad[i] = sn.nextInt();
			System.out.println("Introduce el numero de hijos del alumno: ");
			hijos[i] = sn.nextInt();
			System.out.println("Introduce la altura del alumno(en metros): ");
			altura[i] = sn.nextDouble();
		}

		for (int i = 0; i < 50; i++) {
			if ((altura[i] >= 1.60 && altura[i] <= 1.89) && (nota[i] >= 5) && (edad[i] > 15)) {
				System.out.println("Alumno: " + nombre[i] + " con nota " + nota[i] + " y " + edad[i] + " años de edad tiene " + hijos[i] + " hijos y mide " + altura[i] + "m");
			}
		}

		sc.close();
		sn.close();
	}
}
