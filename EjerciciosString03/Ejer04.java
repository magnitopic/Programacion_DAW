package EjerciciosString03;

import java.util.Scanner;

public class Ejer04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[7];
		String[] new_names = new String[7];

		// Pedir al user strings
		for (int i = 0; i < names.length; i++) {
			System.out.print("Introduce el nombre de una ciudad: ");
			names[i] = sc.nextLine();
		}

		// si el caracter es minuscula hacerlo mayuscula
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length(); j++) {
				char ch = names[i].charAt(j);
				if (ch > 96 && ch < 123) {
					ch = (char) (ch - 32);
					if (j == 0)
						new_names[i] = "" + ch;
					else
						new_names[i] = new_names[i] + ch;
				}
			}
		}

		for (int i = 0; i < new_names.length; i++)
			System.out.println(new_names[i]);
		sc.close();
	}
}
