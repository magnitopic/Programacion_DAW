package EjerciciosArrays7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums1 = new int[10];
		int[] nums2 = new int[5];
		int[] nums3 = new int[5];

		for (int i = 0; i < nums1.length; i++) {
			/*
			 * System.out.print("Introduce un numero: ");
			 * nnums1[i] = sc.nextInt();
			 */
			nums1[i] = ((int) (Math.random() * 100)) + 1;
		}

		for (int i = 1; i <= nums1.length / 2; i++) {
			nums2[i - 1] = nums1[(i * 2) - 1];
		}

		for (int i = 0; i < nums1.length / 2; i++) {
			nums3[i] = nums1[(i * 2)];
		}

		System.out.println("Nums1: " + Arrays.toString(nums1));
		System.out.println("Nums2: " + Arrays.toString(nums2));
		System.out.println("Nums3: " + Arrays.toString(nums3));

		sc.close();
	}
}
