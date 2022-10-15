package EjerciciosArrays7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums1 = new int[10];
		int[] nums2 = new int[10];
		int[] nums3 = new int[20];

		for (int i = 0; i < nums1.length; i++) {
			/*
			System.out.print("Introduce un numero: ");
			nums1[i] = sc.nextInt();
			*/
			nums1[i] = ((int) (Math.random() * 9)) + 1;
		}
		for (int i = 0; i < nums2.length; i++) {
			/*
			System.out.print("Introduce un numero: ");
			nums2[i] = sc.nextInt();
			*/
			nums2[i] = ((int) (Math.random() * 9)) + 1;
		}

		for (int i = 0; i < nums1.length; i++)
			nums3[(nums1.length - i) - 1] = nums1[i];
			
		for (int i = 0; i < nums2.length; i++)
			nums3[((nums2.length - i) + nums1.length) - 1] = nums2[i];

		System.out.println("Nums1: " + Arrays.toString(nums1));
		System.out.println("Nums2: " + Arrays.toString(nums2));
		System.out.println("Nums3: " + Arrays.toString(nums3));

		sc.close();
	}
}
