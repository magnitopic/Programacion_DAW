package EjerciciosBucles2;

import java.util.Scanner;

public class Ejer11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resp;
		do {
			System.out.println("1. Crear usuario.");
			System.out.println("2. Eliminar usuario.");
			System.out.println("3. Modificar usuario.");
			System.out.println("4. Visualizar datos usuario.");
			System.out.println("5. Salir.");
			System.out.print("--> ");
			resp = sc.nextInt();
			if (resp == 1)
				System.out.println("Nos permite crear un usuario con ");
			else if (resp == 2)
				System.out.println("Resetear la información del ususario");
			else if (resp == 3)
				System.out.println("Modificar la información ya existente de un usuario");
			else if (resp == 4)
				System.out.println("Ver los datos almacenados del ususario.");
		} while (resp != 5);
		sc.close();
	}
}
