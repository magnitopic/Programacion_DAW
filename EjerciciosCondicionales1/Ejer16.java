package EjerciciosCondicionales1;

import java.util.Scanner;

public class Ejer16 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num1, num2, num3, temp;

		System.out.print("Introduce un numero: ");
		num1 = sn.nextInt();
		System.out.print("Introduce otro numero: ");
		num2 = sn.nextInt();
		System.out.print("Introduce un ultimo numero: ");
		num3 = sn.nextInt();

		if (num1 < num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num2 < num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}

		System.out.print(num1 + " > " + num2 + " > " + num3);

		sn.close();
	}

}
