package EjerciciosCondicionales2;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		int antiquity, age, children;
		double sueldoAnual, sueldoMensual; 
		String name, surname;

		System.out.print("Indica tu nombre: ");
		name = si.nextLine();
		System.out.print("Indica tu apellido: ");
		surname = si.nextLine();
		System.out.print("Introduce tu sueldo base: ");
		sueldoMensual = sn.nextDouble();
		System.out.print("Introduce tu antigüedad: ");
		antiquity = sn.nextInt();
		System.out.print("Introduce tu edad: ");
		age = sn.nextInt();
		System.out.print("Introduce cuentos hijos tienes: ");
		children = sn.nextInt();

		if (age > 50 && age < 60)
			sueldoMensual += (sueldoMensual * .1);
		sueldoMensual += (antiquity / 5) * 45;
		sueldoAnual = sueldoMensual * 12;
		if (children > 2)
			sueldoAnual += 400;
		else if (children == 0)
			sueldoAnual -= 50;

		System.out.println("Sr./Sra. " + name + " " + surname);
		System.out.println("Tu sueldo mensual es de " + sueldoMensual + "€");
		System.out.println("Menos el IRPF se queda en " + (sueldoMensual - (sueldoMensual * .19)) + "€");
		System.out.println("Tu sueldo anual es de " + sueldoAnual + "€");
		System.out.println("Menos el IRPF se queda en " + (sueldoAnual - (sueldoAnual * .19)) + "€");

		sn.close();
		si.close();
	}

}
