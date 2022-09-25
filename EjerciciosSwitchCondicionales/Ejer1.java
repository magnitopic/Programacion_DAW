package EjerciciosSwitchCondicionales;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		int opc;

		System.out.println("1.	Calcular el área de un cuadrado.");
		System.out.println("2.	Calcular el área de un triángulo.");
		System.out.println("3.	Calcular el área de un círculo.");
		System.out.println("4.	Salir.");
		System.out.print("--> ");
		opc = sn.nextInt();

		switch (opc) {
			case 1:
				double side;
				System.out.print("Introduzca el tamaño del lado del cuadrado: ");
				side = sn.nextDouble();
				System.out.println("El área del cuadrado es de : " + side * side);
				break;
			case 2:
				double base, height;
				System.out.print("Introduce la base del triángulo: ");
				base = sn.nextDouble();
				System.out.print("Introduce la altura del triángulo: ");
				height = sn.nextDouble();
				System.out.println("El área del triángulo es de : " + (base * height) / 2);
				break;
			case 3:
				double radio;
				System.out.print("Introduce el radio del círculo: ");
				radio = sn.nextDouble();
				System.out.println("El área del círculo es de: " + Math.PI * Math.pow(radio, 2));
				break;
			default:
				System.out.println("Adiós");
		}

		sn.close();
	}
}
