package EjerciciosCondicionales0;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int price;

		System.out.print("Introduce el importe de tu compra: ");
		price = sn.nextInt();

		if (price > 150)
			System.out.println("Ud deve pagar " + (price-(price*0.23)) + "€, con el descuento aplicado");
		else
			System.out.println("Ud deve pagar " + price + "€");

		sn.close();
	}

}
