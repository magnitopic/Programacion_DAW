package EjerciciosIniciales1;

import java.util.Scanner;

public class Ejer16 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		String name;
		int salary;
		int children;
		int familly;

		System.out.print("Introduce tu nombre: ");
		name=sn.nextLine();
		System.out.print("Introduce tu salario mensual: ");
		salary=sc.nextInt();
		System.out.print("Introduce el numero de hijos que tienes: ");
		children=sc.nextInt();
		System.out.print("Introduce el numero de familiares a cargo: ");
		familly=sc.nextInt();

		System.out.println(name + ", tienes un salario anual de "+ (salary*12)+(children*50)+(familly*100));

		sn.close();
		sc.close();
	}
}