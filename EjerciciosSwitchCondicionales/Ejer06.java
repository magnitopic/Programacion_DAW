package EjerciciosSwitchCondicionales;

import java.util.Scanner;

public class Ejer06 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num1, num2, num3, num4, temp;

		System.out.print("Introduce un numero: ");
		num1 = sn.nextInt();
		System.out.print("Introduce un numero: ");
		num2 = sn.nextInt();
		System.out.print("Introduce un numero: ");
		num3 = sn.nextInt();
		System.out.print("Introduce un numero: ");
		num4 = sn.nextInt();

		if (num1 < num4) {
			temp = num1;
			num1 = num4;
			num4 = temp;
		}
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
		if (num2 < num4) {
			temp = num2;
			num2 = num4;
			num4 = temp;
		}
		if (num3 < num4) {
			temp = num3;
			num3 = num4;
			num4 = temp;
		}

		System.out.println(num2 + num3);

		sn.close();
	}
}
