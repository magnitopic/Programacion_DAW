package ArraysBidimensionales05;

public class Ejer02 {
	public static void main(String[] args) {
		boolean[][] verdades = new boolean[10][10];
		int count = 0;
		for (int i = 0; i < verdades.length; i++) {
			for (int j = 0; j < verdades[i].length; j++) {
				if (Math.random() < .5) {
					verdades[i][j] = true;
					count++;
				} else
					verdades[i][j] = false;
			}
		}
		System.out.println("Hay " + count + " verdaderos en la lista");
	}
}
