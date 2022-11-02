package EjerciciosString07;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int opt, num, p;
		String phrase, phrase2;
		System.out.print("Introduce una frase: ");
		phrase = sc.nextLine();

		print_menu();
		opt = sn.nextInt();

		int neg_count = phrase.length() - 1;
		switch (opt) {
			case 1:
				System.out.print("Introduce el numero de caracteres: ");
				num = sn.nextInt();
				for (int i = 0; i < num; i++)
					System.out.print(phrase.charAt(i));
				break;
			case 2:
				System.out.print("Introduce el numero de caracteres: ");
				num = sn.nextInt();
				for (int i = 0; i < num; i++)
					System.out.print(phrase.charAt(neg_count--));
				break;
			case 3:
				while (phrase.charAt(neg_count) == ' ')
					neg_count--;
				for (int i = 0; i < neg_count; i++)
					System.out.print(phrase.charAt(i));
				break;
			case 4:
				int aux = 0;
				while (phrase.charAt(aux) == ' ')
					aux++;
				for (int j = aux; j < phrase.length(); j++)
					System.out.print(phrase.charAt(aux));
				break;
			case 5:
				System.out.print("Introduce el numero de caracteres: ");
				num = sn.nextInt();
				System.out.print("A partir de que posición: ");
				p = sn.nextInt();
				for (int i = 0; i < phrase.length(); i++) {
					if (i == p)
						i += num;
					System.out.print(phrase.charAt(i));
				}
				break;
			case 6:
				System.out.print("Introduce la cadena que no quieres que aparezca: : ");
				phrase2 = sc.nextLine();
				System.out.println(phrase.replaceFirst(phrase2, ""));
				break;
			case 7:
				System.out.print("Introduce la cadena que se quiere introducir: ");
				phrase2 = sc.nextLine();
				System.out.print("En que posición?: ");
				num = sn.nextInt();
				System.out.println(phrase.substring(0, num + 1) +
						phrase2 +
						phrase.substring(num + 1));
				break;
			case 8:
				System.out.print("Introduce la nueva cadena: ");
				phrase = sc.nextLine();
				System.out.println(phrase);
				break;
			case 9:
				System.out.print("Introduce la cadena a contar: ");
				phrase2 = sc.nextLine();
				int k = 0, j = 0, count = 0;
				while (k < phrase.length()) {
					j = 0;
					while (phrase.charAt(k) == phrase2.charAt(j)) {
						if (j + 1 == phrase2.length()) {
							count++;
							j = 0;
						}
						j++;
						k++;
					}
					k++;
				}
				System.out.println("Se han encotrado " + count + " veces");
				break;
			case 10:
				System.out.print("Introduce la cadena que no quieres que aparezca: ");
				phrase2 = sc.nextLine();
				System.out.println(phrase.replace(phrase2, ""));
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
