package EjerciciosArrays4;

import java.util.Arrays;

public class Ejer05 {
	public static void main(String[] args) {
		int[] nums = new int[50];
		for (int i = 0; i < nums.length; i++)
			nums[i] = (int) (Math.random() * 101);

		System.out.println(Arrays.toString(nums));
	}
}
