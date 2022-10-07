package EjerciciosBucles2;

import java.util.Scanner;

public class Ejer04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mark;
		int passed = 0, almost = 0, failed = 0;

		for (int i = 1; i <= 66; i++){
			mark = sc.nextDouble();
			if (mark >= 5)
				passed++;
			else if (mark == 4)
				almost++;
			else
				failed++;
		}

		System.out.println("Alumnos aprobados: "+ passed);
		System.out.println("Alumnos casi aprobados: "+ almost);
		System.out.println("Alumnos suspensos: "+ failed);

		sc.close();
	}
}
