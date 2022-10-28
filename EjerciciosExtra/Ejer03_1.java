package EjerciciosExtra;

import java.util.Scanner;

public class Ejer03_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase = "";
		int count = 0;

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == 32)
				count++;
		}

		System.out.println("Hay " + (count + 1) + " palabras");

		sc.close();
	}
}
