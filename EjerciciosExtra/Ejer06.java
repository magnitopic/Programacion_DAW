package EjerciciosExtra;

import java.util.Scanner;

public class Ejer06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase = "";
		char letra;

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		System.out.print("Introduce una letra: ");
		letra = sc.nextLine().charAt(0);

		String[] words = phrase.split(" ");

		for (int i = 0; i < words.length; i++) {
			if (words[i].charAt(0) == letra || words[i].charAt(words[i].length() - 1) == letra)
				System.out.println(words[i]);
		}
		sc.close();
	}
}
