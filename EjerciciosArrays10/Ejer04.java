package EjerciciosArrays10;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[4][5];
		boolean flag = true;
		int num;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				flag = true;
				System.out.print("Introduce un numero para el " + (i + 1) + "º array: ");
				num = sc.nextInt();
				for (int k = 2; k < num - 1; k++) {
					if (num % k == 0)
						flag = false;
				}
				if (flag && num != 1)
					array[i][j] = 0;
			}
		}

		System.out.println(Arrays.toString(array));

		sc.close();
	}
}
