package EjerciciosBucles2;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pos = 0, aux, i = 0;
		double len = 0;

		do {
			System.out.print("Introduce la longitud del arbol, -1 para salir: ");
			aux = sc.nextInt();
			i++;
			if (aux > len) {
				len = aux;
				pos = i;
			}
		} while (aux != -1);

		System.out.println("Árbol " + pos + " - " + (len / 100) + " metros.");

		sc.close();
	}

}
