package EjerciciosBucles2;

import java.util.Scanner;

public class Ejer12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		String name = "", dni = "", address = "";
		int age = 0;
		int resp;
		do {
			System.out.println("1. Crear usuario.");
			System.out.println("2. Eliminar usuario.");
			System.out.println("3. Modificar usuario.");
			System.out.println("4. Visualizar datos usuario.");
			System.out.println("5. Salir.");
			System.out.print("--> ");
			resp = sc.nextInt();
			if (resp == 1 || resp == 3) {
				System.out.print("Introduce un nombre: ");
				name = si.nextLine();
				System.out.print("Introduce tu edad: ");
				age = sc.nextInt();
				System.out.print("Introduce tu dni: ");
				dni = si.nextLine();
				System.out.print("Introduce tu dirección: ");
				address = si.nextLine();
			} else if (resp == 2) {
				name = "";
				dni = "";
				address = "";
				age = 0;
			}
			else if (resp == 4) {
				System.out.println("Nombre: " + name);
				System.out.println("Edad: " + age);
				System.out.println("DNI: " + dni);
				System.out.println("Dirección: " + address);
			}
		} while (resp != 5);

		si.close();
		sc.close();
	}
}
