package ControladoresAereos2;

public class Pasajero {
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	private String provincia;

	public Pasajero() {
	}

	public Pasajero(String nombre, String apellidos, String dni, int edad, String provincia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		this.provincia = provincia;
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

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public void showData() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellidos: " + this.apellidos);
		System.out.println("DNI: " + this.dni);
		System.out.println("Edad: " + this.edad);
		System.out.println("Provincia: " + this.provincia);
	}

}
