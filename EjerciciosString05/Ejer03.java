package EjerciciosString05;

import java.util.Scanner;

public class Ejer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase = "";

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		String[] count = phrase.split(" ");

		int largest = Integer.MIN_VALUE, pos = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[i].length() > largest) {
				largest = count[i].length();
				pos = i;
			}
		}

		System.out.println("La palabra más grande es " + count[pos] + "con una longitud de " + largest);

		sc.close();
	}
}
