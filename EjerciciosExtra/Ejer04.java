package EjerciciosExtra;

import java.util.Scanner;

public class Ejer04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase = "";

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		String[] count = phrase.split(" ");

		System.out.println(count[count.length - 1]);

		sc.close();
	}
}
