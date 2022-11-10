package ArraysBidimensionales04;

public class Ejer04 {
	public static void main(String[] args) {
		int[][] array1 = new int[5][4];
		int[] array2 = new int[5];

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array2[i] += array1[i][j];
			}
		}

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j] + "  ");
			}
			System.out.print("\t" + array2[i]);
			System.out.print("\n");
		}
	}
}
