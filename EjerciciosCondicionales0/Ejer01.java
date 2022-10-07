package EjerciciosCondicionales0;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int mark;

		System.out.print("Introduce tu nota: ");
		mark = sn.nextInt();

		if (mark >= 5)
			System.out.println("Estás aprobado");
		else
			System.out.println("Estás suspenso");

		sn.close();
	}

}
