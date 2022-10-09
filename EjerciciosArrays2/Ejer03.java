package EjerciciosArrays2;

import java.util.Arrays;

public class Ejer03 {
	public static void main(String[] args) {
		// Define variables
		int len = 5;
		int[] arry = new int[len];
		int[] arry2 = new int[len];
		for (int i = 0; i < arry.length; i++)
			arry[i] = (int) (Math.random() * 10);
		// reverse array

		for (int i = arry.length; i > 0; i--) {
			arry2[len - i] = arry[(i - 1)];
		}

		System.out.println("Antes: " + Arrays.toString(arry));
		System.out.println("Despues: " + Arrays.toString(arry2));
	}
}
