package EjerciciosBucles5;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 0, num;

		System.out.print("Introduce un numero: ");
		num = sc.nextInt();
		for (int i = num; i > 0; i--)
			fact *= i;

		System.out.println("Su factorial es " + fact);

		sc.close();
	}
}
