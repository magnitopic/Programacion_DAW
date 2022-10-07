package EjerciciosWhile;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		int nine = 0, i = 0;

		while (i < 20) {
			System.out.print("Introduce un numero: ");
			if (si.nextInt() == 9)
				nine++;
			i++;
		}

		System.out.println(
				"Se ha introducido nueve " + nine + " veces ");

		si.close();
	}

}
