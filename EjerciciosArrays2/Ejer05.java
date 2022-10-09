package EjerciciosArrays2;

import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int sumNeg = 0, sumPos = 0, numPos = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce un numero: ");
			nums[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			if (nums[i] >= 0) {
				sumPos += nums[i];
				numPos++;
			} else
				sumNeg += nums[i];
		}
		if (numPos == 10) {
			System.out.println("La media de los valores positivos es de " + (sumPos / 10));
			System.out.println("La media de los valores negativos es de 0");
		} else if (numPos == 0) {
			System.out.println("La media de los valores positivos es de 0");
			System.out.println("La media de los valores negativos es de " + (sumNeg / 10));
		} else {
			System.out.println("La media de los valores positivos es de " + (sumPos / numPos));
			System.out.println("La media de los valores negativos es de " + (sumNeg / (10 - numPos)));
		}
		sc.close();
	}
}
