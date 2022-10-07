package EjerciciosBucles2;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, count = 0;
		boolean flag;

		System.out.print("Introduce un numero: ");
		n = sc.nextInt();

		sc.close();
		if (n < 1)
			return;

		for (int i = 2; i <= n; i++) {
			/* Por defecto el numero analizado es primo */
			flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				count++;
		}

		System.out.println("Hay " + count + " numeros primos entre 1 y " + n);		
	}
}
