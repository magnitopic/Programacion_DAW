package EjerciciosString07;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer07 {
	public static void main(String[] args) {
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
		Scanner sc = new Scanner(System.in);
		String phrase;
		int count = 0;
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		String[] words = phrase.split(" ");

		for (int i = 0; i < words.length; i++) {
			int[] flags = { 0, 0, 0, 0, 0 };
			for (int j = 0; j < words[i].length(); j++) {
				for (int k = 0; k < vocales.length; k++) {
					if (words[i].charAt(j) == vocales[k])
						flags[k] = 1;
				}
			}
			if (Arrays.stream(flags).sum() >= 4)
				count++;
		}

		System.out.println("Hay " + count + " palabras que cumplen las condiciones");

		sc.close();
	}
}
