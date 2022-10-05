package EjerciciosBucles5;

import java.util.Scanner;

public class Ejer10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edadMed = 0, mayores = 0, altos = 0, age;
		double altura = 0, height;

		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce la edad de un almuno: ");
			age = sc.nextInt();
			edadMed += age;
			if (age >=18)
				mayores++;
			System.out.print("Introduce su estatura en metros: ");
			height = sc.nextDouble();
			altura += height;
			if (height > 1.75)
				altos++;
		}

		sc.close();
	}
}
