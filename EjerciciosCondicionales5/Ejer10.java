package EjerciciosCondicionales5;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;

		System.out.print("Introduce un año: ");
		year = sc.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			System.out.println("El año es bisiesto");
		else
			System.out.println("EL año no es bisiesto");

		sc.close();
	}
}
