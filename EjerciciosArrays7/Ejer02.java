package EjerciciosArrays7;

import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		for (int i = 0; i < 5; i++){
			System.out.print("Introduce un numero: ");
			if (sc.nextInt() == 10)
				flag = true;
		}

		if (flag)
			System.out.println("Se ha introducido un 10.");
		else
			System.out.println("No se ha introducido un 10.");

		sc.close();
	}
}
