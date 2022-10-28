package EjerciciosExtra;

import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phrase = "";
		boolean flag = true;
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		for (int i = 0; i < phrase.length(); i++) {
			char ch = phrase.charAt(i);
			if (ch > 64 && ch < 91)
				flag = false;
		}

		if (flag)
			System.out.println("Todas las letras está en minusculas.");
		else
			System.out.println("No todas las eltras están en minusculas.");

		sc.close();
	}
}
