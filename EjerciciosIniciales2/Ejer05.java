package EjerciciosIniciales2;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		double num4;
		
		System.out.print("Introduzca el valor del primer numero: ");
		num1 = sn.nextInt();
		System.out.print("Introduzca el valor del segundo numero: ");
		num2 = sn.nextInt();
		System.out.print("Introduzca el valor del tercer numero: ");
		num3 = sn.nextInt();
		System.out.print("Introduzca el valor del cuarto numero: ");
		num4 = sn.nextInt();
		
		num1=Math.pow(num1, 5);
		num2=Math.pow(num2, 5);
		num3=Math.pow(num3, 5);
		num4=Math.pow(num4, 5);
		
		System.out.println(num1 + num2 + num3 + num4);
		
		sn.close();
	}
}
