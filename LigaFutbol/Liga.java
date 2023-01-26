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
	 * @return partidos que ha arbitrado el arbitro pasado por parámetro
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
	 * @return
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

	/**
	 * Imprime en tabla la clasificación de la liga
	 */
	public void printLigaClasificacion() {
		ArrayList<Clasificacion> clasificaciones = new ArrayList<Clasificacion>();
		for (Equipo e : equipos)
			clasificaciones.add(new Clasificacion(e, this.partidos));

		for (int i = 0; i < clasificaciones.size(); i++) {
			for (int j = 0; j < clasificaciones.size() - 1; j++) {
				Clasificacion equipoActual = clasificaciones.get(j), equipoSiguiente = clasificaciones.get(j + 1);
				if (equipoActual.getPuntos() < equipoSiguiente.getPuntos()) {
					clasificaciones.set(j, equipoSiguiente);
					clasificaciones.set(j + 1, equipoActual);
				}
			}
		}

		System.out.println("Clasificación de la liga " + this.nombre + "\n");
		System.out.println("Pos | Equipo | PJ | PG | PE | PP | GF | GC | Puntos");
		for (int i = 0; i < clasificaciones.size(); i++) {
			Clasificacion valorActual = clasificaciones.get(i);
			System.out.println(i + "|" + valorActual.getNombre() + " | " + valorActual.getPJugados() + " | "
					+ valorActual.getPGanados() + " | " + valorActual.getPEmpatados() + " | "
					+ valorActual.getPPerdidos() + " | " + valorActual.getGFavor() + " | " + valorActual.getGContra()
					+ " | " + valorActual.getPuntos());
		}
	}

	/**
	 * Ejer3 - Método 1
	 * Imprime el numero de goles de cada partido si los goles son mayores que el
	 * numero pasado
	 * 
	 * @param minGoles
	 */
	public void printGolesPartidos(int minGoles) {
		for (Encuentro e : this.partidos) {
			if (e.getGoles_eq_local() + e.getGoles_eq_visit() >= minGoles)
				System.out.println(e.getEquipo_local() + "\t" + e.getGoles_eq_local() + ":" +
						e.getGoles_eq_visit() + "\t" + e.getEquipo_visit());
		}
	}

	/**
	 * Ejer3 - Método 3
	 * 
	 * @return lista de los 10 primeros pichichis
	 */
	public ArrayList<String> listaPichichi() {
		ArrayList<Jugador> pichichis = new ArrayList<Jugador>();
		for (Equipo e : equipos) {
			for (Jugador j : e.getJugadores())
				pichichis.add(j);
		}
		for (int i = 0; i < pichichis.size(); i++) {
			for (int j = 0; j < pichichis.size() - 1; j++) {
				Jugador jugadorActual = pichichis.get(j), jugadorSiguiente = pichichis.get(j + 1);
				if (jugadorActual.getDatos().getGoles() < jugadorSiguiente.getDatos().getGoles()) {
					pichichis.set(j, jugadorSiguiente);
					pichichis.set(j + 1, jugadorActual);
				}
			}
		}
		ArrayList<String> listaPichichi = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			listaPichichi.add(pichichis.get(i).getNombre() + " " + pichichis.get(i).getApellidos() + " "
					+ pichichis.get(i).getDatos().getGoles() + "goles");
		}
		return listaPichichi;
	}

	/**
	 * Ejer5 - Método 1
	 * 
	 * @param dni
	 * @return numero de partidos perdidos por un jugador
	 */
	public int partidosPerdidosJugador(String dni) {
		for (Equipo e : equipos) {
			for (Jugador j : e.getJugadores()) {
				if (j.getDNI().equalsIgnoreCase(dni))
					return new Clasificacion(e, this.partidos).getPPerdidos();
			}
		}
		return -1;
	}

	/**
	 * Ejer5 - Método 2
	 * 
	 * @return numero de partidos en los que entre los dos equipos se han marcado 10
	 *         o más goles
	 */
	public int partidosMas10GolesEquipos() {
		int counter = 0;
		for (Equipo e : equipos) {
			for (Encuentro p : this.partidos) {
				if (p.getEquipo_local().getNombre().equalsIgnoreCase(e.getNombre())
						|| p.getEquipo_visit().getNombre().equalsIgnoreCase(e.getNombre())) {
					if (p.getGoles_eq_local() + p.getGoles_eq_visit() >= 10)
						counter++;
				}
			}
		}
		return counter;
	}

	/**
	 * Ejer5 - Método 3
	 * 
	 * @return nombre del equipo más goleador en partidos ganados de la liga
	 */
	public String EquipoMasGoleador() {
		Equipo goleador = null;
		for (Equipo e : this.equipos) {
			Clasificacion datos = new Clasificacion(e, this.partidos);
			if (goleador == null)
				goleador = e;
			else if (datos.getGFavor() > new Clasificacion(goleador, this.partidos).getGFavor())
				goleador = e;
		}
		return goleador.getNombre();
	}

	/**
	 * Ejer6 - Método 1
	 */
	public void mediaGolesEncuentro() {
		int goles = 0;
		for (Encuentro e : this.partidos) {
			goles += e.getGoles_eq_local() + e.getGoles_eq_visit();
		}
		System.out.println("Media de goles por encuentro: " + goles / this.partidos.size());
	}

	/**
	 * Ejer6 - Método 2
	 * 
	 * @return nombre del equipo con mayor media de goles de la liga
	 */
	public String equipoMasMediaGoles() {
		Equipo equipo = null;
		double media = 0;
		for (Equipo e : this.equipos) {
			int goles = 0;
			int partidos = 0;
			for (Encuentro en : this.partidos) {
				if (en.getEquipo_local().getNombre().equalsIgnoreCase(e.getNombre())) {
					goles += en.getGoles_eq_local();
					partidos++;
				}
				if (en.getEquipo_visit().getNombre().equalsIgnoreCase(e.getNombre())) {
					goles += en.getGoles_eq_visit();
					partidos++;
				}
			}
			if (equipo == null) {
				equipo = e;
				media = goles / partidos;
			} else if (goles / partidos > media) {
				media = goles / partidos;
				equipo = e;
			}
		}
		return equipo.getNombre();
	}

	/**
	 * Ejer6 - Método 3
	 * 
	 * @return el nombre del equipo más goleado de la liga
	 */
	public String equipoMasGoleado() {
		Equipo masGoleado = null;
		int golesLesHanMetido = 0;
		for (Equipo e : equipos) {
			if (masGoleado == null || golesLeHanMetido(e.getNombre()) > golesLesHanMetido) {
				masGoleado = e;
				golesLesHanMetido = golesLeHanMetido(e.getNombre());
			}
		}
		return masGoleado.getNombre();
	}

	/**
	 * Ejer6 - Método 4
	 * 
	 * @return el nombre del equipo más goleador de la liga
	 */
	public String equipoMasGoleador() {
		Equipo masGoleador = null;
		int golesHanMetido = 0;
		for (Equipo e : equipos) {
			if (masGoleador == null || golesHaMetido(e.getNombre()) > golesHanMetido) {
				masGoleador = e;
				golesHanMetido = golesHaMetido(e.getNombre());
			}
		}
		return masGoleador.getNombre();
	}

	/**
	 * Ejer6 - Método 7
	 * 
	 * @return
	 */
	public String juagadorMasLenero() {
		String jugador = null;
		int tarjetas = 0;
		for (Equipo e : this.equipos) {
			for (Jugador j : e.getJugadores()) {
				if (jugador == null || j.getDatos().getTarjetas_a() + j.getDatos().getTarjetas_r() > tarjetas) {
					jugador = j.getNombre();
					tarjetas = j.getDatos().getTarjetas_a() + j.getDatos().getTarjetas_r();
				}
			}
		}
		return jugador;
	}

	/**
	 * Ejer7 - Método 1
	 * 
	 * @return string con el nombre del jugador con más goles y el arbitro con más
	 *         partidos
	 */
	public String masJuagadorArbitro() {
		ArrayList<Arbitro> arbitros = new ArrayList<Arbitro>();
		ArrayList<Integer> partidos = new ArrayList<Integer>();
		String jugador = null;
		int nGoles = 0;
		// Jugador com más goles
		for (Equipo e : equipos) {
			for (Jugador j : e.getJugadores()) {
				if (jugador == null || j.getDatos().getGoles() > nGoles) {
					jugador = j.getNombre();
					nGoles = j.getDatos().getGoles();
				}
			}
		}
		// Lista de arbitros y lista de sus partidos
		for (Encuentro e : this.partidos) {
			if (!arbitros.contains(e.getArbitro())) {
				arbitros.add(e.getArbitro());
				partidos.add(1);
			} else {
				int index = arbitros.indexOf(e.getArbitro());
				partidos.set(index, partidos.get(index) + 1);
			}
		}
		// Escoger el arbitro con más partidos
		String arbitro = null;
		for (Arbitro ar : arbitros) {
			int index = arbitros.indexOf(ar);
			if (arbitro == null || partidos.get(index) > partidos.get(index)) {
				arbitro = ar.getNombre();
			}
		}
		// Retornar el string con el jugador y el arbitro
		return "Jugador más goleador: " + jugador + " Arbitro con más partidos: " + arbitro;
	}

	/**
	 * Ejer7 - Método 2
	 * 
	 * @return string de los dos jugadores y equipos más goleadores
	 */
	public String jugadoresYequiposMasGoleadores() {

		return "Jugador 1: " + listaPichichi().get(1) + " Jugador 2: " + listaPichichi().get(1) +
				"Equipo 1: " + partidosPichichi().get(1) + " Equipo 2: " + partidosPichichi().get(2);
	}

	// Auxiliar
	public ArrayList<String> partidosPichichi() {
		ArrayList<Clasificacion> pichichis = new ArrayList<Clasificacion>();
		for (Equipo e : equipos) {
			pichichis.add(new Clasificacion(e, this.partidos));
		}
		for (int i = 0; i < pichichis.size(); i++) {
			for (int j = 0; j < pichichis.size() - 1; j++) {
				Clasificacion equipoActual = pichichis.get(j), jugadorSiguiente = pichichis.get(j + 1);
				if (equipoActual.getGFavor() < jugadorSiguiente.getGFavor()) {
					pichichis.set(j, jugadorSiguiente);
					pichichis.set(j + 1, equipoActual);
				}
			}
		}
		ArrayList<String> listaPichichi = new ArrayList<String>();
		for (int i = 0; i < 10; i++)
			listaPichichi.add(pichichis.get(i).getEquipo().getNombre());
		return listaPichichi;
	}

	/**
	 * Ejer7 - Método 3
	 * 
	 * @return string del marcador más repetido
	 */
	public String marcadorMasRepetido() {
		ArrayList<String> marcadores = new ArrayList<String>();
		ArrayList<Integer> repeticiones = new ArrayList<Integer>();
		for (Encuentro e : this.partidos) {
			String marcadorPartido = e.getGoles_eq_local() + "-" + e.getGoles_eq_visit();
			if (!marcadores.contains(marcadorPartido)) {
				marcadores.add(marcadorPartido);
				repeticiones.add(1);
			} else {
				int index = marcadores.indexOf(marcadorPartido);
				repeticiones.set(index, repeticiones.get(index) + 1);
			}
		}
		String marcador = null;
		int marcadorPosition = -1;
		for (String m : marcadores) {
			int index = marcadores.indexOf(m);
			if (marcador == null || repeticiones.get(index) > repeticiones.get(marcadorPosition)) {
				marcador = m;
				marcadorPosition = index;
			}
		}
		return marcador;
	}

	/**
	 * Ejer7 - Método 4
	 * 
	 * @param arbitro
	 * @return
	 */
	public Equipo equipoMasArbitrado(Arbitro arbitro) {
		ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		ArrayList<Integer> repeticiones = new ArrayList<Integer>();
		for (Encuentro e : this.partidos) {
			if (e.getArbitro().getDNI().equalsIgnoreCase(arbitro.getDNI())) {
				if (!equipos.contains(e.getEquipo_local())) {
					equipos.add(e.getEquipo_local());
					repeticiones.add(1);
				} else {
					int index = equipos.indexOf(e.getEquipo_local());
					repeticiones.set(index, repeticiones.get(index) + 1);
				}
				if (!equipos.contains(e.getEquipo_visit())) {
					equipos.add(e.getEquipo_visit());
					repeticiones.add(1);
				} else {
					int index = equipos.indexOf(e.getEquipo_visit());
					repeticiones.set(index, repeticiones.get(index) + 1);
				}
			}
		}
		Equipo equipo = null;
		int equipoPosition = -1;
		for (Equipo eq : equipos) {
			int index = equipos.indexOf(eq);
			if (equipo == null || repeticiones.get(index) > repeticiones.get(equipoPosition)) {
				equipo = eq;
				equipoPosition = index;
			}
		}
		return equipo;
	}

	/**
	 * Ejer7 - Método 5
	 * 
	 * @return la fecha del partido con más goles del equipo menos goleado
	 */
	public String fechaPartidosEquipoMenosGoleado() {
		Equipo menosGoleado = equipoMenosGoleado();
		Encuentro partidos = null;
		int goles = 0;
		for (Encuentro e : this.partidos) {
			if (e.getEquipo_local().getNombre().equalsIgnoreCase(menosGoleado.getNombre())
					|| e.getEquipo_visit().getNombre().equalsIgnoreCase(menosGoleado.getNombre())) {
				if (partidos == null || e.getGoles_eq_local() + e.getGoles_eq_visit() > goles) {
					partidos = e;
					goles = e.getGoles_eq_local() + e.getGoles_eq_visit();
				}
			}
		}
		return partidos.getFecha();
	}

	/**
	 * Ejer7 - Método 6
	 * 
	 * @return el nombre del árbitro que ha arbitrado el partido con más goles del
	 *         equipo local pero solo si el el equipo visitante el el más goleador
	 *         de la liga
	 */
	public String nombreArbitroPartidoMasGolesEquipoLocal() {
		Encuentro partido = null;
		int goles = 0;
		for (Encuentro e : this.partidos) {
			if (e.getGoles_eq_local() > goles) {
				partido = e;
				goles = e.getGoles_eq_local();
			}
		}
		if (partido.getEquipo_visit().getNombre().equalsIgnoreCase(equipoMasGoleador()))
			return partido.getArbitro().getNombre();
		else
			return null;
	}

	// Auxiliar - Equipo menos Goleado
	public Equipo equipoMenosGoleado() {
		Equipo menosGoleado = null;
		int golesLesHanMetido = 0;
		for (Equipo e : equipos) {
			if (menosGoleado == null || golesLeHanMetido(e.getNombre()) < golesLesHanMetido) {
				menosGoleado = e;
				golesLesHanMetido = golesLeHanMetido(e.getNombre());
			}
		}
		return menosGoleado;
	}
}
