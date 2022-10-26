import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase;

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) != 'A' && phrase.charAt(i) != 'B')
				phrase = phrase.replaceAll(Character.toString(phrase.charAt(i)),
						Character.toString(phrase.charAt(i)).toLowerCase());

		}

		System.out.println(phrase);

		sc.close();
	}
}
