package EjerciciosString03;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ciudad;

		System.out.print("Introduce tu ciudad natal: ");
		ciudad = sc.nextLine();

		char ch = ciudad.charAt(ciudad.length() - 1);
		if (ch > 96 && ch < 123)
			System.out.println(ch - 32);
		sc.close();
	}
}
