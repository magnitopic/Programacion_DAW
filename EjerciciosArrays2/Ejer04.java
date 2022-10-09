package EjerciciosArrays2;

import java.util.Scanner;

public class Ejer04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		int pos = 0, neg = 0, cero = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("Introduce un numero: ");
			nums[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			if (nums[i] < 0)
				neg++;
			else if (nums[i] > 0)
				pos++;
			else
				cero++;
		}

		System.out.println(pos + " numeros positivos.");
		System.out.println(neg + " numeros negativos.");
		System.out.println(cero + " ceros.");

		sc.close();
	}
}
