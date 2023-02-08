package EjerciciosFicheros09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static ArrayList<String> getAnimales() {
		ArrayList<String> animales = new ArrayList<String>();
		try {
			File file = new File("./EjerciciosFicheros09/zoo.txt");
			if (!file.exists())
				file.createNewFile();
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str;
			while ((str = br.readLine()) != null)
				animales.add(str);
			br.close();
		} catch (Exception e) {
			System.out.println("Error al leer el fichero");
		}
		return animales;
	}

	public static String altaAnimal() {
		Scanner sc = new Scanner(System.in);
		Scanner sr = new Scanner(System.in);
		String animal = "";
		System.out.println("Introduce el ID del animal");
		animal += sc.nextLine() + ";";
		System.out.println("Introduce la altura del animal");
		animal += sc.nextLine() + ";";
		System.out.println("Introduce el peso del animal");
		animal += sc.nextLine() + ";";
		System.out.println("Introduce la edad del animal");
		animal += sc.nextLine() + ";";
		System.out.println("Introduce el nombre del animal");
		animal += sc.nextLine() + ";";
		while (true) {
			System.out.println("Introduce el tipo de animal (domestico/salvaje)");
			String tipo = sc.nextLine();
			if (tipo.equals("domestico") || tipo.equals("salvaje")) {
				animal += tipo + ";";
				if (tipo.equals("domestico")) {
					System.out.println("Introduce el nombre del dueño del animal");
					animal += sc.nextLine() + ";";
					animal += "0;";
				} else {
					animal += "null;";
					System.out.println("Introduce la fuerza del animal");
					animal += sc.nextLine() + ";";
				}
				break;
			}
		}
		System.out.println("Introduce la especie del animal");
		animal += sc.nextLine() + ";";
		System.out.println("Especifica si el animal es mimoso o no (true/false)");
		animal += sr.nextBoolean() + ";";
		System.out.println("Introduce el sonido que emite el animal");
		animal += sc.nextLine() + ";";
		sc.close();
		sr.close();
		return animal;
	}

	public static ArrayList<String> modifyAnimal(ArrayList<String> animales) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el ID del animal a modificar");
		String id = sc.nextLine();
		for (int i = 0; i < animales.size(); i++) {
			if (animales.get(i).split(";")[0].equals(id)) {
				System.out.println("Introduce el dato a modificar");
				System.out.println("1.\tAltura");
				System.out.println("2.\tPeso");
				System.out.println("3.\tEdad");
				System.out.println("4.\tNombre");
				System.out.println("5.\tTipo");
				System.out.println("6.\tSonido");
				System.out.println("7.\tDueño");
				System.out.print("--> ");
				int dato = sc.nextInt();
				switch (dato) {
					case 1:
						System.out.println("Introduce la nueva altura");
						animales.get(i).split(";")[1] = sc.nextLine();
						break;
					case 2:
						System.out.println("Introduce el nuevo peso");
						animales.get(i).split(";")[2] = sc.nextLine();
						break;
					case 3:
						System.out.println("Introduce la nueva edad");
						animales.get(i).split(";")[3] = sc.nextLine();
						break;
					case 4:
						System.out.println("Introduce el nuevo nombre");
						animales.get(i).split(";")[4] = sc.nextLine();
						break;
					case 5:
						System.out.println("Introduce el nuevo tipo");
						animales.get(i).split(";")[5] = sc.nextLine();
						break;
					case 6:
						System.out.println("Introduce el nuevo sonido");
						animales.get(i).split(";")[6] = sc.nextLine();
						break;
					case 7:
						System.out.println("Introduce el nuevo dueño");
						animales.get(i).split(";")[7] = sc.nextLine();
						break;
					default:
						break;
				}
				break;
			}
		}
		sc.close();
		return animales;
	}

	public static void updateFile(ArrayList<String> animales) {
		try {
			File file = new File("./EjerciciosFicheros09/zoo.txt");
			file.createNewFile();
			BufferedWriter br = new BufferedWriter(new FileWriter(file, true));
			for (String s : animales)
				br.write(s);
			br.close();
		} catch (Exception e) {
			System.out.println("Error al leer el fichero");
		}
	}

	public static void main(String[] args) {
		ArrayList<String> animales = getAnimales();
		Scanner sn = new Scanner(System.in);
		Scanner sv = new Scanner(System.in);

		int opt;
		while (true) {
			System.out.println("1.\tAlta animal");
			System.out.println("2.\tBaja animal");
			System.out.println("3.\tModificación de dato de animal");
			System.out.println("4.\tListado de animales domésticos por edad");
			System.out.println("5.\tListado de animales salvajes y domésticos por peso");
			System.out.println("6.\tSalir");
			System.out.print("--> ");
			opt = sn.nextInt();
			switch (opt) {
				case 1:
					animales.add(altaAnimal());
					updateFile(animales);
					break;
				case 2:
					System.out.println("Introduce el ID del animal a eliminar");
					String id = sv.nextLine();
					for (int i = 0; i < animales.size(); i++) {
						if (animales.get(i).split(";")[0].equals(id)) {
							animales.remove(i);
							break;
						}
					}
					updateFile(animales);
					break;
				case 3:
					animales = modifyAnimal(animales);
					updateFile(animales);
					break;
				case 4:
					for (int i = 0; i < animales.size(); i++) {
						if (animales.get(i).split(";")[5].equals("domestico")) {
							System.out.println(animales.get(i));
						}
					}
					break;
				case 5:
					for (int i = 0; i < animales.size(); i++) {
						if (animales.get(i).split(";")[5].equals("salvaje")) {
							System.out.println(animales.get(i));
						}
					}
					break;
				case 6:
					sn.close();
					sv.close();
					return;
			}
		}
	}
}
