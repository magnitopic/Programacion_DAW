package EjerciciosString06;

import java.util.Scanner;

public class Ejer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		String[] words = phrase.split(" ");

		for (int i = 0; i < words.length; i++)
			System.out.println(words[i]);

		sc.close();
	}
}
