package EjerciciosCondicionales5;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		String name1, name2, name3, name4;
		
		System.out.print("Introduzca un nombre: ");
		name1 = si.nextLine();
		System.out.print("Introduzca un nombre: ");
		name2 = si.nextLine();
		System.out.print("Introduzca un nombre: ");
		name3 = si.nextLine();
		System.out.print("Introduzca un nombre: ");
		name4 = si.nextLine();
		
		if (name1.equalsIgnoreCase("Carlitos") || name2.equalsIgnoreCase("Carlitos") || name3.equalsIgnoreCase("Carlitos") || name4.equalsIgnoreCase("Carlitos"))
		{
			System.out.println("Tenemos algún Carlitos");
			if (name1.equalsIgnoreCase("Fede") || name2.equalsIgnoreCase("Fede") || name3.equalsIgnoreCase("Fede") || name4.equalsIgnoreCase("Fede"))
				System.out.println("Fede y Carlitos bros");
		} else if (name1.equalsIgnoreCase("Fede") && name2.equalsIgnoreCase("Fede") && name3.equalsIgnoreCase("Fede") && name4.equalsIgnoreCase("Fede"))
			System.out.println("Team Fede");
		
		si.close();
	}
}
