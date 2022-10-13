package EjerciciosArrays5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int students = 5, opc;
		String name, asigment;
		double currentAverage;
		String[] names = new String[students];
		double[][] marks = new double[3][students];
		String[] asigments = { "Programación", "Móviles", "BBDD" };

		for (int i = 0; i < students; i++) {
			System.out.print("Introduce el nombre del alumno: ");
			names[i] = sc.nextLine();
			for (int j = 0; j < marks.length; j++) {
				marks[j][i] = Math.round((Math.random() * 11) * 100.0) / 100.0;
			}
		}

		while (true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.	Mostrar notas de alumnos.");
			System.out.println("2.	Modificar  notas de alumnos.");
			System.out.println("3.	Mostrar nombre del mejor alumno.");
			System.out.println("4.	Mostrar nota media de un alumno.");
			System.out.println("5.	Mostrar nota media de todos los alumnos.");
			System.out.println("6.	Mostrar la nota media por asignaturas.");
			System.out.println("7.	Mostrar peor alumno.");
			System.out.println("8.	Salir");
			System.out.print("--> ");
			opc = sn.nextInt();

			switch (opc) {
				case 1:
					for (int i = 0; i < students; i++)
						System.out.println(names[i] + ": Programación " + marks[0][i] + " - BBDD: " + marks[1][i]
								+ " - Móviles: " + marks[2][i] + ".");
					break;
				case 2:
					System.out.print("Introduce el nombre del alumno: ");
					name = sc.nextLine();
					System.out.print("Introduce el nombre de la asignatura: ");
					asigment = sc.nextLine();
					try {
						System.out.print("Introduce la nueva nota: ");
						marks[findName(name, names)][findMark(asigment, asigments)] = sn.nextDouble();
					} catch (Exception e) {
						System.out.println("Datos invalidos.");
					}
					break;
				case 3:
					double bestMark = Double.MIN_VALUE;
					currentAverage = 0;
					int bestPos = Integer.MIN_VALUE;
					for (int i = 0; i < students; i++) {
						currentAverage = averageStudent(marks, i);
						if (currentAverage > bestMark) {
							bestMark = currentAverage;
							bestPos = i;
						}
					}
					System.out.println(
							"El alumno con mejor media es " + names[bestPos] + " con una nota media de " + bestMark);
					break;
				case 4:
					System.out.print("Introduce el nombre del alumno: ");
					name = sc.nextLine();
					System.out.println(
							"La nota media de " + name + " es de " + (averageStudent(marks, findName(name, names))));
					break;
				case 5:
					for (int i = 0; i < students; i++)
						System.out.println(names[i] + ": " + averageStudent(marks, i));
					break;
				case 6:
					for (int i = 0; i < marks.length; i++) {
						System.out.print("La nota media de " + asigments[i] + " es de "
								+ (Arrays.stream(marks[i]).sum() / marks[i].length));
					}
					break;
				case 7:
					double worstMark = Double.MIN_VALUE;
					currentAverage = 0;
					int worstPos = Integer.MIN_VALUE;
					for (int i = 0; i < students; i++) {
						currentAverage = averageStudent(marks, i);
						if (currentAverage < worstMark) {
							worstMark = currentAverage;
							worstPos = i;
						}
					}
					System.out.println(
							"El alumno con mejor media es " + names[worstPos] + " con una nota media de " + worstMark);
					break;
				default:
					sc.close();
					sn.close();
					return;
			}
		}

	}

	public static int findName(String name, String[] names) {
		int pos = -1;
		for (int i = 0; i < names.length; i++) {
			if (name.equalsIgnoreCase(names[i])) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	public static int findMark(String asigment, String[] asigments) {
		int pos = -1;
		for (int i = 0; i < asigments.length; i++) {
			if (asigment.equalsIgnoreCase(asigments[i])) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	public static double averageStudent(double[][] marks, int student) {
		double average = 0;
		for (int i = 0; i < marks.length; i++)
			average += marks[i][student];
		average /= marks.length;
		return average;
	}
}
