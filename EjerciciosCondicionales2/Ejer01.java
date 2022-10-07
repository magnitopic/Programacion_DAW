package EjerciciosCondicionales2;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int num;

		System.out.print("Introduce un numero: ");
		num = sn.nextInt();

		if (num == 1)
			System.out.println("Lunes");
		if (num == 2)
			System.out.println("Martes");
		if (num == 3)
			System.out.println("Miercoles");
		if (num == 4)
			System.out.println("Jueves");
		if (num == 5)
			System.out.println("Viernes");
		if (num == 6)
			System.out.println("Sabado");
		if (num == 7)
			System.out.println("Domingo");
		sn.close();
	}

}
