import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio2 {
	public static void main(String[] args) {
		conferenciasToFiles();
	}

	public static void conferenciasToFiles() {
		BDController connexion = new BDController();
		ArrayList<Equipo> equipos = connexion.dameEquipos();
		File eastFile = new File("east.txt");
		File westFile = new File("west.txt");

		try {
			BufferedWriter eastWriter = new BufferedWriter(new FileWriter(eastFile));
			BufferedWriter westWriter = new BufferedWriter(new FileWriter(westFile));
			for (Equipo e : equipos) {
				if (e.getConferencia().equalsIgnoreCase("west"))
					westWriter.write(e.getData());
				else if (e.getConferencia().equalsIgnoreCase("east"))
					eastWriter.write(e.getData());
			}
			eastWriter.close();
			westWriter.close();
		} catch (IOException e) {
			System.out.println("Error al escribir al archivo: " + e);
		}
	}

}
