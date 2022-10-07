package EjerciciosFor;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		int num;

		System.out.print("Cunatas veces quieres que se repita el mensaje: ");
		num = si.nextInt();

		for (int i = 0 + 1; i < (num * 4); i++) {
			System.out.println("We Love Centro Nelson");
		}

		si.close();
	}

}
