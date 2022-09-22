package EjerciciosCondicionales5;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int CriptoNelsons;

		System.out.print("Pon cuantos CriptoNelsons © tienes: ");
		CriptoNelsons = sc.nextInt();

		if (CriptoNelsons > 20)
			System.out.println("Puedes comprar Papadeltas");
		if (CriptoNelsons > 110)
			System.out.println("Puedes comprar Drakis");
		if (CriptoNelsons > 50)
			System.out.println("Puedes comprar Palotes");
		if (CriptoNelsons > 100)
			System.out.println("Puedes comprar MaxiRoll");
		if (CriptoNelsons > 15)
			System.out.println("Puedes comprar Hubba Bubba");
		if (CriptoNelsons > 20)
			System.out.println("Puedes comprar Chimos");
		if (CriptoNelsons > 70)
			System.out.println("Puedes comprar Fresquitos");
		if (CriptoNelsons > 35)
			System.out.println("Puedes comprar Peta Zetas");

		sc.close();
	}

}
