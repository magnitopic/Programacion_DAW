package EjerciciosExtra;

import java.util.Scanner;

public class Ejer07 {
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
			int count = 0;
			for (int j = 0; j < words[i].length(); j++) {
				if (words[i].charAt(j) == letra)
					count++;
			}
			System.out.println("La letra " + letra + " aparece " + count + " veces en " + words[i]);
		}

		sc.close();
	}
}
