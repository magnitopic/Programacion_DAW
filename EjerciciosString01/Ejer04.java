package EjerciciosString01;

import java.util.Scanner;

public class Ejer04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce tu nombre: ");
			if (sc.nextLine().equalsIgnoreCase("Antonio"))
				count++;
			System.out.println("Introduce tu apellido: ");
			sc.nextLine();
		}

		System.out.println("Han introducido su nombre" + count + " Antonios");
		sc.close();
	}
}
