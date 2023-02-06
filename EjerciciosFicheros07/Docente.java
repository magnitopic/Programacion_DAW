package EjerciciosFicheros07;

public class Docente {
	private String id;
	private String nombre;
	private String rama;
	private String horario;
	private String cargo;

	public Docente() {
	}

	public Docente(String id, String nombre, String rama, String horario, String cargo) {
		this.id = id;
		this.nombre = nombre;
		this.rama = rama;
		this.horario = horario;
		this.cargo = cargo;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRama() {
		return this.rama;
	}

	public void setRama(String rama) {
		this.rama = rama;
	}

	public String getHorario() {
		return this.horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void printData() {
		System.out.println("ID: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Rama: " + this.rama);
		System.out.println("Horario: " + this.horario);
		System.out.println("Cargo: " + this.cargo);
	}
}
