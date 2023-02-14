package EjercicioMusica;

public class Grupo {
	private String cod;
	private String nombre;
	private String fecha;
	private String pais;

	public Grupo() {
	}

	public Grupo(String cod, String nombre, String fecha, String pais) {
		this.cod = cod;
		this.nombre = nombre;
		this.fecha = fecha;
		this.pais = pais;
	}

	public String getCod() {
		return this.cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void showData() {
		System.out.println("Código: " + this.cod);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Fecha: " + this.fecha);
		System.out.println("País: " + this.pais);
		System.out.println("=====================================");
	}
}
