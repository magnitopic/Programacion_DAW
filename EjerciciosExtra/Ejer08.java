package EjerciciosExtra;

import java.util.Scanner;

public class Ejer08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase = "";
		int count = 0;
		char letra1, letra2, letra3;

		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		System.out.print("Introduce una letra: ");
		letra1 = sc.nextLine().charAt(0);

		System.out.print("Introduce una letra: ");
		letra2 = sc.nextLine().charAt(0);

		System.out.print("Introduce una letra: ");
		letra3 = sc.nextLine().charAt(0);

		String[] words = phrase.split(" ");

		for (int i = 0; i < words.length; i++) {
			boolean letra1Check = false;
			boolean letra2Check = false;
			boolean letra3Check = false;
			for (int j = 0; j < words[i].length(); j++) {
				if (words[i].charAt(j) == letra1)
					letra1Check = true;
				if (words[i].charAt(j) == letra2)
					letra2Check = true;
				if (words[i].charAt(j) == letra3)
					letra3Check = true;
			}

			if (letra1Check && letra2Check && letra3Check)
				count++;
		}
		System.out.println(count + " letras cumplen las tres condiciones");
		sc.close();
	}
}
