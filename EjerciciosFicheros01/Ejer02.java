package EjerciciosFicheros01;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce el nombre del fichero: ");
			lista.add(sc.nextLine());
		}
		try {
			for (String l : lista) {
				File file = new File(l);
				if (file.exists())
					System.out.println("El fichero existe");
				else {
					System.out.println("El fichero no existe. Así que será creado");
					file.createNewFile();
					System.out.println("El fichero ha sido creado");
				}
			}
		} catch (Exception e) {
			System.out.println("Error al crear el fichero");
		}
		sc.close();
	}
}
