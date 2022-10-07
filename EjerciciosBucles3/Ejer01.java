package EjerciciosBucles3;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i%2==0)
				System.out.println("El numero es par.");
			if (i < 5)
				System.out.println("El numero es menor de 5.");
		}

		sc.close();
	}

}
