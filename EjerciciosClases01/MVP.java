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

}
