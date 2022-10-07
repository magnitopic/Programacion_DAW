package EjerciciosCondicionales2;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int puntos;

		System.out.print("Introduce cuntos puntos tienes: ");
		puntos = sn.nextInt();

		if (puntos >= 120)
			System.out.println("Informática, Sistemas, Derecho, Empresariales, Bilogía");
		else if (puntos >= 100)
			System.out.println("Sistemas, Derecho, Empresariales, Bilogía");
		else if (puntos >= 90)
			System.out.println("Derecho, Empresariales, Bilogía");
		else if (puntos >= 79)
			System.out.println("Empresariales, Bilogía");
		else if (puntos >= 45)
			System.out.println("Bilogía");
		else
			System.out.println("Ud no puede acceder a numgún grado.");
		sn.close();
	}

}
