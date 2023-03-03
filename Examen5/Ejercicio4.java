import java.util.ArrayList;

public class Ejercicio4 {
	public static void main(String[] args) {
		System.out.println(equipoMasPuntos());
	}

	public static String equipoMasPuntos() {
		BDController connexion = new BDController();
		ArrayList<Equipo> equipos = connexion.dameEquipos();
		String nombreMax = "";
		int puntosMax = 0;
		for (Equipo e : equipos) {
			if (connexion.puntosEquipo(e) > puntosMax) {
				puntosMax = connexion.puntosEquipo(e);
				nombreMax = e.getNombre();
			}
		}
		return nombreMax;
	}
}
