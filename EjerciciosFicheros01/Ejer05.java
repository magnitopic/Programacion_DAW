package EjerciciosFicheros01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Creando archivo listadoGS.txt");
		File file = new File("listadoGS.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Error al crear archivo");
		}
		System.out.print("Introduce el nuevo nombre del fichero: ");
		String nombre = sc.nextLine();
		file.renameTo(file = new File(nombre));
		sc.close();
	}
}
