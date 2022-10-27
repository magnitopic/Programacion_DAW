package EjerciciosString3;

import java.util.Scanner;

public class Ejer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[10];
		String[] new_names = new String[10];

		// Pedir al user strings
		for (int i = 0; i < names.length; i++) {
			System.out.print("Introduce un nombre: ");
			names[i] = sc.nextLine();
		}

		for (int i = 0; i < names.length; i++) {
			String aux = "";
			for (int j = 0; j < names[i].length(); j++) {
				if (names[i].charAt(j) == 'o' || names[i].charAt(j) == 'O')
					aux += "0";
				else if (names[i].charAt(j) == 'a' || names[i].charAt(j) == 'A')
					aux += "X";
				else
					aux += names[i].charAt(j);
			}
			new_names[i] = aux;
		}

		for (int i = 0; i < new_names.length; i++)
			System.out.println(new_names[i]);
		sc.close();
	}
}
