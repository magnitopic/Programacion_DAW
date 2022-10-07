package EjerciciosCondicionales0;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int mark1;
		int mark2;

		System.out.print("Introduce la primera nota: ");
		mark1 = sn.nextInt();
		System.out.print("Introduce la segunda nota: ");
		mark2 = sn.nextInt();

		if (mark1 > mark2)
			System.out.println("La primera nota es mayor");
		else if (mark1 < mark2)
			System.out.println("La segunda nota es mayor");
		else
			System.out.println("Las dos notas son iguales");

		sn.close();
	}

}
