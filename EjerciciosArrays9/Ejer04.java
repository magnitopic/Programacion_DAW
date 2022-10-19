package EjerciciosArrays9;

import java.util.Arrays;

public class Ejer04 {
	public static void main(String[] args) {
		int[][] nums = new int[3][10];
		int[] aux = new int[30];
		int counter1 = 0;
		boolean flag = true;
		for (int k = 0; k < nums.length; k++) {
			for (int i = 0; i < nums[k].length; i++) {
				nums[k][i] = (int) ((Math.random() * 100) + 1);
				// comprobar si primo
				flag = true;
				for (int j = 2; j < nums[k][i]; j++) {
					if (nums[k][i] % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag)
					aux[counter1++] = nums[k][i];
			}
		}

		int[] primos = new int[counter1];
		for (int i = 0; i < primos.length; i++)
			primos[i] = aux[i];

		System.out.println("Primos: " + Arrays.toString(primos));
	}
}
