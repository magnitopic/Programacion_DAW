package EjerciciosSwitch1;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String alu1, alu2, alu3, alu4, alu5;
		double alu1P, alu2P, alu3P, alu4P, alu5P;
		double alu1S, alu2S, alu3S, alu4S, alu5S;
		double alu1DB, alu2DB, alu3DB, alu4DB, alu5DB;
		int opc;

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
				System.out.println("Nombre: " + alu1 + ". Programación: ");
				break;

		}

		sn.close();
	}
}
