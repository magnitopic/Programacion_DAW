package EjerciciosIniciales2;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int a1;
		int a2;
		int a3;
		int a4;
		
		System.out.print("Introduzca el valor del primer angulo: ");
		a1 = sn.nextInt();
		System.out.print("Introduzca el valor del segundo angulo: ");
		a2 = sn.nextInt();
		System.out.print("Introduzca el valor del tercer angulo: ");
		a3 = sn.nextInt();
		System.out.print("Introduzca el valor del cuarto angulo: ");
		a4 = sn.nextInt();
		
		System.out.println("El seno de " + a1 + " es: " + Math.sin(a1));
		System.out.println("El seno de " + a2 + " es: " + Math.sin(a2));
		System.out.println("El seno de " + a3 + " es: " + Math.sin(a3));
		System.out.println("El seno de " + a4 + " es: " + Math.sin(a4));
		
		sn.close();
	}

}
