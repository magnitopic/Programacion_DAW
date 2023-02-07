package EjerciciosFicheros08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> data = getCarData();
		if (data.get(0) == null) {
			System.out.println("No hay datos");
			return;
		}
		Scanner sc = new Scanner(System.in);
		int opt;
		System.out.println("1.\tMostrar datos de todos los coches.");
		System.out.println("2.\tGenerar archivos de marcas.");
		System.out.println("3.\tSalir.");
		System.out.print("--> ");
		opt = sc.nextInt();
		switch (opt) {
			case 1:
				for (int i = 0; i < data.size(); i++) {
					String[] dataValues = data.get(i).split(";");
					System.out.println("id: " + dataValues[0]);
					System.out.println("Marca: " + dataValues[1]);
					System.out.println("Modelo: " + dataValues[2]);
					System.out.println("Color: " + dataValues[3]);
					System.out.println("Precio: " + dataValues[4]);
					System.out.println("Extras: " + dataValues[5]);
				}
				break;
			case 2:
				newFiles(data);
				break;
		}
		sc.close();
	}

	public static void newFiles(ArrayList<String> data) {
		ArrayList<String> marcas = new ArrayList<String>();
		for (String d : data) {
			String[] dataValues = d.split(";");
			File fichero = new File("EjerciciosFicheros08\\" + dataValues[1] + ".txt");
			try {
				if (!fichero.exists()) {
					fichero.createNewFile();

				}
			} catch (IOException e) {
				System.out.println("Error al crear el fichero");
			}
		}
	}

	public static ArrayList<String> getCarData() {
		File fichero = new File("EjerciciosFicheros08\\MarcaCoche.txt");
		ArrayList<String> coches = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			String str;
			do {
				str = br.readLine();
				coches.add(str);
			} while (str != null);
			br.close();
		} catch (Exception e) {
			System.out.println("Error al leer el fichero");
		}
		return coches;
	}
}
