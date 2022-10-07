package EjerciciosBucles2;

import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do{
			System.out.print("Introduce el numero de la tabla: ");
			num = sc.nextInt();
		} while(num < 1 || num > 10);

		for (int i = 1; i <= 10; i++)
			System.out.println(num+"x"+i+" = "+(i*num));
		sc.close();
	}	
}
