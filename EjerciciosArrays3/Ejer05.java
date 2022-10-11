package EjerciciosArrays3;

import java.util.Scanner;
import java.util.Arrays;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aux;
		int[] nums = new int[20];

		for (int i = 0; i < nums.length; i++) {
			/*
			 * System.out.print("Introduce un numero: ");
			 * nums[i] = sc.nextInt();
			 */
			nums[i] = ((int) (Math.random() * 9)) + 1;
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					aux = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = aux;
				}
			}
		}

		System.out.print(Arrays.toString(nums));

		for (int i = 0; i < nums.length; i++) {
			if ((i == 0) || (nums[i] != nums[i - 1]))
				System.out.print("\n" + nums[i] + ": ");
			System.out.print("*");
		}

		sc.close();

	}

}
