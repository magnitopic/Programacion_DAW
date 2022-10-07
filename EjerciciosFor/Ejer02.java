package EjerciciosFor;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		int num1, num2;

		System.out.print("Introduce el numero pequeño: ");
		num1 = si.nextInt();
		System.out.print("Introduce el numero grande: ");
		num2 = si.nextInt();

		for (int i = num1 + 1; i < num2; i++) {
			System.out.println(i);
		}

		si.close();
	}

}
