package EjerciciosArrays3;

import java.util.Scanner;

public class Ejer07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int find, count = 0, lastPos = -1;
		int[] nums = new int[20];

		for (int i = 0; i < nums.length; i++) {
			/*
			 * System.out.print("Introduce un numero: ");
			 * nums[i] = sc.nextInt();
			 */
			nums[i] = ((int) (Math.random() * 9)) + 1;
		}

		System.out.print("Introduce el numero a encontrar: ");
		find = sc.nextInt();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == find) {
				count++;
				lastPos = i;
			}
		}

		if (lastPos == -1)
			System.out.println("El numero no está en el array.");
		else
			System.out.println("El numero aparece " + count
					+ " veces en la lista y se encuentra por ultima vez en la posición " + lastPos);

		sc.close();
	}
}
