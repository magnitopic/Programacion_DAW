package EjerciciosString01;

import java.util.Scanner;

public class Ejer08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = new String[7];
		for (int i = 0; i < names.length; i++) {
			System.out.println("Introduce un nombre de ciudad: ");
			names[i] = sc.nextLine();
		}
		for (int i = 0; i < names.length; i++)
			System.out.println(names[i].substring(0, 1).toUpperCase() + names[i].substring(1));
		sc.close();
	}
}
