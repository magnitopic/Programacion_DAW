package EjerciciosString05;

import java.util.Scanner;

public class Ejer04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase, phrase2 = "";
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		for (int i = 1; i < phrase.length(); i += 2) {
			phrase2 += phrase.charAt(i);
		}

		System.out.println(phrase2);
		sc.close();
	}
}
