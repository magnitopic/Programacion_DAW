package EjerciciosString07;

import java.util.Scanner;

public class Ejer06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase, new_phrase = "";
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) != ' ')
				new_phrase += phrase.charAt(i);
		}

		System.out.println(new_phrase);
		sc.close();
	}
}
