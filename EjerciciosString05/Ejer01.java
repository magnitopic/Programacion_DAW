package EjerciciosString05;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		for (int i = 0; i < phrase.length(); i += 2) {
			for (int j = 0; j < (phrase.charAt(i) - '0'); j++)
				System.out.print(phrase.charAt(i + 1));
		}

		sc.close();
	}
}
