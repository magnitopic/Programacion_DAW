package EjerciciosFor;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		String name;
		int loop;

		System.out.print("Introduce tu nombre: ");
		name = sn.nextLine();
		System.out.print("Cunatas veces quieres que se repita? ");
		loop = si.nextInt();

		for (int i = 0; i < loop; i++) {
			System.out.println(name);
		}

		sn.close();
		si.close();
	}

}
