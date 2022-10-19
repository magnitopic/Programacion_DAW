package EjerciciosArrays9;

import java.util.Arrays;

public class Ejer03 {
	public static void main(String[] args) {
		int[] nums = new int[16];
		int[][] aux = new int[3][16];
		int counter1 = 0, counter2 = 0, counter3 = 0;
		boolean flag = true;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) ((Math.random() * 100) + 1);
			// comprobar si primo
			flag = true;
			for (int j = 2; j < nums[i]; j++) {
				if (nums[i] % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				aux[0][counter1++] = nums[i];

			// comprobar si par o impar
			if (nums[i] % 2 == 0)
				aux[1][counter2++] = nums[i];
			else
				aux[2][counter3++] = nums[i];
		}

		int[] primos = new int[counter1];
		for (int i = 0; i < primos.length; i++)
			primos[i] = aux[0][i];

		int[] pares = new int[counter2];
		for (int i = 0; i < pares.length; i++)
			pares[i] = aux[1][i];

		int[] impares = new int[counter3];
		for (int i = 0; i < impares.length; i++)
			impares[i] = aux[2][i];

		System.out.println("Primos: " + Arrays.toString(primos));
		System.out.println("Pares " + Arrays.toString(pares));
		System.out.println("Impares" + Arrays.toString(impares));

	}
}
