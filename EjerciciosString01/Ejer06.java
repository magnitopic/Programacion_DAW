package EjerciciosString01;

import java.util.Scanner;

public class Ejer06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, surname, dni, datos;

		System.out.print("Introduce tu nombre: ");
		name = sc.nextLine();
		System.out.print("Introduce tu apellido: ");
		surname = sc.nextLine();
		System.out.print("Introduce tu DNI: ");
		dni = sc.nextLine();

		datos = String.join(" - ", name, surname, dni);

		System.out.println(datos);

		sc.close();
	}
}
