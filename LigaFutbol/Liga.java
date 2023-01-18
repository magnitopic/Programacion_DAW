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

}
