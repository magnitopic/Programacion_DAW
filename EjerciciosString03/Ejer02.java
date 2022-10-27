package EjerciciosString03;

import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase = "";
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();
		for (int i = 0; i < phrase.length(); i++)
			if (phrase.charAt(i) != ' ')
				System.out.print(phrase.charAt(i));
		sc.close();
	}
}
