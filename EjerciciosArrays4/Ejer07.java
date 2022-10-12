package EjerciciosArrays4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int students = 50;
		double sum = 0, best = Double.MIN_VALUE;
		String pos = "";
		String[] names = new String[students];
		double[][] marks = new double[4][students];
		String[] asigments = { "Programación", "Móviles", "Marcas", "BBDD" };

		for (int i = 0; i < students; i++) {
			System.out.print("Introduce el nombre de un alumno: ");
			names[i] = sc.nextLine();
			for (int j = 0; j < marks.length; j++) {
				System.out.print("Introduce la nota de " + asigments[j] + ": ");
				marks[j][i] = sn.nextDouble();
			}
		}

		// Nota media Programación
		System.out.println("La media de " + asigments[0] + " es de: " + (Arrays.stream(marks[0]).sum() / students));
		// Nota media Móviles
		System.out.println("La media de " + asigments[1] + " es de: " + (Arrays.stream(marks[1]).sum() / students));
		// Mejor media Marcas
		for (int i = 0; i < students; i++) {
			sum = 0;
			best = Double.MIN_VALUE;
			if (marks[2][i] > best) {
				pos = names[i];
				best = sum;
			}
		}
		System.out.println("El alumno con mejor nota en "+asigments[2]+" es " + pos + " con una nota media de " + best);
		// Mejor media BBDD
		for (int i = 0; i < students; i++) {
			sum = 0;
			best = Double.MIN_VALUE;
			if (marks[3][i] > best) {
				pos = names[i];
				best = sum;
			}
		}
		System.out.println("El alumno con mejor nota en "+asigments[3]+" es " + pos + " con una nota media de " + best);

		for (int i = 0; i < students; i++) {
			sum = 0;
			best = Double.MIN_VALUE;
			for (int j = 0; j < marks.length; j++)
				sum = +marks[j][i];
			sum /= marks.length;
			if (sum > best) {
				pos = names[i];
				best = sum;
			}
		}
		System.out.println("El alumno con mejor nota es " + pos + " con una nota media de " + best);

		sc.close();
		sn.close();
	}
}
