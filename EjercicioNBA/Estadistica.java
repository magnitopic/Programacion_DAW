package EjercicioNBA;

public class Estadistica {
	public String temporada;
	public int jugador;
	public float puntos;
	public float asitencias;
	public float tapones;
	public float rebotes;

	public Estadistica() {
	}

	public Estadistica(String temporada, int jugador, float puntos, float asitencias, float tapones, float rebotes) {
		this.temporada = temporada;
		this.jugador = jugador;
		this.puntos = puntos;
		this.asitencias = asitencias;
		this.tapones = tapones;
		this.rebotes = rebotes;
	}

	public String getTemporada() {
		return this.temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public int getJugador() {
		return this.jugador;
	}

	public void setJugador(int jugador) {
		this.jugador = jugador;
	}

	public float getPuntos() {
		return this.puntos;
	}

	public void setPuntos(float puntos) {
		this.puntos = puntos;
	}

	public float getAsitencias() {
		return this.asitencias;
	}

	public void setAsitencias(float asitencias) {
		this.asitencias = asitencias;
	}

	public float getTapones() {
		return this.tapones;
	}

	public void setTapones(float tapones) {
		this.tapones = tapones;
	}

	public float getRebotes() {
		return this.rebotes;
	}

	public void setRebotes(float rebotes) {
		this.rebotes = rebotes;
	}

}
