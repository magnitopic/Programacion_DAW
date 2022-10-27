import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] vocales = {'a','e','i','o','u'};
		String phrase;
		int count=0;

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		for (int i = 0; i < phrase.length(); i++){
			for (int j = 0; j < phrase.length(); j++){
				if (phrase.charAt(i) == vocales[j])
					count++;
			}
		}

		System.out.println("Aparecen "+count+" vocales.");

		sc.close();
	}
}
