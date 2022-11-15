package Examen2;

import java.util.Scanner;

public class programa5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] datos = new String[10][3];

		for (int i = 0; i < datos.length; i++) {
			System.out.print("Introduce el Nº de la seguridad socual de la persona " + (i + 1) + ": ");
			datos[i][0] = sc.nextLine();
			System.out.print("Introduce el DNI de la persona " + (i + 1) + ": ");
			datos[i][1] = sc.nextLine();
			System.out.print("Introduce la fecha de nacimiento de la persona " + (i + 1) + ": ");
			datos[i][2] = sc.nextLine();
		}

		for (int i = 0; i < datos.length; i++) {
			if (datos[i][2].charAt(3) == '0' && datos[i][2].charAt(4) == '2')
				System.out.println("Nombre: " + datos[i][0] + " - DNI: " + datos[i][1]);
		}
		sc.close();
	}
}