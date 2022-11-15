package Examen2;

import java.util.Scanner;

public class programa2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		String letrasMinusculas = "abcdefghijklmnñopqrstuvwxyzáéíóú";
		System.out.print("Introduce la cadena: ");
		String cadena = sc.nextLine();

		for (int i = 0; i < cadena.length(); i++) {
			for (int j = 0; j < letrasMinusculas.length(); j++) {
				if (cadena.charAt(i) == letrasMinusculas.charAt(j))
					counter++;
			}
		}

		System.out.println("Hay " + counter + " minusculas");

		sc.close();
	}
}