package EjerciciosArrays7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums1=new int[10];
		int[] nums2=new int[10];
		int count = 0;

		for (int i = 0; i < nums1.length; i++) {
			/*System.out.print("Introduce un numero: ");
			nnums1[i] = sc.nextInt();*/
			nums1[i] = ((int) (Math.random() * 100)) + 1;
		}
		for (int i = 0; i < nums2.length; i++) {
			/*System.out.print("Introduce un numero: ");
			nnums2[i] = sc.nextInt();*/
			nums2[i] = ((int) (Math.random() * 100)) + 1;
		}


		for (int i = 0; i < nums2.length; i++){
			for (int j = 0; j < nums1.length; j++){
				if (nums1[j] == nums2[i])
					count++;
			}
		}
		System.out.println("Nums1: " + Arrays.toString(nums1));
		System.out.println("Nums2: " + Arrays.toString(nums2));
		System.out.println("Aparecen "+count+" veces numeros del primer array en el segundo.");

		sc.close();
	}
}
