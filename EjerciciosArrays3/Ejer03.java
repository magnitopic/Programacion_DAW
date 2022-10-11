package EjerciciosArrays3;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums1 = new int[5];
		int[] nums2 = new int[5];
		int[] nums3 = new int[5];

		for (int i = 0; i < nums1.length; i++) {
			System.out.print("Introduce valores para el primer array: ");
			nums1[i] = sc.nextInt();
		}
		for (int i = 0; i < nums1.length; i++) {
			System.out.print("Introduce valores para el segundo array: ");
			nums2[i] = sc.nextInt();
		}
		
		for (int i = 0; i< nums1.length; i++) {
			nums3[i]= nums1[i]*nums2[i];
		}

		sc.close();
	}

}
