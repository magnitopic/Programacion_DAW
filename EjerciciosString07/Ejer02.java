package EjerciciosString07;

import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase, phrase_rev = "";
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		for (int i = phrase.length(); i > 0; i--)
			phrase_rev += phrase.charAt(i);

		if (phrase.equals(phrase_rev))
			System.out.println("La palabra es un palindromo");
		else
			System.out.println("La palabra no es un palindromo");

		sc.close();
	}
}
