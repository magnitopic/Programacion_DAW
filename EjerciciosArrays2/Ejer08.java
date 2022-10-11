package EjerciciosArrays2;

import java.util.Scanner;

public class Ejer08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			System.out.print("Introduce un numero: ");
			nums[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i += 2)
			sum += nums[i];

		System.out.println("La media de los numero pares es de " + (sum / 5));

		sc.close();
	}
}
