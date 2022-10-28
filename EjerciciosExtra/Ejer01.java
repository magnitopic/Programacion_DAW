package EjerciciosExtra;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Introduce una frase: ");
		num = sc.nextInt();

		if (num < 100)
			System.out.println("El numero es menor que 100");
		else if (num % 2 == 0)
			System.out.println("El numero es par");
		else
			System.out.println("El numero es impar");
		sc.close();
	}
}
