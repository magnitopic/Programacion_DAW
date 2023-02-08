package EjerciciosFicheros08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> data = getCarData();
		System.out.println(data);
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
				}
				break;
			case 2:
				newFiles(data);
				break;
			case 3:
				System.out.println("Bye");
				break;
		}
		sc.close();
	}

	public static void newFiles(ArrayList<String> data) {
		try {
			for (String d : data) {
				String[] dataValues = d.split(";");
				File fichero = new File("./EjerciciosFicheros08/" + dataValues[1] + ".txt");
				if (!fichero.exists())
					fichero.createNewFile();
				BufferedWriter br = new BufferedWriter(new FileWriter(fichero, true));
				br.write(d+"\n");
				br.close();
			}
		} catch (IOException e) {
			System.out.println("Error al crear el fichero");
		} finally {
			System.out.println("Ficheros para cada marca creados.");
		}
	}

	public static ArrayList<String> getCarData() {
		File fichero = new File("EjerciciosFicheros08/MarcaCoche.txt");
		ArrayList<String> coches = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			String str;
			while ((str = br.readLine()) != null) {
				coches.add(str);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error al leer el fichero");
		}
		if (coches.size() == 0)
			coches.add(null);
		return coches;
	}
}
