package EjerciciosHerencia03;

public class Animal {
	public String nombre;
	public String procedencia;
	public String altura;
	public String peso;

	public Animal(String nombre, String procedencia, String altura, String peso) {
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProcedencia() {
		return this.procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getAltura() {
		return this.altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
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
				" nombre='" + getNombre() + "'" +
				", procedencia='" + getProcedencia() + "'" +
				", altura='" + getAltura() + "'" +
				", peso='" + getPeso() + "'" +
				"}";
	}
}
