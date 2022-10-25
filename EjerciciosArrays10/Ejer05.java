package EjerciciosArrays10;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		boolean flag = true;

		for (int i = 0; i < nums.length; i++) {
			System.out.print("Introduce un numero: ");
			nums[i] = sc.nextInt();
		}

		for (int i = 0; i < nums.length; i++) {
			flag = true;
			for (int k = 2; k < nums[i] - 1; k++) {
				if (nums[i] % k == 0)
					flag = false;
			}
			if (flag && nums[i] != 1) {
				System.out.print("Introduce un numero: ");
				nums[i] = sc.nextInt();
			}

		}

		System.out.println(Arrays.toString(nums));

		sc.close();
	}
}
