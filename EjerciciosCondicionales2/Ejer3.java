package EjerciciosCondicionales2;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int dia, mes;

		System.out.print("Introduzca en que dia del més se encuentra: ");
		dia = sn.nextInt();
		System.out.print("Introduzca en que mes se encuentra: ");
		mes = sn.nextInt();

		if ((mes == 6 && dia >= 22) || mes == 7 || mes == 8 || (mes == 9 && dia <= 22))
			System.out.println("Verano");
		else if ((dia >= 23 && mes == 10) || mes == 10 || mes == 11 || (dia <= 20 && mes == 12))
			System.out.println("Otoño");
		else if ((dia >= 21 && mes == 12) || mes == 1 || mes == 2 || (dia <= 20 && mes == 3))
			System.out.println("Invierno");
		else if ((dia >= 21 && mes == 3) || mes == 4|| mes == 5 || (dia <= 21 && mes == 6))
			System.out.println("Primavera");
		else
			System.out.println("Valor invalido");
		sn.close();
	}

}
