package EjerciciosString07;

import java.util.Scanner;

public class Ejer08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		String[] words = phrase.split(" ");

		for (int i = words.length - 1; i >= 0; i--)
			System.out.print(words[i] + " ");

		sc.close();
	}
}
