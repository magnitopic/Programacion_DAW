package Examen1;

import java.util.Scanner;

public class juegos8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int puntosNadal, puntosThiem;

		System.out.print("Intorduce el numero de juegos ganados por Rafa Nadal: ");
		puntosNadal = sc.nextInt();
		System.out.print("Introduce el numero de juegos ganados por Dominic Thiem: ");
		puntosThiem = sc.nextInt();

		System.out.println("Juegos ganados por Rafa: " + puntosNadal);
		System.out.println("Juegos ganados por Thiem: " + puntosThiem);
		System.out.print("Respuest del programa: ");

		if (puntosNadal >= 6 && (puntosNadal - puntosThiem > 2))
			System.out.print("Inválido");
		else if (puntosThiem >= 6 && (puntosThiem - puntosNadal > 2))
			System.out.print("Inválido");
		else if (puntosNadal >= 6 && puntosNadal - puntosThiem == 2)
			System.out.print("Ganó Rafa");
		else if (puntosThiem >= 6 && puntosThiem - puntosNadal == 2)
			System.out.print("Ganó Thiem");
		else
			System.out.print("En juego");
		sc.close();
	}
}
