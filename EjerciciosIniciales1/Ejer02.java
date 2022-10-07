package EjerciciosIniciales1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int edad = 0;
		String name;
		int phone = 0;

		System.out.print("Introduzca su edad: ");
		edad = sc.nextInt();
		System.out.print("Introduzca su nombre y apellidos: ");
		name = sn.nextLine();
		System.out.print("Introduzca su teléfono: ");
		phone = sc.nextInt();
		
		
		System.out.print("Ud se llama " + name + ". Tienes " + edad + " años. Y su teléfono es " + phone);
		sc.close();
		sn.close();
	}

}
