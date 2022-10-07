package EjerciciosIniciales1;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int card1;
		int card2;
		int card3;
		int card4;
		int card5;
		
		System.out.print("Introduce el numero de la primera tarjeta de credito: ");
		card1 = sn.nextInt();
		System.out.print("Introduce el numero de la segunda tarjeta de credito: ");
		card2 = sn.nextInt();
		System.out.print("Introduce el numero de la tercera tarjeta de credito: ");
		card3 = sn.nextInt();
		System.out.print("Introduce el numero de la curata tarjeta de credito: ");
		card4 = sn.nextInt();
		System.out.print("Introduce el numero de la quinta tarjeta de credito: ");
		card5 = sn.nextInt();
		
		System.out.println("Tarjeta 1: " + card1);
		System.out.println("Tarjeta 2: " + card2);
		System.out.println("Tarjeta 3: " + card3);
		System.out.println("Tarjeta 4: " + card4);
		System.out.println("Tarjeta 5: " + card5);
		sn.close();
	}

}
