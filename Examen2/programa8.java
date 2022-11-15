package Examen2;

public class programa8 {
	public static void main(String[] args) {
		int[][] numeros = new int[5][5];
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = (int) (Math.random() * 100 + 1);
			}
		}

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				boolean flag = true;
				for (int k = 2; k < numeros[i][j]; k++) {
					if (numeros[i][j] % k == 0)
						flag = false;
				}
				if (flag && numeros[i][j] != 1)
					System.out.println(numeros[i][j]);
			}
		}
	}
}