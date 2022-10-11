package EjerciciosArrays2;

import java.util.Arrays;

import java.util.Scanner;

public class Ejer11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt;
		int[] list = new int[30];

		while (true) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.	Lectura de un array de 30 elementos enteros");
			System.out.println("2.	Sumatoria de los elementos del array");
			System.out.println("3.	Listado de los elementos del array");
			System.out.println("4.	Encontrar el elemento máximo del array");
			System.out.println("5.	Encontrar el elemento mínimo del array");
			System.out.println("6.	Encontrar el rango");
			System.out.println("7.	Obtener la media de los elementos del array");
			System.out.println("8.	Salir");
			System.out.print("--> ");
			opt = sc.nextInt();

			switch (opt) {
				case 1:
					for (int i = 0; i < list.length; i++) {
						System.out.print("Introduce un numero: ");
						list[i] = sc.nextInt();
					}
					break;
				case 2:
					System.out.println(Arrays.stream(list).sum());
					break;
				case 3:
					for (int i = 0; i < list.length; i++)
						System.out.print(list[i] + ", ");
					System.out.print("\n");
					break;
				case 4:
					System.out.println("El mayor valor del array es " + Arrays.stream(list).max().getAsInt());
					break;
				case 5:
					System.out.println("El menor valor del array es " + Arrays.stream(list).min().getAsInt());
					break;
				case 6:
					System.out.println("El rango del array es " + Arrays.stream(list).max().getAsInt() + " - "
							+ Arrays.stream(list).min().getAsInt());
					break;
				case 7:
					System.out.println("La media del array es " + (Arrays.stream(list).sum() / list.length));
					break;
				default:
					System.out.println("Adiós");
					sc.close();
					return;
			}
		}
	}
}
