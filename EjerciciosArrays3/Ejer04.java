package EjerciciosArrays3;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Cuantas lineas quieres: ");
		num = sc.nextInt();

		if (num <= 1) {
			sc.close();
			return;
		}

		int[] nums = new int[num];

		for (int i = 0; i < nums.length; i++) {
			System.out.print("Introduce el numero de astericos en la linea " + i + ": ");
			nums[i]= sc.nextInt();
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i]; j++)
				System.out.print("*");
			System.out.print("\n");
		}

		sc.close();
	}

}
