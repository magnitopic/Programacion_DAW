package Examen2;

public class programa1 {
	public static void main(String[] args) {
		int[][] numeros = new int[10][10];
		int count = 0, sum = 0;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = (int) (Math.random() * 100 + 1);
				if (numeros[i][j] % 2 != 0) {
					count++;
					sum += numeros[i][j];
				}
			}
		}

		System.out.println("La media de los numeros impares es de : " + (sum / count));
	}
}