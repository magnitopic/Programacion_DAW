package EjerciciosString02;

import java.util.Scanner;

public class Ejer06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String countryName;
		int count = 0;

		for (int i = 0; i < 20; i++) {
			System.out.print("Introduce el nombre de un país: ");
			countryName = sc.nextLine();
			for (int j = 0; j < countryName.length(); j++) {
				if (countryName.charAt(j) == 'e')
					count++;
			}
		}

		System.out.println("Se han encontrado " + count + " 'e' en los nombre de paises");
		sc.close();
	}
}
