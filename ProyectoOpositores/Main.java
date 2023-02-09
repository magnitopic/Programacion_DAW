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
	}
}
