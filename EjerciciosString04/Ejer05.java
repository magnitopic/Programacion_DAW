package EjerciciosString04;

import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		for (int i = phrase.length() - 1; i >= 0; i--){
			System.out.print(phrase.charAt(i));
		}


		sc.close();
	}
}