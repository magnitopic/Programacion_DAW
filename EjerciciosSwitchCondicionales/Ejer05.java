package EjerciciosSwitchCondicionales;

import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		int boughtTires, finalPrice;

		System.out.print("Introducca su nombre: ");
		sn.nextLine();
		System.out.print("Introduce cuantas ruedadas ha comprado: ");
		boughtTires = sn.nextInt();

		if (boughtTires < 12)
			finalPrice = boughtTires * 200;
		else if (boughtTires > 12)
			finalPrice = boughtTires * 165;
		else
			finalPrice = boughtTires * 180;

		System.out.println("El precio final de su compra es de " + finalPrice + "€");

		sn.close();
		si.close();
	}
}
