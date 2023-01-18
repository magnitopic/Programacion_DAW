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

	public String getDenominacion() {
		return this.denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getNombreProfesor() {
		return this.nombreProfesor;
	}

	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}

	public int getDificultad() {
		return this.dificultad;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	public String getCiclo() {
		return this.ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String[] getDnis() {
		return this.dnis;
	}

	public void setDnis(String[] dnis) {
		this.dnis = dnis;
	}

}
