package EjerciciosString02;

import java.util.Scanner;

public class Ejer08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letters = "";
		for (int i = 0; i < 5; i++) {
			String phrase="";
			System.out.print("Introduce una frase: ");
			phrase = sc.nextLine();

			letters = letters.concat(Character.toString(phrase.charAt(3)));
		}
		
		System.out.println(letters);
		sc.close();
	}
}