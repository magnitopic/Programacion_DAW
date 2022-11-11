package ArraysBidimensionales05;

import java.util.Arrays;

public class Ejer03 {
	public static void main(String[] args) {
		boolean[][] verdades = new boolean[10][10];
		for (int i = 0; i < verdades.length; i++) {
			for (int j = 0; j < verdades[i].length; j++) {
				if (Math.random() < .5)
					verdades[i][j] = true;
				else
					verdades[i][j] = false;
			}
		}

		System.out.println(Arrays.deepToString(verdades));

		for (int i = 0; i < verdades.length; i++) {
			for (int j = 0; j < verdades.length; j++) {
				if (verdades[i][j])
					verdades[i][j] = false;
				else
					verdades[i][j] = true;
			}
		}

		System.out.println(Arrays.deepToString(verdades));

	}
}
