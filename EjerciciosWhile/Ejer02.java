package EjerciciosWhile;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		int nine = 0, i = 0;

		while (i < 20) {
			System.out.print("Introduce cuantos años tienes: ");
			if (si.nextInt() == 9)
				nine++;
			i++;
		}

		System.out.println(
				"Se ha introducido nueve " + nine + " veces y no se ha puesto nueve" + (20 - nine) + " veces.");

		si.close();
	}

}
