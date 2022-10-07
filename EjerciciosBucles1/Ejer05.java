package EjerciciosBucles1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		int names = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Introduce un nombre");
			names++;
		} while (sc.nextLine().equalsIgnoreCase("Pablito Escobar"));

		System.out.println("Nombres introducuidos: " + names);
		System.out.println("Plata o plomo");
		sc.close();
	}

}
