package EjerciciosString07;

import java.util.Scanner;

public class Ejer03_a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		String[] words = phrase.split(" ");

		System.out.println("Hay "+words.length+" palabras");

		sc.close();
	}
}
