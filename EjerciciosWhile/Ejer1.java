package EjerciciosWhile;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String name;
		int i = 1;

		System.out.print("Introduce tu nombre: ");
		name = sn.nextLine();

		while (i <= 3450) {
			System.out.println(name);
			i++;
		}

		sn.close();
	}
}
