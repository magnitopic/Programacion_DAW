package EjerciciosString05;

import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase = "";

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		String[] count = phrase.split(" ");

		System.out.println("Hay " + count.length + " palabras");

		sc.close();
	}
}
