package EjerciciosFor;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String name;

		System.out.print("Introduce tu nombre: ");
		name = sn.nextLine();

		for (int i = 0; i < 3450; i++) {
			System.out.println(name);
		}

		sn.close();
	}

}
