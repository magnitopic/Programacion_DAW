package ArraysBidimensionales05;

public class Ejer05 {
	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		int[] array3 = new int[10];
		int[] array4 = new int[10];
		int[] array5 = new int[10];
		int[][] newArray = new int[5][10];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * 100) + 1;
			array2[i] = (int) (Math.random() * 100) + 1;
			array3[i] = (int) (Math.random() * 100) + 1;
			array4[i] = (int) (Math.random() * 100) + 1;
			array5[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < newArray.length; i++) {
			newArray[0][i] = array1[i];
			newArray[1][i] = array2[i];
			newArray[2][i] = array3[i];
			newArray[3][i] = array4[i];
			newArray[4][i] = array5[i];
		}

	}
}
