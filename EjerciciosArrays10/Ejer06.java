package EjerciciosArrays10;

import java.util.Scanner;
import java.util.Arrays;

public class Ejer06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[2][10];
		int[] aux = new int[20];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("Introduce un numero: ");
				array[i][j] = sc.nextInt();
			}
		}

		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 2; k < array[i][j] - 1; k++) {
					if (array[i][j] % k == 0)
						aux[count++] = array[i][j];
				}
			}
		}
		int[] new_array = new int[count];

		for (int i = 0; aux[i] != 0; i++) {
			new_array[i] = aux[i];
		}
		System.out.println(Arrays.toString(new_array));

		sc.close();
	}
}
