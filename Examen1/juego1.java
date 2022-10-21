package Examen1;

import java.util.Scanner;

public class juego1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		boolean flag = true;

		for (int i = 0; i < 3; i++) {
			System.out.print("Introduce un numero: ");
			sum += sc.nextInt();
		}

		if (sum < 10)
			System.out.println("La suma es engativa");
		else
			System.out.println("La suma no es negativa");
		if (sum % 2 == 0)
			System.out.println("La suma es par");
		else
			System.out.println("La suma es impar");
		if (sum > 10)
			System.out.println("La suma es mayor que 10");
		else
			System.out.println("La suma no es mayor que 10");
		for (int i = 2; i < sum - 1; i++) {
			if (sum % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("La suma es prima");
		else
			System.out.println("La suma no es prima");
		sc.close();
	}
}
