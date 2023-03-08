package EjerciciosHerencia02;

public class Medico extends Personal {
	public String especialidad;
	public String n_intervenciones;
	public String n_consulta;

	public Medico(String especialidad, String n_intervenciones, String n_consulta) {
		this.especialidad = especialidad;
		this.n_intervenciones = n_intervenciones;
		this.n_consulta = n_consulta;
	}

	public Medico(String nombre, String apellidos, String fechaNacimiento, String especialidad, String n_intervenciones,
			String n_consulta) {
		super(nombre, apellidos, fechaNacimiento);
		this.especialidad = especialidad;
		this.n_intervenciones = n_intervenciones;
		this.n_consulta = n_consulta;
	}

	public String getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getN_intervenciones() {
		return this.n_intervenciones;
	}

	public void setN_intervenciones(String n_intervenciones) {
		this.n_intervenciones = n_intervenciones;
	}

	public String getN_consulta() {
		return this.n_consulta;
	}

	public void setN_consulta(String n_consulta) {
		this.n_consulta = n_consulta;
	}

	@Override
	public String toString() {
		return "{" +
				" especialidad='" + getEspecialidad() + "'" +
				", n_intervenciones='" + getN_intervenciones() + "'" +
				", n_consulta='" + getN_consulta() + "'" +
				", nombre='" + getNombre() + "'" +
				", apellidos='" + getApellidos() + "'" +
				", fechaNacimiento='" + getFechaNacimiento() + "'" +
				"}";
	}
}
