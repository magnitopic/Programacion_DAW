package EjerciciosBucles5;

import java.util.Scanner;

public class Ejer09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cero = 0, sumPos = 0, sumNeg = 0, countPos = 0, countNeg = 0, num;

		for (int i = 0; i < 20; i++) {
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
			if (num == 0)
				cero++;
			else if (num > 0) {
				countPos++;
				sumPos += num;
			} else {
				countNeg++;
				sumNeg += num;
			}
		}

		System.out.println("La media de los valores positivos es de " + (sumPos / countPos));
		System.out.println("La media de los valores negativos es de " + (sumNeg / countNeg));
		System.out.println("Se ha introducido " + cero + " ceros");
		sc.close();
	}
}
