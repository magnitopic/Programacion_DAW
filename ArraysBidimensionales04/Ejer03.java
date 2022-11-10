package ArraysBidimensionales04;

public class Ejer03 {
	public static void main(String[] args) {
		int[][] array1 = new int[3][3];
		int[][] array2 = new int[3][3];

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j] = array1[i][2 - j];
			}
		}

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
}
