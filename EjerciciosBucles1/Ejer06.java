package EjerciciosBucles1;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
			if (num%2==0)
				System.out.println("El numero es par");
			else
				System.out.println("El numero es impar");
			if (num >= 0)
				System.out.println("En numero es positivo");
			else
				System.out.println("El numero es negativo");
			System.out.println(Math.pow(num, 2));
		}while(num != 0);
		
		sc.close();
	}

}
