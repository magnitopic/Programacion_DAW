package EjerciciosArrays8;

import java.util.Arrays;

public class Ejer1 {
	public static void main(String[] args) {
		int [] numeros = {10,4,456,5,12,34,22,9,0,56,2,122,3};
		int aux;
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length-1; j++) {
				if (numeros[j] > numeros[j + 1]) {
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
				
			}
		}

		System.out.println( Arrays.toString(numeros));
	}
}
