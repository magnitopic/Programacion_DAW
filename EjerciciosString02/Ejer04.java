import java.util.Scanner;

public class Ejer04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		phrase = phrase.replaceAll(" ", "");

		System.out.println(phrase);

		sc.close();
	}
}
