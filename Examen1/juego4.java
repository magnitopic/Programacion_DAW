package Examen1;

import java.util.Scanner;

public class juego4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[27];
		boolean flag = true;

		for (int i = 0; i < nums.length; i++) {
			System.out.print("Introduce un numero: ");
			nums[i] = sc.nextInt();
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 2; j < nums[i] - 1; j++) {
				if (nums[i] % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag && nums[i] < 16)
				System.out.println(nums[i] + ", ");
		}

		sc.close();
	}

}
