package EjerciciosArrays2;

import java.util.Scanner;
import java.util.Arrays;

public class Ejer06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, more = 0, less = 0;
		double med;

		System.out.print("Introduce el numero de alturas: ");
		n = sc.nextInt();
		if (n <= 1) {
			sc.close();
			return;
		}
		double[] heights = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Introduce una altura: ");
			heights[i] = sc.nextDouble();
		}
		med = Arrays.stream(heights).sum() / n;

		for (int i = 0; i < heights.length; i++) {
			if (heights[i] > med)
				more++;
			else if (heights[i] < med)
				less++;
		}

		System.out.println(more + " personas tienen mayor altura que la media");
		System.out.println(less + " personas tienen menor altura que la media");

		sc.close();
	}
}
