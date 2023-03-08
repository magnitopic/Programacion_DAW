package EjerciciosHerencia01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) {
		File file = new File("EjercicioHerencia/transportes.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			while (line != null) {
				String[] arguments = line.split("::");
				if (arguments[0].equalsIgnoreCase("camion"))
					System.out.println(new Camion(arguments[1], arguments[2], arguments[3], arguments[4], arguments[5]).toString());
				else if (arguments[0].equalsIgnoreCase("coche"))
					System.out.println(new Coche(arguments[1], arguments[2], arguments[3], arguments[4], arguments[5]).toString());
				else if (arguments[0].equalsIgnoreCase("moto"))
					System.out.println(new Moto(arguments[1], arguments[2], arguments[3], arguments[4], arguments[5]).toString());
				else if (arguments[0].equalsIgnoreCase("bus"))
					System.out.println(new Bus(arguments[1], arguments[2], arguments[3], arguments[4], arguments[5]).toString());
				line = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("Error al leer archivo: " + e);
		}

	}
}
