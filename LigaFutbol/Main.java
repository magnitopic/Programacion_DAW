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

	/**
	 * Método 6
	 * 
	 * @param clubs
	 * @return
	 */
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

	/**
	 * Ejer3 - Método 4
	 */
	public static Pais paisConEquipoMasGoleado(ArrayList<Pais> paises) {
		Pais pais = null;
		int maxGoles = 0;
		for (Pais p : paises) {
			for (Liga l : p.getLigas()) {
				for (Equipo e : l.getEquipos()) {
					if (l.golesLeHanMetido(e.getNombre()) > maxGoles) {
						maxGoles = l.golesHaMetido(e.getNombre());
						pais = p;
					}
				}
			}
		}
		return pais;
	}

	/**
	 * Ejer4 - Método 3
	 * 
	 * @param ligas
	 */
	public static void jugadoresEquipos4Rojas(ArrayList<Liga> ligas) {
		for (Liga l : ligas) {
			for (Equipo e : l.getEquipos()) {
				for (Jugador j : e.getJugadores()) {
					if (j.getDatos().getTarjetas_r() == 4) {
						System.out.println("Goles: " + j.getDatos().getGoles() + " Asistencias"
								+ j.getDatos().getAsistencias() + " Tarjetas Amarillas: " + j.getDatos().getTarjetas_a()
								+ " Tarjetas Rojas: " + j.getDatos().getTarjetas_r() + " Partidos Jugados: "
								+ j.getDatos().getPartidos_j() + " Titularidades: " + j.getDatos().getTitularidades()
								+ " Minutos jugados: " + j.getDatos().getMinutos_jugados());
					}
				}
			}
		}
	}

	/**
	 * Ejer4 - Método 4
	 * Muestra los paises que tienen equipos con más de 20 jugadores
	 * 
	 * @param paises
	 */
	public static void equiposMas20Jugadores(ArrayList<Pais> paises) {
		ArrayList<Pais> paisesMas20Jugadores = new ArrayList<Pais>();
		for (Pais p : paises) {
			for (Liga l : p.getLigas()) {
				for (Equipo e : l.getEquipos()) {
					if (e.getJugadores().size() > 20 && !paisesMas20Jugadores.contains(p)) {
						System.out.println(p.getNombre());
						paisesMas20Jugadores.add(p);
					}
				}
			}
		}
	}

	/**
	 * Ejer4 - Método 5
	 * 
	 * @param ligas
	 * @return
	 */
	public static ArrayList<String> nombresEquipos5GolesPartido(ArrayList<Liga> ligas) {
		ArrayList<String> nombresEquipos = new ArrayList<String>();
		for (Liga l : ligas) {
			for (Equipo e : l.getEquipos()) {
				if ((l.golesHaMetido(e.getNombre()) + l.golesLeHanMetido(e.getNombre())) > 5 &&
						!nombresEquipos.contains(e.getNombre())) {
					nombresEquipos.add(e.getNombre());
				}
			}
		}
		return nombresEquipos;
	}

	/**
	 * Ejer4 - Método 6
	 * 
	 * @param ligas
	 * @return
	 */
	public static String nombreJugadorMediaPartidosEmpatados(ArrayList<Liga> ligas) {
		String nombreJugador = "";
		double mediaMinutos = 0;
		for (Liga l : ligas) {
			for (Equipo e : l.getEquipos()) {
				for (Jugador j : e.getJugadores()) {
					if (j.getDatos().getPartidos_j() > mediaMinutos) {
						mediaMinutos = j.getDatos().getPartidos_j();
						nombreJugador = j.getNombre() + " " + j.getApellidos();
					}
				}
			}
		}
		return nombreJugador;
	}

	/**
	 * Ejer5 - Método 4
	 */
	public static void jugadorMasGoleadorLiga(ArrayList<Liga> ligas) {
		Jugador pichichi = null;
		for (Liga l : ligas) {
			for (Equipo e : l.getEquipos()) {
				for (Jugador j : e.getJugadores()) {
					if (pichichi == null || j.getDatos().getGoles() > pichichi.getDatos().getGoles())
						pichichi = j;
				}
			}
		}
	}

	/**
	 * Ejer6 - Método 5
	 * 
	 * @param ligas
	 * @return nombre del equipo más goleado
	 */
	public static String equipoMasGoleado(ArrayList<Liga> ligas) {
		String equipo = "";
		int maxGoles = 0;
		for (Liga l : ligas) {
			for (Equipo e : l.getEquipos()) {
				if (l.golesLeHanMetido(e.getNombre()) > maxGoles) {
					maxGoles = l.golesHaMetido(e.getNombre());
					equipo = e.getNombre();
				}
			}
		}
		return equipo;
	}

	/**
	 * Ejer6 - Método 6
	 * 
	 * @param ligas
	 * @return nombre del equipo más goleador
	 */
	public static String equipoMasGoleador(ArrayList<Liga> ligas) {
		String equipo = "";
		int maxGoles = 0;
		for (Liga l : ligas) {
			for (Equipo e : l.getEquipos()) {
				if (l.golesHaMetido(e.getNombre()) > maxGoles) {
					maxGoles = l.golesHaMetido(e.getNombre());
					equipo = e.getNombre();
				}
			}
		}
		return equipo;
	}

	/**
	 * Ejer8 - Método 3
	 * 
	 * @param equipo
	 * @param ligas
	 * @return
	 */
	public static int arbitrosAunEquipo(Equipo equipo, ArrayList<Liga> ligas) {
		ArrayList<Arbitro> arbitros = new ArrayList<Arbitro>();
		for (Liga l : ligas) {
			for (Encuentro e : l.getPartidos()) {
				if (e.getEquipo_local().equals(equipo) || e.getEquipo_visit().equals(equipo)) {
					if (!arbitros.contains(e.getArbitro()))
						arbitros.add(e.getArbitro());
				}
			}
		}
		return arbitros.size();
	}

	/**
	 * Ejer8 - Método 5
	 * 
	 * @param ligas
	 * @return los equipos que han ganado más de 10 partidos con al menos 3 goles de
	 *         diferencia y el arbitro tuviera más de 50 años
	 */
	public static ArrayList<Equipo> equiposGanadosDiezPartidosMasDeTresGolesDif(ArrayList<Liga> ligas) {
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		ArrayList<Integer> goles = new ArrayList<Integer>();
		// Recogemos los equipos y el numero de goles que han metido
		for (Liga l : ligas) {
			for (Equipo e : l.getEquipos()) {
				for (Encuentro en : l.getPartidos()) {
					if (en.getEquipo_local().equals(e)) {
						if (en.getGoles_eq_local() - en.getGoles_eq_visit() > 3 && en.getArbitro().getEdad() > 50) {
							if (!equipos.contains(e)) {
								equipos.add(e);
								goles.add(1);
							} else {
								int index = equipos.indexOf(e);
								goles.set(index, goles.get(index) + 1);
							}
						}
					}
					if (en.getEquipo_visit().equals(e)) {
						if (en.getGoles_eq_visit() - en.getGoles_eq_local() > 3 && en.getArbitro().getEdad() > 50) {
							if (!equipos.contains(e)) {
								equipos.add(e);
								goles.add(1);
							} else {
								int index = equipos.indexOf(e);
								goles.set(index, goles.get(index) + 1);
							}
						}
					}
				}
			}
		}
		// Eliminamos los equipos que no han ganado más de 10 partidos
		for (Equipo e : equipos) {
			if (goles.get(equipos.indexOf(e)) < 10) {
				goles.remove(equipos.indexOf(e));
				equipos.remove(e);
			}
		}
		return equipos;
	}
}
