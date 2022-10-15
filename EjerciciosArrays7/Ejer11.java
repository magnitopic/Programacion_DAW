package EjerciciosArrays7;

import java.util.Scanner;
import java.util.Arrays;

public class Ejer11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[1000];
		int aux;
		
		for (int i = 0; i < nums.length; i++) {
			/*System.out.print("Introduce un numero: ");
			nnums[i] = sc.nextInt();*/
			nums[i] = ((int) (Math.random() * 9)) + 1;
		}

		System.out.println("Antes: " + Arrays.toString(nums));

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					aux = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = aux;
				}
			}
		}

		System.out.println("Después: " + Arrays.toString(nums));
		
		sc.close();
	}
}
