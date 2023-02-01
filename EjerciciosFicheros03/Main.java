package EjerciciosFicheros03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nombres = new ArrayList<String>();
		String ruta = "nombres.txt";
		File fichero = new File(ruta);
		
		//Hago esto para crear fisicamente el fichero si no existe.
		if (!fichero.exists()) {
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Leemos el fichero y lo volcamos en un arraylist de nombres
		
		String linea = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			try {
				linea = br.readLine();
				while(linea!=null) {
					nombres.add(linea);
					linea = br.readLine();
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Podría gestionar el arraylist de nombres, añadir, eliminar, modificar etc....
		
		//Crear un menú de opciones con las siguientes opciones, recurrentes
		//Switch con bucle.
		
		/*
		1. Añadir un nombre.
		2. Eliminar un nombre. (Se solicitará al usuario la posción a eliminar)
		3. Modificar un nombre por otro. Solicita al usuario una posicion y un nombre y sustituye el nombre que hay en esa posición por el nuevo.
		4. Salir. (El programa terminará.) Al terminar el programa deberás guardar los cambios en el archivo.
		
		*/

		int opt = 0;
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("1. Añadir un nombre.");
		System.out.println("2. Eliminar un nombre.");
		System.out.println("3. Modificar un nombre por otro.");
		System.out.println("4. Salir.");
		System.out.print("--> ");
		opt = sc.nextInt();
		int pos;
		String nombre;

		switch (opt) {
			case 1:
				System.out.print("Introduce el nombre a añadir: ");
				nombre = sn.nextLine();
				nombres.add(nombre);
				break;
			case 2:
				System.out.print("Introduce la posición del nombre a eliminar: ");
				pos = sc.nextInt();
				nombres.remove(pos);
				break;
			case 3:
			System.out.print("Introduce la posición del nombre a modificar: ");
			pos = sc.nextInt();
			System.out.println("Introduce el nuevo valor del nombre: ");
			nombre = sn.nextLine();

			nombres.set(pos, nombre);
			break;
			default:
				System.out.println("Saliendo del programa");
				break;
		}
		sc.close();
		sn.close();
		
		//Ahora volcamos el contenido del arraylist en el archivo de texto para que 
		//asl volver al ejecutar el programa los datos de nombres estén actualizados.
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, false));
			for (String n: nombres) {
				bw.write(n);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}