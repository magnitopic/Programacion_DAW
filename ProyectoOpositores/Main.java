package ProyectoOpositores;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BDController conexionBD = new BDController();
		ArrayList<Opositor> opositores = conexionBD.dameOpositores();
		for (Opositor o : opositores) {
			o.mostrarDatos();
		}
		
		conexionBD.dnisOpositoresArchivo();
		
		conexionBD.insertarOpositor(new Opositor("Juan", "12345678A", "666666666", "Madrid"));

		
	}
}
