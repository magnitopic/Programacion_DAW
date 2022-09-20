package EjerciciosIniciales1;

import java.util.Scanner;

public class Ejer19 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int r;
		int h;
		
		System.out.print("Introduce el radio del cilindro: ");
		r=sn.nextInt();
		System.out.print("Introduce la altura del cilindro: ");
		h=sn.nextInt();
		
		System.out.println("Su area es de " + 2*Math.PI*r*h);
		sn.close();
	}
}