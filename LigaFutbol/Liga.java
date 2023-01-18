package LigaFutbol;

import java.util.ArrayList;

public class Liga {
	private String nombre;
	private String categoria;
	private ArrayList<Equipo> equipos;
	private ArrayList<Encuentro> partidos;

	public Liga() {
		super();
	}

	public Liga(String nombre, String categoria, ArrayList<Equipo> equipos, ArrayList<Encuentro> partidos) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.equipos = equipos;
		this.partidos = partidos;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the equipos
	 */
	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	/**
	 * @param equipos the equipos to set
	 */
	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	/**
	 * @return the partidos
	 */
	public ArrayList<Encuentro> getPartidos() {
		return partidos;
	}

	/**
	 * @param partidos the partidos to set
	 */
	public void setPartidos(ArrayList<Encuentro> partidos) {
		this.partidos = partidos;
	}

	@Override
	public String toString() {
		return "Liga [nombre=" + nombre + ", categoria=" + categoria + ", equipos=" + equipos + ", partidos=" + partidos
				+ "]";
	}

	/**
	 * Método 3
	 * 
	 * @param arbitro
	 * @return
	 */
	public int partidosArbitrados(Arbitro arbitro) {
		int partidosArbitrados = 0;
		for (Encuentro encuentro : partidos) {
			if (encuentro.getArbitro().equals(arbitro))
				partidosArbitrados++;
		}
		return partidosArbitrados;
	}

	/**
	 * Método 7
	 * 
	 * @param nombreEquipo
	 * @return goles que ha metido el equipo
	 */
	public int golesHaMetido(String nombreEquipo) {
		int goles = 0;
		for (Equipo e : this.equipos) {
			if (e.getNombre().equals(nombreEquipo)) {
				for (Encuentro en : this.partidos) {
					if (en.getEquipo_local().equals(nombreEquipo))
						goles += en.getGoles_eq_local();
					else if (en.getEquipo_visit().equals(nombreEquipo))
						goles += en.getGoles_eq_visit();
				}
			}
		}
		return goles;
	}

	/**
	 * Método 8
	 * 
	 * @param nombreEquipo
	 * @return goles que le han metido al equipo
	 */
	public int golesLeHanMetido(String nombreEquipo) {
		int goles = 0;
		for (Equipo e : this.equipos) {
			if (e.getNombre().equals(nombreEquipo)) {
				for (Encuentro en : this.partidos) {
					if (en.getEquipo_local().equals(nombreEquipo))
						goles += en.getGoles_eq_visit();
					else if (en.getEquipo_visit().equals(nombreEquipo))
						goles += en.getGoles_eq_local();
				}
			}
		}
		return goles;
	}

	/**
	 * Método 9
	 * 
	 * @return el equipo que ha marcado más goles
	 */
	public ArrayList<Jugador> jugadorMenosMinutos() {
		ArrayList<Jugador> jugadoresMenosMinutos = new ArrayList<Jugador>();
		for (Equipo e : equipos) {
			for (Jugador j : e.getJugadores()) {
				if (jugadoresMenosMinutos.isEmpty()) {
					jugadoresMenosMinutos.add(j);
				} else if (j.getDatos().getMinutos_jugados() < jugadoresMenosMinutos.get(0).getDatos()
						.getMinutos_jugados()) {
					jugadoresMenosMinutos.clear();
					jugadoresMenosMinutos.add(j);
				} else if (j.getDatos().getMinutos_jugados() == jugadoresMenosMinutos.get(0).getDatos()
						.getMinutos_jugados()) {
					jugadoresMenosMinutos.add(j);
				}
			}
		}
		return jugadoresMenosMinutos;
	}

}
