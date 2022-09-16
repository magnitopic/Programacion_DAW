package EjerciciosIniciales2;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		System.out.print("Introduzca el valor del primer numero: ");
		num1 = sn.nextInt();
		System.out.print("Introduzca el valor del segundo numero: ");
		num2 = sn.nextInt();
		System.out.print("Introduzca el valor del tercer numero: ");
		num3 = sn.nextInt();
		
		System.out.println(Math.sqrt(num1+num2+num3));
		
		sn.close();
	}
}
