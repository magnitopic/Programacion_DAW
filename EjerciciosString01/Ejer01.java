package EjerciciosString01;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, address;

		System.out.print("Introduce tu nombre: ");
		name = sc.nextLine();
		System.out.println("Introduce tu dirección: ");
		address = sc.nextLine();

		System.out.println("La suma de las longitudes de los strings es " + (name.length() + address.length()));

		sc.close();
	}
}
