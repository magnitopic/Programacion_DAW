package ArraysBidimensionales04;

public class Ejer02 {
	public static void main(String[] args) {
		int[][] array1 = new int[3][3];
		int[][] array2 = new int[3][3];
		int[][] array3 = new int[3][6];

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = (int) (Math.random() * 10);
				array2[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				if (j < 3)
					array3[i][j] = array1[i][j];
				else
					array3[i][j] = array2[i][j - 3];
			}
		}


		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				System.out.print(array3[i][j] + "  ");
			}
			System.out.print("\n");
		}
	}
}
