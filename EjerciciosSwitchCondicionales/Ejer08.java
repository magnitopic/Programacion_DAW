package EjerciciosSwitchCondicionales;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int gender, height, age;
		double weight, tmb;

		System.out.println("Especifica tu genero.");
		System.out.println("1.	Hombre");
		System.out.println("2.	Mujer");
		System.out.print("--> ");
		gender = sn.nextInt();

		System.out.print("Introduce tu peso en KG: ");
		weight = sn.nextDouble();
		System.out.print("Introduce tu altura en cm: ");
		height = sn.nextInt();
		System.out.print("Introduce tu edad: ");
		age = sn.nextInt();

		if (gender == 1) {
			tmb = (10 * weight) + (6.25 * height) - (5 * age) + 5;
			System.out.println("Tu metabolismo basal es de " + tmb);
		} else if (gender == 2) {
			tmb = (10 * weight) + (6.25 * height) - (5 * age) - 161;
			System.out.println("Tu metabolismo basal es de " + tmb);
		} else
			System.out.println("Datos proporcionados invalidos");

		sn.close();
	}
}
