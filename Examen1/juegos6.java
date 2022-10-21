package Examen1;

import java.util.Scanner;

public class juegos6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums1 = new int[5];
		int[] nums2 = new int[5];
		int[] aux = new int[10];
		int count = 0;

		for (int i = 0; i < nums1.length; i++) {
			System.out.print("Introduce un numero: ");
			nums1[i] = sc.nextInt();
		}
		for (int i = 0; i < nums2.length; i++) {
			System.out.print("Introduce un numero: ");
			nums2[i] = sc.nextInt();
		}

		for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] % 2 != 0)
				aux[count++] = nums1[i];
		}

		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] % 2 != 0)
				aux[count++] = nums2[i];
		}

		int[] arrayResult = new int[count];
		for (int i = 0; i < arrayResult.length; i++) {
			arrayResult[i] = aux[i];
			System.out.println(arrayResult + ", ");
		}

		sc.close();
	}
}
