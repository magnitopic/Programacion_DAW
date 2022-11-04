package ArraysBidimensionales;

import java.util.Scanner;

public class Ejer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][] array = new String[4][4];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = "Mag";
				System.out.print(array[i][j] + "\t");
			}
			System.out.print("\n");
		}
		sc.close();
	}
}
