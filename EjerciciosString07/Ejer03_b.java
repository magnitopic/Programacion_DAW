package EjerciciosString07;

import java.util.Scanner;

public class Ejer03_b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;
		boolean flag = false;
		int count = 0;
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == ' ' && !flag) {
				count++;
				flag = true;
			}
			if (phrase.charAt(i) != ' ')
				flag = false;
		}

		System.out.println("Hay " + (count + 1) + " palabras");
		sc.close();
	}
}
