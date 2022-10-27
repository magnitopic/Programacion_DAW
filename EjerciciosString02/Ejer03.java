package EjerciciosString02;

import java.util.Scanner;

public class Ejer03 {
	public static void main(String[] args) {
		String[] vocales = { "a", "e", "i", "o", "u" };
		Scanner sc = new Scanner(System.in);
		String phrase;

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		for (int j = 0; j < vocales.length; j++) {
			phrase = phrase.replaceAll(vocales[j], vocales[j].toUpperCase());
		}

		System.out.println(phrase);

		sc.close();
	}
}
