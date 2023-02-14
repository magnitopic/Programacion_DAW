package EjercicioMusica;

public class Cancion {
	private String cod;
	private String titulo;
	private String duracion;

	public Cancion() {
	}

	public Cancion(String cod, String titulo, String duracion) {
		this.cod = cod;
		this.titulo = titulo;
		this.duracion = duracion;
	}

	public String getCod() {
		return this.cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDuracion() {
		return this.duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public void showData() {
		System.out.println("Código: " + this.cod);
		System.out.println("Título: " + this.titulo);
		System.out.println("Duración: " + this.duracion);
		System.out.println("=====================================");
	}
}
