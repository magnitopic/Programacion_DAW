package EjerciciosArrays4;

import java.util.Arrays;

public class Ejer04 {
	public static void main(String[] args) {
		int[] nums = new int[50];

		for (int i = 0; i < nums.length; i++) {
			/*
			 * System.out.print("Introduce un numero: ");
			 * nums[i] = sc.nextInt();
			 */
			nums[i] = ((int) (Math.random() * 9)) + 1;
		}

		int k = 0;
		int[][] lists = new int[5][10];
		for (int i = 0; i < lists.length; i++) {
			for (int j = 0; j < 10; j++) {
				lists[i][j] = nums[k];
				k++;
			}
		}
		System.out.println("Original: "+ Arrays.toString(nums));
		System.out.println("Arrays: " + Arrays.deepToString(lists));
	}
}
