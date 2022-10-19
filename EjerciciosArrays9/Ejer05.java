package EjerciciosArrays9;

import java.util.Arrays;

public class Ejer05 {
	public static void main(String[] args) {
		int[] nums = new int[16];
		int[][] aux = new int[4][16];
		int counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0;
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
				aux[1][counter2++] = nums[i];

			// comprobar si par o impar
			if (nums[i] == 10)
				aux[0][counter1++] = nums[i];
			if (nums[i] < 100)
				aux[2][counter3++] = nums[i];
			if (nums[i] % 2 != 0)
				aux[3][counter4++] = nums[i];
		}

		int[] diec = new int[counter1];
		for (int i = 0; i < diec.length; i++)
			diec[i] = aux[0][i];

		int[] primos = new int[counter2];
		for (int i = 0; i < primos.length; i++)
			primos[i] = aux[1][i];

		int[] cien = new int[counter3];
		for (int i = 0; i < cien.length; i++)
			cien[i] = aux[2][i];

		int[] impares = new int[counter4];
		for (int i = 0; i < impares.length; i++)
			impares[i] = aux[3][i];

		System.out.println("Dieces: " + Arrays.toString(diec));
		System.out.println("Primos: " + Arrays.toString(primos));
		System.out.println("Menores que 100: " + Arrays.toString(cien));
		System.out.println("Impares: " + Arrays.toString(impares));
	}
}
