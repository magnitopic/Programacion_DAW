
public class Disco {
	private String cod;
	private String nombre;
	private String fecha;
	
	public Disco() {
	}
	
	public Disco(String cod, String nombre, String fecha) {
		super();
		this.cod = cod;
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
