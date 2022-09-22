package EjerciciosCondicionales5;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		int age, salary;
		String name;
		
		System.out.print("Introduzca su nombre: ");
		name = si.nextLine();
		System.out.print("Introduzca su edad: ");
		age = sc.nextInt();
		System.out.print("Introduzca su mes de nacimiento: ");
		sc.nextInt();
		System.out.print("Introduzca su sueldo: ");
		salary = sc.nextInt();

		if (name.equalsIgnoreCase("Enrique")) {
			if (age >= 18)
				System.out.println((salary * .15));
		} else
			System.out.println(salary * .9);
		
		System.out.println("Ud tiene " + age + " años");

		sc.close();
		si.close();
	}

}
