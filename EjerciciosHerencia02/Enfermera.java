package EjerciciosHerencia02;

public class Enfermera extends Personal {
	private String planta;

	public Enfermera(String planta) {
		this.planta = planta;
	}

	public Enfermera(String nombre, String apellido, String dni, String planta) {
		super(nombre, apellido, dni);
		this.planta = planta;
	}

	public String getPlanta() {
		return this.planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}

	@Override
	public String toString() {
		return "{" +
				" planta='" + getPlanta() + "'" +
				", nombre='" + getNombre() + "'" +
				", apellidos='" + getApellidos() + "'" +
				", fechaNacimiento='" + getFechaNacimiento() + "'" +
				"}";
	}

}
