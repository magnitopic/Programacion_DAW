package EjerciciosHerencia02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Personal> empleados = new ArrayList<Personal>();
		File file = new File("EjercicioHerencia02/empleadosHospita.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				String[] arguments = line.split("::");
				if (arguments[0].equalsIgnoreCase("enfermera"))
					empleados.add(new Enfermera(arguments[1], arguments[2], arguments[3], arguments[5]));
				else if (arguments[0].equalsIgnoreCase("medico"))
					empleados.add(new Medico(arguments[1], arguments[2], arguments[4], arguments[5], arguments[6],
							arguments[7]));
				else if (arguments[0].equalsIgnoreCase("celador"))
					empleados.add(new Celador(arguments[1], arguments[2], arguments[3], arguments[5], arguments[8]));
				else if (arguments[0].equalsIgnoreCase("administrativo"))
					empleados.add(
							new Administrativo(arguments[1], arguments[2], arguments[3], arguments[4], arguments[5]));
				line = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error al leer archivo: " + e);
		}
	}
}
