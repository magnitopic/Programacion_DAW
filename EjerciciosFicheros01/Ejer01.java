package EjerciciosFicheros01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el nombre del fichero: ");
		String nombre = sc.nextLine();
		File file = new File(nombre);
		if (file.exists())
			System.out.println("El fichero existe");
		else {
			System.out.println("El fichero no existe. Así que será creado");
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("Error al crear el fichero");
			}
			System.out.println("El fichero ha sido creado");
		}
		sc.close();
	}
}
