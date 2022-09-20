package EjerciciosIniciales1;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		System.out.print("Introduce el primer numero: ");
		num1=sn.nextInt();
		System.out.print("Introduce el segundo numero: ");
		num2=sn.nextInt();
		System.out.print("Introduce el tercer numero: ");
		num3=sn.nextInt();
		
		System.out.println(num1 * (num2 + num3));
		sn.close();
	}

}
