package EjerciciosBucles2;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0, rep;
		double salaries = 0;
		System.out.print("Cuantos empleados tienes: ");
		rep = sc.nextInt();

		for (int i = 0; i < rep; i++) {
			System.out.print("Introduce tu salario: ");
			salaries += sc.nextDouble();
			count++;
		}

		System.out.println("El salario medio es de: " + (salaries / count));
		sc.close();
	}
}
