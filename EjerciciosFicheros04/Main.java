package EjerciciosFicheros04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<Pelicula> getPeliculasFromFile() {
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		File file = new File("./EjerciciosFicheros04/peliculas.txt");
		String st;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
				String[] data = st.split(" \\|\\| ");
				peliculas.add(new Pelicula(
						Integer.parseInt(data[0]),
						data[1],
						Integer.parseInt(data[2]),
						data[3],
						Integer.parseInt(data[4])));
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error al leer el fichero");
		}
		return peliculas;
	}

	public static void updateData(ArrayList<Pelicula> peliculas) {
		try {
			FileWriter br = new FileWriter("filename.txt");
			for (Pelicula p : peliculas) {
				br.write(p.getId() + " || " + p.getTitulo() + " || " + p.getyear() +
						" || " + p.getActor() + " || " + p.getPresupuesto());
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error al leer el fichero");
		}
	}

	public static ArrayList<Pelicula> darAlta(ArrayList<Pelicula> peliculas) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		// recoger datos y añadir al array
		System.out.print("Introduce el título de la película: ");
		String titulo = sn.nextLine();
		System.out.print("Introduce el año de la película: ");
		int year = sc.nextInt();
		System.out.print("Introduce el director de la película: ");
		String director = sn.nextLine();
		System.out.print("Introduce la duración de la película: ");
		int duracion = sc.nextInt();
		peliculas.add(new Pelicula(peliculas.size() + 1, titulo, year, director, duracion));

		sc.close();
		sn.close();
		updateData(peliculas);
		return peliculas;
	}

	public static ArrayList<Pelicula> darBaja(ArrayList<Pelicula> peliculas) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el Id de la película a eliminar: ");
		int id = sc.nextInt();
		for (Pelicula p : peliculas) {
			if (p.getId() == id) {
				peliculas.remove(p);
				break;
			}
		}
		sc.close();
		updateData(peliculas);
		return peliculas;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		ArrayList<Pelicula> peliculas = getPeliculasFromFile();
		int opt;
		do {
			System.out.println("1.\tDar de alta una nueva película.");
			System.out.println("2.\tDar de baja una película.");
			System.out.println("3.\tConsulta de todas las películas.");
			System.out.println("4.\tConsulta de película por Id.");
			System.out.println("5.\tSalir.");
			System.out.print("--> ");
			opt = sc.nextInt();
			int id;
			switch (opt) {
				case 1:
					peliculas = darAlta(peliculas);
					break;
				case 2:
					darBaja(peliculas);
					break;
				case 3:
					for (Pelicula p : peliculas)
						p.showData();
					break;
				case 4:
					System.out.print("Introduce el Id de la película a consultar: ");
					id = sc.nextInt();
					for (Pelicula p : peliculas) {
						if (p.getId() == id) {
							p.showData();
							break;
						}
					}
					break;
			}
		} while (opt < 1 || opt > 5);

		sc.close();
		sn.close();
	}
}
