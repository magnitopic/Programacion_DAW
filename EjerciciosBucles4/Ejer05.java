package EjerciciosBucles4;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, fact = 1;

		System.out.print("Introduce un numero: ");
		num = sc.nextInt();
		sc.close();
		if (num < 1)
			return;

		for (int i = num; i > 0; i--)
			fact *= i;

		System.out.println("El factorial es " + fact);
	}

}
