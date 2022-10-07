package EjerciciosSwitch1;

import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		double sueldo;
		int opc;

		System.out.print("Introcude tu nombre: ");
		si.nextLine();
		System.out.print("Introcude tu apellido: ");
		si.nextLine();
		System.out.print("Introcude tu salario: ");
		sueldo = sn.nextDouble();

		System.out.println("1.	Mostrar el sueldo anual.");
		System.out.println("2.	Calcular indemnización en caso de despido.");
		System.out.println("3.	Salir");
		System.out.print("--> ");
		opc = sn.nextInt();

		switch (opc) {
			case 1:
				System.out.println("El sueldo anual es de " + sueldo * 12 + "€");
				break;
			case 2:
				int months;
				System.out.print("Introduce los meses trabajados: ");
				months = sn.nextInt();
				System.out.println("Te correspondería " + (sueldo * .5) * months + "€");
				break;
			default:
				System.out.println("Adiós");
		}

		sn.close();
		si.close();
	}
}
