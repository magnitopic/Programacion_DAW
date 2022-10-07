package EjerciciosIniciales2;

import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num;
		
		System.out.print("Introduzca el valor del numero: ");
		num = sn.nextInt();
		
		System.out.println("El exponencial de " + num + " es: " + Math.exp(num));
		
		sn.close();
	}
}
