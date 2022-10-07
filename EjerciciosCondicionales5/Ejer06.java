package EjerciciosCondicionales5;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double precioBase, nVendidos, porCienIva;

		System.out.print("Introduce el precio base del producto: ");
		precioBase = sc.nextInt();
		System.out.print("Introduce el numero de unudades vendidas: ");
		nVendidos = sc.nextInt();
		System.out.print("Introduce el procentaje de IVA: ");
		porCienIva = sc.nextInt();

		System.out.println("Este producto nos generará un beneficio de " + ((precioBase * (porCienIva / 100)) * nVendidos));
		sc.close();
	}
}
