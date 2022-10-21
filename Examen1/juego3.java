package Examen1;

import java.util.Scanner;

public class juego3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int num, max = 0, min = 0, sum = 0, count = 0;
		String continuar;

		do {
			System.out.print("Introduce un numero: ");
			num = sc.nextInt();
			if (count == 0 || num > max)
				max = num;
			if (count == 0 || num < min)
				min = num;

			sum += num;
			count++;

			System.out.println("Quieres introducir otro numero?(y,n)");
			System.out.print("--> ");
			continuar = sn.nextLine();

		} while (continuar.equalsIgnoreCase("y"));

		System.out.println("El mayor numero es " + max);
		System.out.println("El menor numero es " + min);
		System.out.println("Y la media es " + (sum / count));
		sc.close();
		sn.close();
	}
}
