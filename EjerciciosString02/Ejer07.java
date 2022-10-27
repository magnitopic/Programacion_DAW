package EjerciciosString02;

import java.util.Scanner;

public class Ejer07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		int count = 0;

		for (int i = 0; i < 50; i++) {
			System.out.print("Introduce el nombre: ");
			name = sc.nextLine();
			if (name.charAt(name.length() - 1) == 'a' && name.charAt(name.length() - 1) == 'o'
					&& name.charAt(name.length() - 1) == 'i')
				count++;
		}

		System.out.println("Se han encontrado " + count + " 'o', 'a' y 'i' al final de los nombres");
		sc.close();
	}
}
