package EjerciciosArrays7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums= new int[10];


		for (int i = 0; i < nums.length; i++) {
			/*System.out.print("Introduce un numero: ");
			nnums[i] = sc.nextInt();*/
			nums[i] = ((int) (Math.random() * 9)) + 1;
		}

		System.out.println("Nums: " + Arrays.toString(nums));

		System.out.print("Introduce un numero: ");
		int[] nums2=new int[11];
		nums2 = nums;
		nums2[nums2.length-1] = sc.nextInt();

		System.out.println("Nums2: " + Arrays.toString(nums2));

		sc.close();
	}
}
