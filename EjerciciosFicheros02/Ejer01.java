package EjerciciosFicheros02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ejer01 {
	public static void main(String[] args) {
		File file = new File("./EjerciciosFicheros02/edades.txt");
		int counter = 0;
		int peopleTen = 0;
		String st;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
				if (Integer.parseInt(st) < 50)
					counter++;
				if (Integer.parseInt(st) == 10)
					peopleTen++;
			}

		} catch (Exception e) {
			System.out.println("Error al leer el fichero");
		}

		System.out.println(counter + " people are younger than 50.");
		System.out.println(peopleTen + " people are 10 years old.");
	}
}
