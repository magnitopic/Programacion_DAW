package EjerciciosArrays7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[4];
		boolean flag = true;

		for (int i = 0; i < nums.length; i++) {
			System.out.print("Introduce un numero: ");
			nums[i] = sc.nextInt();
			// nums[i] = ((int) (Math.random() * 9)) + 1;
		}

		for (int i = 0; i < nums.length; i++) {
			if (i != 0 && (nums[i - 1] <= nums[i])) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("La lista está en orden ascendiente.");
		else {
			flag = true;
			for (int i = 0; i < nums.length; i++) {
				if (i != 0 && (nums[i - 1] >= nums[i])) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("La lista está en orden descendiente.");
			else
				System.out.println("La lista está desordenada.");

			System.out.println(Arrays.toString(nums));
		}

		sc.close();
	}
}
