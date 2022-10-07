package EjerciciosFor;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		int menor = 0, adulto = 0, jubilado = 0, age;

		for (int i = 0; i < 20; i++) {
			System.out.print("Introduce cuantos años tienes: ");
			age = si.nextInt();
			if (age < 18)
				menor++;
			else if (age < 65)
				adulto++;
			else
				age++;
		}

		System.out.println("Menores de edad: " + menor + " Adultos: " + adulto + " Jubilados: " + jubilado);

		si.close();
	}

}
