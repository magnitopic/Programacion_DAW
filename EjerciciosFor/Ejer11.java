package EjerciciosFor;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		int ten = 0, zero=0, num;

		for (int i = 0; i < 20; i++) {
			System.out.print("Introduce un numero: ");
			num = si.nextInt();
			if (num == 10)
				ten++;
			else if (num == 0)
				zero++;
		}

		System.out.println("Se ha introducido diez " + ten + " veces ");
		System.out.println("Se ha introducido cero " + zero + " veces ");

		si.close();
	}

}
