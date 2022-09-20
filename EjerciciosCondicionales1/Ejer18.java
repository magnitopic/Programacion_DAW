package EjerciciosCondicionales1;

import java.util.Scanner;

public class Ejer18 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int day, month, year;

		System.out.print("Introduce el dia: ");
		day = sn.nextInt();
		System.out.print("Introduce el mes: ");
		month = sn.nextInt();
		System.out.print("Introduce el año: ");
		year = sn.nextInt();

		if ((day > 1 && day < 31) && (month > 1 && month < 12) && (year > 2000 && year < 2100))
			System.out.println("La fecha es valida");
		else 
			System.out.println("La fecha es invalida, vuelve a intentarlo");

		sn.close();
	}
}
