package EjerciciosCondicionales4;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Introduzca un numero: ");
		num = sc.nextInt();
		
		if (num > 100)
			System.out.println("Es mi número");
		sc.close();
	}

}
