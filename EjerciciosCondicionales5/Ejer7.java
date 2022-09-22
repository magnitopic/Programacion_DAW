package EjerciciosCondicionales5;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota;

		System.out.print("Introduce la nota obtenida: ");
		nota = sc.nextInt();

		if (nota < 5)
			System.out.println("Insuficiente");
		else if (nota < 6)
			System.out.println("Suficiente");
		else if (nota < 7)
			System.out.println("Bien");
		else if (nota < 9)
			System.out.println("Notable");
		else if (nota <= 10)
			System.out.println("Sobresaliente");
		sc.close();
	}
}
