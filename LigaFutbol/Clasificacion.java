package LigaFutbol;

import java.util.ArrayList;

public class Clasificacion {
	private Equipo equipo;
	private String nombre;
	private int pJugados;
	private int pGanados;
	private int pEmpatados;
	private int pPerdidos;
	private int gFavor;
	private int gContra;
	private int puntos;

	public Clasificacion() {
	}

	public Clasificacion(String nombre, int pJugados, int pGanados, int pEmpatados, int pPerdidos, int gFavor,
			int gContra, int puntos) {
		this.nombre = nombre;
		this.pJugados = pJugados;
		this.pGanados = pGanados;
		this.pEmpatados = pEmpatados;
		this.pPerdidos = pPerdidos;
		this.gFavor = gFavor;
		this.gContra = gContra;
		this.puntos = puntos;
	}

	public Clasificacion(Equipo equipo, ArrayList<Encuentro> encuentros) {
		this.equipo = equipo;
		this.nombre = equipo.getNombre();
		for (Encuentro e : encuentros) {
			if (e.getEquipo_local().getNombre().equalsIgnoreCase(equipo.getNombre())) {
				this.gFavor += e.getGoles_eq_local();
				this.gContra += e.getGoles_eq_visit();
				this.pJugados++;
				if (e.getGoles_eq_local() > e.getGoles_eq_visit()) {
					this.pGanados++;
					this.puntos += 2;
				} else if (e.getGoles_eq_local() == e.getGoles_eq_visit()) {
					this.pEmpatados++;
					this.puntos += 1;
				} else
					this.pPerdidos++;
			} else if (e.getEquipo_visit().getNombre().equalsIgnoreCase(equipo.getNombre())) {
				this.gFavor += e.getGoles_eq_visit();
				this.gContra += e.getGoles_eq_local();
				this.pJugados++;
				if (e.getGoles_eq_local() < e.getGoles_eq_visit()) {
					this.pGanados++;
					this.puntos += 2;
				} else if (e.getGoles_eq_local() == e.getGoles_eq_visit()) {
					this.pEmpatados++;
					this.puntos += 1;
				} else
					this.pPerdidos++;
			}
		}
	}


	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPJugados() {
		return this.pJugados;
	}

	public void setPJugados(int pJugados) {
		this.pJugados = pJugados;
	}

	public int getPGanados() {
		return this.pGanados;
	}

	public void setPGanados(int pGanados) {
		this.pGanados = pGanados;
	}

	public int getPEmpatados() {
		return this.pEmpatados;
	}

	public void setPEmpatados(int pEmpatados) {
		this.pEmpatados = pEmpatados;
	}

	public int getPPerdidos() {
		return this.pPerdidos;
	}

	public void setPPerdidos(int pPerdidos) {
		this.pPerdidos = pPerdidos;
	}

	public int getGFavor() {
		return this.gFavor;
	}

	public void setGFavor(int gFavor) {
		this.gFavor = gFavor;
	}

	public int getGContra() {
		return this.gContra;
	}

	public void setGContra(int gContra) {
		this.gContra = gContra;
	}

	public int getPuntos() {
		return this.puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}	
}
