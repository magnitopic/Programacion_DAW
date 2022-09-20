package EjerciciosCondicionales2;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		int sueldoFinal, sueldoBase, antiquity, age, children;
		String name, surname;

		System.out.print("Indica tu nombre: ");
		name = si.nextLine();
		System.out.print("Indica tu apellido: ");
		surname = si.nextLine();
		System.out.print("Introduce tu sueldo base: ");
		sueldoBase = sn.nextInt();
		System.out.print("Introduce tu antigüedad: ");
		antiquity = sn.nextInt();
		System.out.print("Introduce tu edad: ");
		age = sn.nextInt();
		System.out.print("Introduce cuentos hijos tienes: ");
		children = sn.nextInt();

		
		sueldoFinal = (antiquity/5)*45;
		if (children > 2)
			sueldoFinal += 100;
		else if (children == 0)
			sueldoFinal -= 50;
		if (age > 50 && age < 60)
			sueldoBase += (sueldoBase * .1);
		sueldoFinal += sueldoBase;

		System.out.println("Sr./Sra. " + name +" " + surname);
		System.out.println("Tu sueldo mensual es de " + sueldoFinal + "€");
		System.out.println("Menos el IRPF se queda en " + (sueldoFinal-(sueldoFinal*.19)) + "€");
		System.out.println("Tu sueldo anual es de " + sueldoFinal * 12 + "€");
		System.out.println("Menos el IRPF se queda en " + ((sueldoFinal-(sueldoFinal*.19))*12) + "€");

		sn.close();
		si.close();
	}

}
