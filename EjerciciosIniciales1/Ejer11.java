package EjerciciosIniciales1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		double power;
		
		System.out.print("Introduce el primer numero: ");
		num1=sn.nextInt();
		System.out.print("Introduce el segundo numero: ");
		num2=sn.nextInt();
		System.out.print("Introduce el tercer numero: ");
		num3=sn.nextInt();
		power=Math.pow(num1, num2);
		System.out.println(Math.pow(power, num3));
		sn.close();
	}

}
