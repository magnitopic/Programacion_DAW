import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BDController conexion = new BDController();
		Scanner ni = new Scanner(System.in);
		int opt;
		do {
			printMenu();
			opt = ni.nextInt();
			switch (opt) {
			case 1:
				for (Disco d : discosCancion(conexion))
					System.out.println(d.getNombre());
				break;
			case 2:
				archivoCompania(conexion);
				break;
			case 3:
				System.out.println(artistaMasGrupos(conexion));
				break;
			case 4:
				System.out.println("Missing");
				break;
			case 5:
				listadoDatos(conexion);
				break;
			case 6:
				System.out.println("Adiós!");
			}
		} while (opt != 6);
		ni.close();
	}

	public static void printMenu() {
		System.out.println("==================================================");
		System.out.println("1.\tDiscos con una canción especifica");
		System.out.println("2.\tArchivo con datos de las compañias");
		System.out.println("3.\tArtista que toca en más grupos y sus nombres");
		System.out.println("4.\tLos 4 discos con más canciones");
		System.out.println("5.\tListado con la información de cada compañia");
		System.out.println("6.\tSalir");
		System.out.print("--> ");
	}

	public static ArrayList<Disco> discosCancion(BDController conexion) {
		Scanner ns = new Scanner(System.in);
		ArrayList<Disco> discos = new ArrayList<Disco>();
		System.out.print("Titulo de la canción: ");
		String titulo = ns.nextLine();
		if (!conexion.cancionExists(titulo))
			System.out.println("Esa canción no existe");
		else
			discos = conexion.getDiscosWhereSong(titulo);
		return discos;
	}

	public static void archivoCompania(BDController conexion) {
		String datos = conexion.getCompaniaData();
		File file = new File("companias.txt");
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter(file));
			br.write(datos);
			System.out.println("Archivo creado!");
			br.close();
		} catch (IOException e) {
			System.out.println("Error al escribir al archivo: " + e);
		}
	}

	private static String artistaMasGrupos(BDController conexion) {
		return conexion.artistaMaxGrupos();
	}
	
	private static void listadoDatos(BDController conexion) {
		ArrayList<Listado> listadoDatos = conexion.getListado();
		ArrayList<String> companias = new ArrayList<String>();
		for (Listado l: listadoDatos){
			if (!companias.contains(l.getNombreCompanyia()))
				companias.add(l.getNombreCompanyia());
		}
		for (String c : companias) {
			System.out.println(c+":");
			for (Listado l: listadoDatos){
				if (l.getNombreCompanyia().equalsIgnoreCase(c))
					System.out.println(l.getNombreDisco()+" - "+l.getNombreGrupo());
			}
			System.out.print("\n");
		}
	}
}
