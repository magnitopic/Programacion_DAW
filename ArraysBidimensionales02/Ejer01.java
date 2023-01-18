package ArraysBidimensionales02;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String[][] datos = new String[2][6];
		boolean flag = false;
		String name;

		for (int i = 0; i < datos.length; i++) {
			System.out.print("Inserta el nombre del alumno: ");
			datos[i][0] = sn.nextLine();
			System.out.print("Inserte las 5 notas del alumno \"" + datos[i][0] + "\": ");
			String[] notas = sn.nextLine().split(" ");
			for (int j = 0; j < notas.length; j++) {
				datos[i][j + 1] = notas[j];
			}
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
		sc.close();
		sn.close();
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
		System.out.println("6.	Salir");
		System.out.print("--> ");
		opt = sc.nextInt();
		sc.close();
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
