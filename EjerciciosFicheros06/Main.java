package EjerciciosFicheros06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<Empleado> getEmpleadosFromFile() {
		ArrayList<Empleado> Empleados = new ArrayList<Empleado>();
		File file = new File("./EjerciciosFicheros04/Empleados.txt");
		String st;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
				String[] data = st.split(";");
				Empleados.add(
						new Empleado(
								data[0],
								data[1],
								data[2],
								data[3],
								data[4],
								data[5],
								data[6],
								data[7],
								data[8],
								data[9],
								data[10],
								data[11],
								data[12],
								data[13],
								data[14],
								data[15],
								data[16],
								data[17],
								data[18],
								data[19],
								data[20],
								data[21],
								data[22],
								data[23],
								data[24],
								data[25],
								data[26],
								data[27],
								data[28],
								data[29],
								data[30],
								data[31],
								data[32],
								data[33]));
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error al leer el fichero");
		}
		return Empleados;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		ArrayList<Empleado> Empleados = getEmpleadosFromFile();
		int opt;
		do {
			System.out.println("1.\tMostrar por pantalla el Nº de usuarios totales.");
			System.out.println("2.\tMostrar por pantalla el Nº de usuarios hombre y el Nº de usuarios mujer.");
			System.out.println("3.\tMostrar por pantalla los datos de los usuarios que estén casados.");
			System.out
					.println("4.\tMostrar por pantalla el nombre y apellidos de los usuarios con salud \"excelente\".");
			System.out.println("5.\tEliminar un usuario por teléfono.");
			System.out.println("6.\tModificar un dato de un usuario.");
			System.out.println("7.\tSalir.");
			opt = sn.nextInt();
			switch (opt) {
				case 1:
					System.out.println("El número de usuarios totales es: " + Empleados.size());
					break;
				case 2:
					int hombres = 0;
					int mujeres = 0;
					for (Empleado e : Empleados) {
						if (e.getSexo().equals("Hombre"))
							hombres++;
						else if (e.getSexo().equals("Mujer"))
							mujeres++;
					}
					System.out.println("El número de usuarios hombres es: " + hombres);
					System.out.println("El número de usuarios mujeres es: " + mujeres);
					break;
				case 3:
					for (Empleado e : Empleados) {
						if (e.getEstadoCivil().equals("Casado"))
							e.printData();
					}
					break;
				case 4:
					for (Empleado e : Empleados) {
						if (e.getSalud().equals("Excelente"))
							System.out.println(e.getNombre() + " " + e.getApellidos());
					}
					break;
				case 5:
					Empleado empleado = getEmpleadoByTel(Empleados);
					if (empleado != null) {
						Empleados.remove(empleado);
						System.out.println("Usuario eliminado correctamente.");
					} else
						System.out.println("No se ha encontrado ningún usuario con ese teléfono.");
					break;
				case 6:
					empleado = getEmpleadoByTel(Empleados);
					if (empleado != null) {
						System.out.print("Que dato quieres modificar?:");
						String dato = sc.nextLine();
						System.out.print("Introduce el nuevo valor: ");
						String valor = sc.nextLine();
					} else
						System.out.println("No se ha encontrado ningún usuario con ese teléfono.");
			}
		} while (opt < 1 || opt > 6);

		sc.close();
		sn.close();
	}

	public static Empleado getEmpleadoByTel(ArrayList<Empleado> Empleados) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el teléfono del usuario: ");
		String tel = sc.nextLine();
		for (Empleado e : Empleados) {
			if (e.getTelefono().equals(tel)) {
				sc.close();
				return e;
			}
		}
		sc.close();
		return null;
	}
}
