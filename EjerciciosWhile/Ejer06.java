package EjerciciosWhile;

import java.util.Scanner;

public class Ejer06 {
	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		int ten = 0, zero = 0, num, i = 0;

		while (i < 20) {
			System.out.print("Introduce un numero: ");
			num = si.nextInt();
			if (num == 10)
				ten++;
			else if (num == 0)
				zero++;
			i++;
		}

		System.out.println("Se ha introducido diez " + ten + " veces ");
		System.out.println("Se ha introducido cero " + zero + " veces ");

		si.close();
	}

}
