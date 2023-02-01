package EjerciciosFicheros04;

public class Pelicula {
	private int id;
	private String titulo;
	private int year;
	private String actor;
	private int presupuesto;

	public Pelicula() {
	}

	public Pelicula(int id, String titulo, int year, String actor, int presupuesto) {
		this.id = id;
		this.titulo = titulo;
		this.year = year;
		this.actor = actor;
		this.presupuesto = presupuesto;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getyear() {
		return this.year;
	}

	public void setyear(int year) {
		this.year = year;
	}

	public String getActor() {
		return this.actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public int getPresupuesto() {
		return this.presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public void showData() {
		System.out.println("Id: " + this.id);
		System.out.println("Título: " + this.titulo);
		System.out.println("Año: " + this.year);
		System.out.println("Actor Principal: " + this.actor);
		System.out.println("Presupuesto: " + this.presupuesto + "M €");
	}
}
