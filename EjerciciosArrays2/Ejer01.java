package EjerciciosArrays2;

import java.util.Arrays;

public class Ejer01 {
	public static void main(String[] args) {
		int[] numeros = new int[100];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
			System.out.print(numeros[i] + ", ");
		}

		System.out.println("\nLa suma es " + Arrays.stream(numeros).sum());
		System.out.println("La media es " + (Arrays.stream(numeros).sum() / 100));
	}
}
