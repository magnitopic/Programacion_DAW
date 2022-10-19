package EjerciciosArrays9;

import java.util.Arrays;

public class Ejer02 {
	public static void main(String[] args) {
		int[] nums = new int[25];
		int[] aux = new int[25];
		boolean flag = true;
		int contador = 0;

		for (int i = 0; i < nums.length; i++)
			nums[i] = (int) ((Math.random() * 100) + 1);

		for (int j = 0; j < nums.length; j++) {
			flag = true;
			for (int i = 2; i < nums[j]; i++) {
				if (nums[j] % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				aux[contador++] = nums[j];
		}
		int[] primes = new int[contador];
		for (int i = 0; aux[i] != 0; i++)
			primes[(primes.length - i) - 1] = aux[i];

		System.out.println(Arrays.toString(primes));

	}
}
