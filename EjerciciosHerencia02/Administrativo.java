package EjerciciosHerencia02;

public class Administrativo extends Personal {
	private String planta;
	private String nivel_excel;

	public Administrativo(String planta, String nivel_excel) {
		this.planta = planta;
		this.nivel_excel = nivel_excel;
	}

	public Administrativo(String nombre, String apellidos, String fechaNacimiento, String planta, String nivel_excel) {
		super(nombre, apellidos, fechaNacimiento);
		this.planta = planta;
		this.nivel_excel = nivel_excel;
	}

	public String getPlanta() {
		return this.planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}

	public String getNivel_excel() {
		return this.nivel_excel;
	}

	public void setNivel_excel(String nivel_excel) {
		this.nivel_excel = nivel_excel;
	}

	@Override
	public String toString() {
		return "{" +
				" planta='" + getPlanta() + "'" +
				", nivel_excel='" + getNivel_excel() + "'" +
				", nombre='" + getNombre() + "'" +
				", apellidos='" + getApellidos() + "'" +
				", fechaNacimiento='" + getFechaNacimiento() + "'" +
				"}";
	}

}
