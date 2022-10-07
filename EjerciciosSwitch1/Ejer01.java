package EjerciciosSwitch1;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int opc, irpf;
		double precioProducto, sueldo;

		System.out.println("1.	Calcular el 21% de IVA de un producto.");
		System.out.println("2.	Calcular el IRPF del sueldo.");
		System.out.println("3.	Calcular la paga extra del salario.");
		System.out.println("4.	Salir");
		System.out.print("--> ");
		opc = sn.nextInt();

		switch (opc) {
			case 1:
				System.out.print("Introduzca el precio del producto: ");
				precioProducto = sn.nextDouble();
				System.out.println("El 21% de IVA del producto se queda en: " + (precioProducto * .21) + "€");
				break;
			case 2:
				System.out.print("Introduzca su sueldo: ");
				sueldo = sn.nextDouble();
				System.out.print("Introduzca el porcentaje de IRPF: ");
				irpf = sn.nextInt();
				System.out.println("El IRPF que ud. tiene que pagar es de: " + (sueldo * (irpf / 100)) + "€");
				break;
			case 3:
				System.out.print("Introduzca su sueldo: ");
				sueldo = sn.nextDouble();
				System.out.println("Con la paga extra se queda su sueldo en : " + (sueldo * 1.25) + "€");
				break;
			default:
				System.out.println("Adiós");
		}

		sn.close();
	}

}
