package EjerciciosArrays3;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			System.out.print("Introduce un numero: ");
			nums[i] = sc.nextInt();
			sum += nums[i];
		}

		System.out.println("La suma de los elementos del array es: " + sum);

		sc.close();
	}
}
