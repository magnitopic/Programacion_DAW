package EjerciciosHerencia02;

public class Personal {
	private String nombre;
	private String apellidos;
	private String fechaNacimiento;

	public Personal() {
	}

	public Personal(String nombre, String apellidos, String fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "{" +
				" nombre='" + getNombre() + "'" +
				", apellidos='" + getApellidos() + "'" +
				", fechaNacimiento='" + getFechaNacimiento() + "'" +
				"}";
	}

}
