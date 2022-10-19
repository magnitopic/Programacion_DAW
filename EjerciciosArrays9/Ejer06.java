package EjerciciosArrays9;

import java.util.Arrays;

public class Ejer06 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int[] new_nums = new int[16];

		for (int i = 0; i < nums.length; i++)
			nums[i] = (int) ((Math.random() * 100) + 1);

		for (int i = 3; i < nums.length + 3; i++)
			new_nums[i] = nums[i - 3];

		System.out.println(Arrays.toString(new_nums));
	}
}
