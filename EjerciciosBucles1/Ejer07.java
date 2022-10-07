package EjerciciosBucles1;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {
		int ages = 0, newAge, adults = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Introduce un nombre");
			newAge = sc.nextInt();
			if (newAge >= 18)
				adults++;
			ages += newAge;
		} while (newAge < 0);

		System.out.println("Suma de las edades: " + ages);
		System.out.println(adults + " alumnos son mayores de edad");
		sc.close();
	}

}
