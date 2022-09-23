package EjerciciosSwitch1;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Scanner si = new Scanner(System.in);
		String alu1, alu2, alu3;
		double alu1P, alu2P, alu3P, alu4P, alu5P;
		double alu1S, alu2S, alu3S, alu4S, alu5S;
		double alu1DB, alu2DB, alu3DB, alu4DB, alu5DB;
		int opc;

		System.out.print("Cual es el nombre del primer alumno: ");
		alu1 = si.nextLine();
		System.out.print("Que nota ha sacado en Programación");
		alu1P = sn.nextDouble();
		System.out.print("Que nota ha sacado en Sistemas");
		alu1S = sn.nextDouble();
		System.out.print("Que nota ha sacado en Bases de Datos");
		alu1DB = sn.nextDouble();

		System.out.print("Cual es el nombre del segundo alumno: ");
		alu2 = si.nextLine();
		System.out.print("Que nota ha sacado en Programación");
		alu2P = sn.nextDouble();
		System.out.print("Que nota ha sacado en Sistemas");
		alu2S = sn.nextDouble();
		System.out.print("Que nota ha sacado en Bases de Datos");
		alu2DB = sn.nextDouble();

		System.out.print("Cual es el nombre del tercer alumno: ");
		alu3 = si.nextLine();
		System.out.print("Que nota ha sacado en Programación");
		alu3P = sn.nextDouble();
		System.out.print("Que nota ha sacado en Sistemas");
		alu3S = sn.nextDouble();
		System.out.print("Que nota ha sacado en Bases de Datos");
		alu3DB = sn.nextDouble();


		System.out.print("Cual es el nombre del cuarto alumno: ");
		si.nextLine();
		System.out.print("Que nota ha sacado en Programación");
		alu4P = sn.nextDouble();
		System.out.print("Que nota ha sacado en Sistemas");
		alu4S = sn.nextDouble();
		System.out.print("Que nota ha sacado en Bases de Datos");
		alu4DB = sn.nextDouble();


		System.out.print("Cual es el nombre del quinto alumno: ");
		si.nextLine();
		System.out.print("Que nota ha sacado en Programación");
		alu5P = sn.nextDouble();
		System.out.print("Que nota ha sacado en Sistemas");
		alu5S = sn.nextDouble();
		System.out.print("Que nota ha sacado en Bases de Datos");
		alu5DB = sn.nextDouble();


		System.out.println("1.	Mostrar las notas alumno1.");
		System.out.println("2.	Mostrar las notas alumno2.");
		System.out.println("3.	Mostrar las notas alumno3.");
		System.out.println("4.	Mostrar la nota media de todos los alumnos en todas las asignaturas.");
		System.out.println("5.	Mostrar la nota media de Programación.");
		System.out.println("6.	Mostrar la nota media de Sistemas.");
		System.out.println("7.	Mostrar la nota media de Bases de Datos.");
		System.out.println("8.	Salir");
		System.out.print("--> ");
		opc = sn.nextInt();

		switch (opc) {
			case 1:
				System.out.println("Nombre: " + alu1 + ". Programación: " + alu1P + ". Sistemas: " + alu1S
						+ ". Bases de Datos: " + alu1DB + ". Nota Media: " + (alu1S + alu1DB + alu1P) / 3);
				break;
			case 2:
				System.out.println("Nombre: " + alu2 + ". Programación: " + alu2P + ". Sistemas: " + alu2S
						+ ". Bases de Datos: " + alu2DB + ". Nota Media: " + (alu2S + alu2DB + alu2P) / 3);
				break;
			case 3:
				System.out.println("Nombre: " + alu3 + ". Programación: " + alu3P + ". Sistemas: " + alu3S
						+ ". Bases de Datos: " + alu3DB + ". Nota Media: " + (alu3S + alu3DB + alu3P) / 3);
				break;
			case 4:
				System.out.println("La nota media de todos los alumnos en todas las asignaturas es de: "
						+ (alu1S + alu1DB + alu1P + alu2S + alu2DB + alu2P + alu3S + alu3DB + alu3P + alu4S + alu4DB
								+ alu4P + alu5S + alu5DB + alu5P) / 15);
				break;
			case 5:
				System.out
						.println("La nota media de programación es de :" + (alu1P + alu2P + alu3P + alu4P + alu5P) / 5);
				break;
			case 6:
				System.out.println("La nota media de sistemas es de: " + (alu1S + alu2S + alu3S + alu4S + alu5S) / 5);
				break;
			case 7:
				System.out.println(
						"La nota media de sistemas es de: " + (alu1DB + alu2DB + alu3DB + alu4DB + alu5DB) / 5);
				break;
			default:
				System.out.println("Adiós.");
		}

		sn.close();
		si.close();
	}
}
