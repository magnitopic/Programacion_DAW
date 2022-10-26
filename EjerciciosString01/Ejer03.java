package EjerciciosString01;

import java.util.Scanner;

public class Ejer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String city;

		System.out.print("Introduce tu ciudad natal: ");
		city = sc.nextLine();

		System.out.println(city.toUpperCase());
		System.out.println(city.toLowerCase());

		sc.close();
	}
}
