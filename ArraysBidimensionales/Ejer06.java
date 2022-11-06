package ArraysBidimensionales;

import java.util.Scanner;

public class Ejer06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] notas = new double[5][3];

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Introduce la nota del alumno " + i + " en BBDD: ");
			notas[i][0] = sc.nextDouble();
			System.out.print("Introduce la nota del alumno " + i + " en programación: ");
			notas[i][1] = sc.nextDouble();
			System.out.print("Introduce la nota del alumno " + i + " en móviles: ");
			notas[i][2] = sc.nextDouble();
		}

		int proSum = 0, basSum = 0, movSum = 0;
		for (int i = 0; i < notas.length; i++) {
			basSum += notas[i][0];
			proSum += notas[i][1];
			movSum += notas[i][2];
		}

		System.out.println("La media de las notas de BBDD es" + basSum);
		System.out.println("La media de las notas de programación es" + proSum);
		System.out.println("La media de las notas de móviles es " + movSum);

		sc.close();
	}
}
