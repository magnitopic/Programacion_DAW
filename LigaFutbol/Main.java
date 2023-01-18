package LigaFutbol;

import java.util.ArrayList;

public class Main {

	/**
	 * Método 4
	 * 
	 * @param ligas
	 * @param demarcacion
	 * @return
	 */
	public static ArrayList<Jugador> jugadoresDemarcacion(ArrayList<Liga> ligas, String demarcacion) {
		ArrayList<Jugador> jugadoresDemarcacion = new ArrayList<Jugador>();
		for (Liga l : ligas) {
			for (Equipo e : l.getEquipos()) {
				for (Jugador j : e.getJugadores()) {
					if (j.getPosicion().equalsIgnoreCase(demarcacion)) {
						jugadoresDemarcacion.add(j);
					}
				}
			}
		}
		return jugadoresDemarcacion;
	}

	/**
	 * Método 5
	 * 
	 * @param ligas
	 * @param arbitro
	 * @return
	 */
	public static int partidosArbitradosLiga(ArrayList<Liga> ligas, Arbitro arbitro) {
		int counter = 0;
		for (Liga l : ligas) {
			for (Encuentro e : l.getPartidos()) {
				if (e.getArbitro().equals(arbitro))
					counter++;
			}
		}
		return counter;
	}

	public static String nombreCompletoJugadoresTitularidades(ArrayList<Club> clubs) {
		String nombreCompleto = "";
		int maxTitularidades = 0;
		for (Club c : clubs) {
			for (Equipo e : c.getEquipos()) {
				for (Jugador j : e.getJugadores()) {
					if (j.getDatos().getTitularidades() > maxTitularidades) {
						maxTitularidades = j.getDatos().getTitularidades();
						nombreCompleto = j.getNombre() + " " + j.getApellidos() + "\n";
					} else if (j.getDatos().getTitularidades() == maxTitularidades)
						nombreCompleto += j.getNombre() + " " + j.getApellidos() + "\n";
				}
			}
		}
		return nombreCompleto;
	}
}
