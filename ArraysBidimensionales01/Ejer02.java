package ArraysBidimensionales01;

public class Ejer02 {
	public static void main(String[] args) {
		int[][] array = new int[8][8];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 99;
				System.out.print(array[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}
