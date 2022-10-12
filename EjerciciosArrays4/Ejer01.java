package EjerciciosArrays4;

import java.util.Scanner;
import java.util.Arrays;

public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.print("Introduce un numero: ");
		num1 = sc.nextInt();
		System.out.print("Introduce otro numero: ");
		num2 = sc.nextInt();

		sc.close();
		if (num1 < 1 || num2 < 1)
			return;

		int[] nums1 = new int[num1];
		int[] nums2 = new int[num2];
		int[] nums3 = new int[(num1 + num2)];

		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int) ((Math.random() * 9) + 1);
			nums3[i] = nums1[i];
		}
		for (int i = 0; i < nums2.length; i++) {
			nums2[i] = (int) ((Math.random() * 9) + 1);
			nums3[(i + nums1.length)] = nums2[i];
		}

		System.out.println("Nums1: " + Arrays.toString(nums1));
		System.out.println("Nums2: " + Arrays.toString(nums2));
		System.out.println("Nums3: " + Arrays.toString(nums3));

	}
}
