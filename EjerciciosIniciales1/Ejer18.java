package EjerciciosIniciales1;

import java.util.Scanner;

public class Ejer18 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int b;
		int h;
		
		System.out.print("Introduce la base del rectangulo: ");
		b=sn.nextInt();
		System.out.print("Introduce la altura del rectngulo: ");
		h=sn.nextInt();
		
		System.out.println("Su area es de " + b*h);
		sn.close();
	}
}