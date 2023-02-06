package EjerciciosFicheros07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
	public static ArrayList<Docente> getDocentesFromFile() {
		ArrayList<Docente> Docentes = new ArrayList<Docente>();
		File file = new File("./EjerciciosFicheros07/profesores.txt");
		String st;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
				String[] data = st.split("\\|");
				Docentes.add(new Docente(
						data[0],
						data[1],
						data[2],
						data[4],
						data[6]));
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error al leer el fichero");
		}
		return Docentes;
	}

	public static void main(String[] args) {
		ArrayList<Docente> docentes = getDocentesFromFile();
		for (int i = 0; i < docentes.size(); i++) {
			System.out.println("Docente " + i + ":");
			docentes.get(i).printData();
		}
	}
}
