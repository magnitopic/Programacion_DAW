package EjerciciosSwitchCondicionales;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num1, num2, num3, temp;

		System.out.print("Introduce un numero: ");
		num1 = sn.nextInt();
		System.out.print("Introduce un numero: ");
		num2 = sn.nextInt();
		System.out.print("Introduce un numero: ");
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

		System.out.println("Para llegar al numero más grande le fantan " + (num1 - num2));
		System.out.println("Para llegar al numero más pequeño le sobran " + (num2 - num3));
		sn.close();	
	}
}
