package EjerciciosBucles2;

import java.util.Scanner;

public class Ejer09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		for (int i = 0; i < 5; i++){
			System.out.print("Introduce un numero: ");
			sum += sc.nextInt();
		}
		for (int i = 0; i < sum; i++)
			System.out.println("Hello my friend");
		sc.close();
	}
}
