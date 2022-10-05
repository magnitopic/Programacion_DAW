package EjerciciosBucles5;

import java.util.Scanner;

public class Ejer14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int num1, num2, count = 0;

		System.out.print("Introduce un numero: ");
		num1 = sc.nextInt();
		System.out.print("Introduce un numero: ");
		num2 = sc.nextInt();

		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				flag = true;
				for (int j = 2; j < (i - 1); j++) {
					if (i % j == 0 || i == 1) {
						flag = false;
						break;
					}
				}
				if (flag) {
					count++;
				}
			}
		} else {
			for (int i = num2; i <= num1; i++){
				flag = true;
				for (int j = 2; j < (i - 1); j++) {
					if (i % j == 0 || i == 1) {
						flag = false;
						break;
					}
				}
				if (flag) {
					count++;
				}
			}
		}

		System.out.println("Entre " + num1 + " y " + num2 + " hay " + count + " numeros primos.");
		sc.close();
	}
}
