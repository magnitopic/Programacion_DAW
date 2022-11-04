package ArraysBidimensionales;

public class Ejer01 {
	public static void main(String[] args) {
		int[][] array = new int[5][4];
		int count = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = count++;
				System.out.print(array[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
}
