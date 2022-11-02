package EjerciciosString06;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		Scanner sc = new Scanner(System.in);
		String date;
		System.out.print("Introduce una fecha con formato dd/mm/aaaa: ");
		date = sc.nextLine();

		String[] words = date.split("/");
		if (words.length == 3) {
			System.out.println(words[0] + " de " + meses[Integer.parseInt(words[1]) - 1] + " de " + words[2]);
		}

		sc.close();
	}
}
