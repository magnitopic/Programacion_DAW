package EjerciciosString07;

import java.util.Scanner;

public class Ejer04 {
	public static void main(String[] args) {
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
		Scanner sc = new Scanner(System.in);
		String phrase;
		int count = 0;
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		for (int i = 0; i < phrase.length(); i++) {
			for (int j = 0; j < vocales.length; j++) {
				if (phrase.charAt(i) == vocales[j])
					count++;
			}
		}

		System.out.println("Hay " + count + " vocales");
		sc.close();
	}
}
