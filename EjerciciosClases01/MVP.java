package EjerciciosClases01;

public class MVP {
	private String nombre;
	private String dorsal;
	private String equipo;
	private int nGoles;
	private int nAsistencias;
	private int nFaltas;
	private int nPasesClave;
	private String jornada;
	private String temporada;

	public MVP(String nombre, String dorsal, String equipo, int nGoles, int nAsistencias, int nFaltas, int nPasesClave,
			String jornada, String temporada) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.equipo = equipo;
		this.nGoles = nGoles;
		this.nAsistencias = nAsistencias;
		this.nFaltas = nFaltas;
		this.nPasesClave = nPasesClave;
		this.jornada = jornada;
		this.temporada = temporada;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDorsal() {
		return this.dorsal;
	}

	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}

	public String getEquipo() {
		return this.equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getNGoles() {
		return this.nGoles;
	}

	public void setNGoles(int nGoles) {
		this.nGoles = nGoles;
	}

	public int getNAsistencias() {
		return this.nAsistencias;
	}

	public void setNAsistencias(int nAsistencias) {
		this.nAsistencias = nAsistencias;
	}

	public int getNFaltas() {
		return this.nFaltas;
	}

	public void setNFaltas(int nFaltas) {
		this.nFaltas = nFaltas;
	}

	public int getNPasesClave() {
		return this.nPasesClave;
	}

	public void setNPasesClave(int nPasesClave) {
		this.nPasesClave = nPasesClave;
	}

	public String getJornada() {
		return this.jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}

	public String getTemporada() {
		return this.temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

}
