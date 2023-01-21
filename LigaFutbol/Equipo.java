package LigaFutbol;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private ArrayList<Jugador> jugadores;

	public Equipo() {
		super();
	}

	public Equipo(String nombre, ArrayList<Jugador> jugadores) {
		super();
		this.nombre = nombre;
		this.jugadores = jugadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + "]";
	}

	/**
	 * Método 1
	 * 
	 * @param demarcacion
	 * @return
	 */
	public ArrayList<Jugador> jugadoresDemarcacion(String demarcacion) {
		ArrayList<Jugador> jugadoresDemarcacion = new ArrayList<Jugador>();
		for (Jugador j : this.jugadores) {
			if (j.getPosicion().equalsIgnoreCase(demarcacion)) {
				jugadoresDemarcacion.add(j);
			}
		}
		return jugadoresDemarcacion;
	}

	/**
	 * Método 2
	 * 
	 * @return
	 */
	public ArrayList<Jugador> jugadoresTitularidades() {
		ArrayList<Jugador> jugadoresTitularidades = new ArrayList<Jugador>();
		int numTitularidades = 0;
		for (Jugador j : this.jugadores) {
			if (j.getDatos().getTitularidades() > numTitularidades) {
				jugadoresTitularidades.clear();
				numTitularidades = j.getDatos().getTitularidades();
				jugadoresTitularidades.add(j);
			} else if (j.getDatos().getTitularidades() == numTitularidades)
				jugadoresTitularidades.add(j);
		}
		return jugadoresTitularidades;
	}

	/**
	 * Ejer4 - Método 1
	 * Añade el jugador con más goles de un país a la lista de jugadores del equipo
	 * 
	 * @param pais
	 */
	public void addJugadorPichichi(Pais pais) {
		Jugador pichichi = null;
		for (Liga l : pais.getLigas()) {
			for (Equipo e : l.getEquipos()) {
				for (Jugador j : e.getJugadores()) {
					if (pichichi == null)
						pichichi = j;
					else if (j.getDatos().getGoles() > pichichi.getDatos().getGoles())
						pichichi = j;
				}
			}
		}
		this.jugadores.add(pichichi);
	}

	/**
	 * Ejer4 - Método 2
	 * @return el numero de jugadores que no tienen tarjetas rojas ni amarillas
	 */
	public int jugadoresNoRojaMarilla() {
		int count = 0;
		for (Jugador j : this.jugadores) {
			if (j.getDatos().getTarjetas_r() == 0 && j.getDatos().getTarjetas_a() == 0)
				count++;
		}
		return count;
	}
}
