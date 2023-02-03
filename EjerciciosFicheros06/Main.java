package EjerciciosFicheros06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
	public static ArrayList<Empleado> getEmpleadosFromFile() {
		ArrayList<Empleado> Empleados = new ArrayList<Empleado>();
		File file = new File("./EjerciciosFicheros04/Empleados.txt");
		String st;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((st = br.readLine()) != null) {
				String[] data = st.split(";");
				Empleados.add(
					new Empleado(
						data[0],
						data[1],
						data[2],
						data[3],
						data[4],
						data[5],
						data[6],
						data[7],
						data[8],
						data[9],
						data[10],
						data[11],
						data[12],
						data[13],
						data[14],
						data[15],
						data[16],
						data[17],
						data[18],
						data[19],
						data[20],
						data[21],
						data[22],
						data[23],
						data[24],
						data[25],
						data[26],
						data[27],
						data[28],
						data[29],
						data[30],
						data[31],
						data[32],
						data[33])
				);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Error al leer el fichero");
		}
		return Empleados;
	}
	public static void main(String[] args) {
		getEmpleadosFromFile();
		Empleado emp = new Empleado();

		emp.
	}
}
