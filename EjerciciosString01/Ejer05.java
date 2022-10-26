package EjerciciosString01;

import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		System.out.println(phrase.replace(" ", ""));
		sc.close();
	}
}
