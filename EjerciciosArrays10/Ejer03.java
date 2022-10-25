package EjerciciosArrays10;

import java.util.Scanner;

public class Ejer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[3][5];
		int[] primos = new int[3];
		boolean flag = true;
		int num;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				flag = true;
				System.out.print("Introduce un numero para el " + (i + 1) + "º array: ");
				num = sc.nextInt();
				for (int k = 2; k < num - 1; k++) {
					if (num % k == 0)
						flag = false;
				}
				if (flag && num != 1)
					primos[i]++;
			}
		}
		if (primos[0] > primos[1] && primos[0] > primos[2])
			System.out.println("El primer array tiene más numeros primos");
		else if (primos[1] > primos[0] && primos[1] > primos[2])
			System.out.println("El segundo array tiene más numeros primos");
		else if (primos[2] > primos[0] && primos[2] > primos[1])
			System.out.println("El tercer array tiene más numeros primos");
		else
			System.out.println("Hay algún emparte");

		sc.close();
	}
}
