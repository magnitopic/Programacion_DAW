package EjerciciosFicheros05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<Paciente> getPacientesFromFile() {
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		File file = new File("./EjerciciosFicheros05/pacientes.txt");
		String st;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
				String[] data = st.split("\\|");
				pacientes.add(new Paciente(
						Integer.parseInt(data[0]),
						data[1],
						data[2],
						data[3],
						data[4],
						data[5],
						data[6],
						data[7]));
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error al leer el fichero");
		}
		return pacientes;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		ArrayList<Paciente> pacientes = getPacientesFromFile();
		int opt;
		do {
			System.out.println("1.\tMostrar los datos de todos los pacientes.");
			System.out.println("2.\tMostrar los datos de los pacientes que nacieron el \"24/01/1980\".");
			System.out.println("3.\tMostrar los datos de los pacientes de Madrid.");
			System.out.println("4.\tNúmero de pacientes nacidos antes de 1960.");
			System.out.println("5.\tMostrar el ID de los pacientes cuyo nombre sea \"Ana\".");
			System.out.println(
					"6.\tMostrar el nombre y apellidos de los pacientes cuya provincia sea igual a la especificada.");
			System.out.println(
					"7.\tMostrar el Id y teléfono de los pacientes cuya provincia sea igual a la especificada.");
			System.out.println(
					"8.\tMostrar el nombre y apellidos del o los pacientes que hayan nacido en el año más antiguo.");
			System.out.println(
					"9.\tMostrar en pantalla el nombre y apellidos de los pacientes que tengan de CP el mismo que el del Centro Nelson.");
			System.out.println("10.\tSalir.");
			System.out.print("--> ");
			opt = sc.nextInt();
			switch (opt) {
				case 1:
					for (Paciente p : pacientes) {
						p.showData();
						System.out.println("----------------");
					}
					break;
				case 2:
					for (Paciente p : pacientes){
						if (p.getFechaNacimiento().equals("24/01/1980")){
							p.showData();
							System.out.println("----------------");
						}
					}
					break;
				case 3:
					for (Paciente p : pacientes){
						if (p.getCiudad().equalsIgnoreCase("Madrid")){
							p.showData();
							System.out.println("----------------");
						}
					}
					break;
				case 4:
					int count = 0;
					for (Paciente p : pacientes){
						if (p.getFechaNacimiento().substring(6).compareTo("1960") < 0)
							count++;
					}
					System.out.println("Hay " + count + " pacientes nacidos antes de 1960.");
					break;
				case 5:
					for (Paciente p : pacientes){
						if (p.getNombre().equalsIgnoreCase("Ana")){
							System.out.println(p.getId());
							System.out.println("----------------");
						}
					}
					break;
				case 6:
					System.out.print("Introduce la provincia: ");
					String provincia = sn.nextLine();
					for (Paciente p : pacientes) {
						if (p.getCiudad().equalsIgnoreCase(provincia)){
							System.out.println(p.getNombre() + " " + p.getApellidos());
							System.out.println("----------------");
						}
					}
					break;
				case 7:
					System.out.print("Introduce la provincia: ");
					provincia = sn.nextLine();
					for (Paciente p : pacientes) {
						if (p.getCiudad().equalsIgnoreCase(provincia)){
							System.out.println(p.getId() + " " + p.getTelefono());
							System.out.println("----------------");
						}
					}
					break;
				case 8:
					int fechaActual = 2023;
					ArrayList<Paciente> pacientesMasAntiguos = new ArrayList<Paciente>();
					int edadMasAntigua = 0;
					for (Paciente p : pacientes) {
						int edad = Integer.parseInt(p.getFechaNacimiento().substring(6));
						if (pacientesMasAntiguos.size() == 0 || fechaActual - edad > edadMasAntigua) {
							pacientesMasAntiguos.clear();
							pacientesMasAntiguos.add(p);
							edadMasAntigua = fechaActual - edad;
						} else if (fechaActual - edad == edadMasAntigua)
							pacientesMasAntiguos.add(p);
					}
					for (Paciente p : pacientesMasAntiguos){
						System.out.println(p.getNombre() + " " + p.getApellidos());
						System.out.println("----------------");
					}
					break;
				case 9:
					for (Paciente p : pacientes) {
						if (p.getCodigoPostal().equals("28015")){
							System.out.println(p.getNombre() + " " + p.getApellidos());
							System.out.println("----------------");
						}
					}
					break;
			}
		} while (opt < 1 || opt > 5);

		sc.close();
		sn.close();
	}
}
