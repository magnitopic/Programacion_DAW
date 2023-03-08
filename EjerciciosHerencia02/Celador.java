package EjerciciosHerencia02;

public class Celador extends Personal {
	public String planta;
	public String peso;

	public Celador(String planta, String peso) {
		this.planta = planta;
		this.peso = peso;
	}

	public Celador(String nombre, String apellidos, String fechaNacimiento, String planta, String peso) {
		super(nombre, apellidos, fechaNacimiento);
		this.planta = planta;
		this.peso = peso;
	}

	public String getPlanta() {
		return this.planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}

	public String getPeso() {
		return this.peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "{" +
				" planta='" + getPlanta() + "'" +
				", peso='" + getPeso() + "'" +
				", nombre='" + getNombre() + "'" +
				", apellidos='" + getApellidos() + "'" +
				", fechaNacimiento='" + getFechaNacimiento() + "'" +
				"}";
	}

}
