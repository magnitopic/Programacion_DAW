package EjerciciosIniciales1;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int r;
		
		System.out.print("Introduce el radio del circulo: ");
		r=sn.nextInt();
		
		System.out.println("Su area es de " + Math.PI*(Math.pow(r,2)));
		sn.close();
	}

}
