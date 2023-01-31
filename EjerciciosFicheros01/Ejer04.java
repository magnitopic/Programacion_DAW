package EjerciciosFicheros01;

import java.io.File;
import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el nombre del directorio: ");
		String nombre = sc.nextLine();
		File file = new File(nombre);
		if (file.exists())
			System.out.println("El directorio existe");
		else {
			System.out.println("El directorio no existe. Así que será creado");
			file.mkdir();
			System.out.println("El directorio ha sido creado");
		}
		sc.close();
	}
}
