package EjerciciosString01;

import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String city;

		System.out.print("Introduce tu ciudad natal: ");
		city = sc.nextLine();
		city = city.toUpperCase();
		System.out.println(city.charAt(city.length() - 1));

		sc.close();
	}
}
