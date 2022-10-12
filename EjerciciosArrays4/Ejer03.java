package EjerciciosArrays4;

import java.util.Scanner;
import java.util.Arrays;

public class Ejer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;

		System.out.print("Introduce un numero: ");
		num1 = sc.nextInt();

		sc.close();
		if (num1 < 1)
			return;

		int[] nums1 = new int[num1];

		for (int i = 0; i < nums1.length; i++)
			nums1[i] = (int) ((Math.random() * 9) + 1);

		if (nums1.length % 2 == 0) {
			int[] nums2 = new int[nums1.length / 2];
			int[] nums3 = new int[nums1.length / 2];
			for (int i = 0; i < nums2.length; i++) {
				nums2[i] = nums1[i];
				nums3[i] = nums1[nums2.length + i];
			}
			System.out.println("Nums1: " + Arrays.toString(nums1));
			System.out.println("Nums2: " + Arrays.toString(nums2));
			System.out.println("Nums3: " + Arrays.toString(nums3));
		} else {
			int[] nums2 = new int[(nums1.length / 2)];
			int[] nums3 = new int[(nums1.length / 2)];
			int[] nums4 = new int[1];
			for (int i = 0; i < nums2.length; i++) {
				nums2[i] = nums1[i];
				nums3[i] = nums1[nums2.length + i];
			}
			nums4[0] = nums1[nums1.length - 1];
			System.out.println("Nums1: " + Arrays.toString(nums1));
			System.out.println("Nums2: " + Arrays.toString(nums2));
			System.out.println("Nums3: " + Arrays.toString(nums3));
			System.out.println("Nums3: " + Arrays.toString(nums4));
		}

	}
}
