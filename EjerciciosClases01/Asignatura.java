package EjerciciosClases01;

public class Asignatura {
	private String denominacion;
	private String nombreProfesor;
	private int dificultad;
	private String ciclo;
	private String[] dnis;

	public Asignatura(String denominacion, String nombreProfesor, int dificultad, String ciclo, String[] dnis) {
		this.denominacion = denominacion;
		this.nombreProfesor = nombreProfesor;
		this.dificultad = dificultad;
		this.ciclo = ciclo;
		this.dnis = dnis;
	}

}
