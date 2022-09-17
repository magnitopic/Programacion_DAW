package EjerciciosCondicionales1;

import java.util.Scanner;

public class Ejer17 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num;

		System.out.print("Introduce tu nota: ");
		num = sn.nextInt();

		if (num <= 4)
			System.out.println("Insuficiente");
		else if (num == 5)
			System.out.println("Suficiente");
		else if (num <= 8)
			System.out.println("Notable"); 
		else 
			System.out.println("Sobresaliente");

		sn.close();
	}
}
