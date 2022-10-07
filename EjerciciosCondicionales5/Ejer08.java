package EjerciciosCondicionales5;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, m, s;

		System.out.print("Introduce la hora actual: ");
		h = sc.nextInt();
		System.out.print("Introduce los minutos actuales: ");
		m = sc.nextInt();
		System.out.print("Introduce los segundos actuales: ");
		s = sc.nextInt();


		if ((h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60))
			System.out.println("La hora es correcta");
		else
			System.out.println("Valores invalidos");

		sc.close();
	}
}
