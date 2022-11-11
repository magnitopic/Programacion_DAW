package ArraysBidimensionales05;

import java.util.Arrays;

public class Ejer04 {
	public static void main(String[] args) {
		int[][] arrayInts = new int[10][10];
		boolean[][] arrayBools = new boolean[10][10];

		for (int i = 0; i < arrayInts.length; i++) {
			for (int j = 0; j < arrayInts.length; j++) {
				arrayInts[i][j] = Math.random() >= 0.5 ? 1 : 0;
			}
		}

		System.out.println(Arrays.deepToString(arrayInts));

		for (int i = 0; i < arrayBools.length; i++) {
			for (int j = 0; j < arrayBools.length; j++) {
				arrayBools[i][j] = arrayInts[i][j] == 1;
			}
		}

		System.out.println(Arrays.deepToString(arrayBools));

	}
}
