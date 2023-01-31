package EjerciciosFicheros01;

import java.io.File;

public class Ejer03 {
	public static void main(String[] args) {
		File file = new File(".");
		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f.getName());
		}
	}
}
