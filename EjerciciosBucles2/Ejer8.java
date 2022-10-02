package EjerciciosBucles2;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		int ages = 0;
		String awser;

		do {
			System.out.print("Introduce una edad: ");
			ages += sc.nextInt();
			System.out.print("Quieres que te siga preguntando?: ");
			awser = si.nextLine();
		} while (awser.equalsIgnoreCase("si"));

		System.out.println("La suma del total de edades es de " + ages);
		sc.close();
		si.close();
	}
}
