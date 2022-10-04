package EjerciciosBucles3;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		double mark, med = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
		String name, maxName, minName;
		int apr = 0, sus = 0, ant = 0;

		for (int i = 0; i < 30; i++) {
			System.out.print("Introduce el nombre de un alumno: ");
			name = si.nextLine();
			System.out.print("Introduce la nota del alumno: ");
			mark = sc.nextDouble();
			if (mark >= 5)
				apr++;
			else
				sus++;
			if (name.equalsIgnoreCase("antonio"))
				ant++;
			if (mark < min) {
				min = mark;
				minName = name;
			}
			if (mark > max) {
				max = mark;
				maxName = name;
			}
			med += mark;
		}
		
		System.out.println("La nota media es " + (med / 30));

		sc.close();
		si.close();
	}

}
