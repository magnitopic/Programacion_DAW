package EjerciciosBucles2;

import java.util.Scanner;

public class Ejer06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Introduce un numero: ");
		num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Eco...");
		}
		sc.close();
	}
}
