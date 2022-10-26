import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		String letter1 = phrase.substring(0, 1);
		String lastletter = phrase.substring((phrase.length() - 1), (phrase.length()));
		String newWord = letter1.toUpperCase()
				+ phrase.substring(1, phrase.length() - 1)
				+ lastletter.toUpperCase();

		System.out.println(newWord);

		sc.close();
	}
}
