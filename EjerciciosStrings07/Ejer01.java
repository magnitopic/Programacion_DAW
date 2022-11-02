package EjerciciosStrings07;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int opt, num;
		String phrase;
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		print_menu();
		opt = sn.nextInt();

		switch (opt) {
			case 1:
				System.out.print("Cuntos caracteres quieres?: ");
				num = sn.nextInt();
				for (int i = 0; i < num; i++)
					System.out.print(phrase.charAt(i));
				break;
			case 2:
				System.out.print("Cuntos caracteres quieres?: ");
				num = sn.nextInt();
				for (int i = num; i > 0; i--)
					System.out.print(phrase.charAt(i));
				break;
			default:
				System.out.println("Adiós");
				break;
		}

		sc.close();
		sn.close();
	}

	static void print_menu() {
		System.out.println("1.	Extraer los n primeros caracteres");
		System.out.println("2.	Extraer los n ultimos caracteres");
		System.out.println("3.	Eleminar los espacios en blanco que haya al final de la cadena");
		System.out.println("4.	Eliminar los espacios en blanco que haya al comienzo de la cadena");
		System.out.println("5.	Eliminar los n primeros caracteres que aparezcan apartir de la posición p");
		System.out.println("6.	Eliminar la primera aparición de una cadena dentro de otra");
		System.out.println("7.	Inserar una cadena dentro de otra a partir de la posición p");
		System.out.println("8.	Sustituir una cadena por otra");
		System.out.println("9.	Contar el número de veces que aparece una cadena dentro de otra");
		System.out.println("10.	Borrar todas las apariciones de una cadena dentro de otra");
		System.out.print("--> ");
	}
}
