package ArraysBidimensionales03;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String[][] datos = new String[2][6];
		String[] subjects = { "redes", "sistemas", "móviles", "programación", "fol" };
		boolean flag = false;
		String name;

		for (int i = 0; i < datos.length; i++) {
			System.out.print("Inserta el nombre del alumno: ");
			datos[i][0] = sn.nextLine();
			System.out.print("Inserte las 5 notas del alumno \"" + datos[i][0] + "\": ");
			String[] notas = sn.nextLine().split(" ");
			for (int j = 0; j < notas.length; j++)
				datos[i][j + 1] = notas[j];
		}

		while (true) {
			int opt = showMenu();
			switch (opt) {
				case 1:
					System.out.print("Introduce el nombre del alumno del que quieres ver las notas: ");
					name = sn.nextLine();
					flag = false;
					for (int i = 0; i < datos.length; i++) {
						if (name.equalsIgnoreCase(datos[i][0])) {
							showMarks(i, datos);
							flag = true;
						}

					}
					if (!flag)
						System.out.println("No se ha encontrado a ese alumno.");
					break;
				case 2:
					for (int i = 0; i < datos.length; i++) {
						showMarks(i, datos);
					}
					break;
				case 3:
					System.out.print("Introduce el nombre del alumno del que quieres modificar las notas: ");
					name = sn.nextLine();
					flag = false;
					for (int i = 0; i < datos.length; i++) {
						if (name.equalsIgnoreCase(datos[i][0])) {
							changeData(i, datos);
							flag = true;
						}
					}
					if (!flag)
						System.out.println("No se ha encontrado a ese alumno.");
					break;
				case 4:
					for (int i = 0; i < datos.length; i++) {
						for (int j = 1; j < datos[i].length; j++)
							datos[i][j] = "0";
					}
					break;
				case 5:
					for (int i = 0; i < datos.length; i++) {
						for (int j = 1; j < datos[i].length; j++) {
							if (Integer.parseInt(datos[i][j]) < 5)
								datos[i][j] = "5";
						}
					}
					break;
				case 6:
					double sum = 0;
					System.out.print("Introduce el nombre de la asignatura de la que quieres ver la media: ");
					name = sn.nextLine();
					flag = false;
					for (int i = 0; i < subjects.length; i++) {
						for (int j = 0; j < datos.length; j++) {
							if (name.equalsIgnoreCase(subjects[i])) {
								sum += Double.parseDouble(datos[j][i]);
								flag = true;
							}
						}
					}
					if (!flag)
						System.out.println("No se ha encontrado esa asignatura.");
					else
						System.out.println("La media de las notas es de " + (sum / subjects.length));
					break;
				case 7:
					double min = Double.MAX_VALUE;
					int pos = 0;
					for (int i = 0; i < datos.length; i++) {
						sum = 0;
						for (int j = 1; j < datos[i].length; j++)
							sum += Double.parseDouble(datos[i][j]);
						if (sum < min) {
							min = sum;
							pos = i;
						}
					}
					System.out.println("El estudiante con la media más baja es " + datos[pos][0]);
					break;
				case 8:
					double max = Double.MIN_VALUE;
					pos = 0;
					for (int i = 0; i < datos.length; i++) {
						sum = 0;
						for (int j = 1; j < datos[i].length; j++)
							sum += Double.parseDouble(datos[i][j]);
						if (sum < max) {
							max = sum;
							pos = i;
						}
					}
					System.out.println("El estudiante con la media más alta es " + datos[pos][0]);
					break;
				case 9:
					int counter = 0;
					max = 0;
					pos = 0;
					for (int i = 0; i < datos.length; i++) {
						for (int j = 1; j < datos[i].length; j++) {
							if (Double.parseDouble(datos[i][j]) < 5)
								counter++;
						}
						if (counter > max) {
							max = counter;
							pos = i;
						}
					}
					System.out.println("El estudiante con la media más alta es " + datos[pos][0]);
					break;
				case 10:
					sc.close();
					sn.close();
					return;
			}
		}

	}

	public static void changeData(int num, String[][] datos) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int opt;
		do {
			showMenu2();
			opt = sc.nextInt() - 1;
		} while (opt > 5 || opt < 0);
		System.out.print("Introduce el nuevo valor: ");
		datos[num][opt] = sn.nextLine();
		System.out.println(datos[num][opt]);
	}

	public static void showMarks(int num, String[][] datos) {
		System.out.print(datos[num][0] + ": Redes: " + datos[num][1] + " - Sistemas: " + datos[num][2] + " - Móviles: "
				+ datos[num][3] + " - Programación: " + datos[num][4] + " - FOL: " + datos[num][5] + "\n");
	}

	public static int showMenu() {
		Scanner sc = new Scanner(System.in);
		int opt;
		System.out.println("1.	Mostrar datos de un alumno");
		System.out.println("2.	Mostrar datos de todos los alumnos");
		System.out.println("3.	Modificar datos de un alumno");
		System.out.println("4.	Poner un 0 a todos los alumnos en todos los módulos");
		System.out.println("5.	Aprobado general a todos los alumnos en todos los módulos");
		System.out.println("6.	Mostar en pantalla la media de una asignaura pedida al usuario");
		System.out.println("7.	Mostrar el nombre del alumno con media más baja");
		System.out.println("8.	Mostrar el nombre del alumno con media más alta");
		System.out.println("9.	Mostrar el nombre del alumno con más nº de suspensos");
		System.out.println("10.	Salir");
		System.out.print("--> ");
		opt = sc.nextInt();
		return opt;
	}

	public static void showMenu2() {
		System.out.println("1.	Modificar nombre");
		System.out.println("2.	Modificar nota redes");
		System.out.println("3.	Modificar nota sistemas");
		System.out.println("4.	Modificar nota móviles");
		System.out.println("5.	Modificar nota programación");
		System.out.println("6.	Modificar nota FOL");
		System.out.print("--> ");
	}
}
