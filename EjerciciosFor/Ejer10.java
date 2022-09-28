package EjerciciosFor;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		int nine = 0;

		for (int i = 0; i < 20; i++) {
			System.out.print("Introduce un numero: ");
			if (si.nextInt() == 9)
				nine++;
		}

		System.out.println(
				"Se ha introducido nueve " + nine + " veces ");

		si.close();
	}

}
