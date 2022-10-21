package Examen1;

import java.util.Scanner;

public class juego2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0, min = 0, sum = 0;
		int[] nums = new int[35];
		for (int i = 0; i < nums.length; i++) {
			System.out.print("Introduce un numero: ");
			nums[i] = sc.nextInt();
			if (i == 0 || nums[i] > max)
				max = nums[i];
			if (i == 0 || nums[i] < min)
				min = nums[i];

			sum += nums[i];
		}

		System.out.println("El mayor numero es " + max);
		System.out.println("El menor numero es " + min);
		System.out.println("Y la media es " + (sum / nums.length));
		sc.close();
	}
}
