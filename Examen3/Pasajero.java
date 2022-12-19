package Examen3;

public class Pasajero {
	private String nombre;
	private String apellidos;
	private String telefono;
	private String dni;
	private int edad;

	public Pasajero() {
	}

	public Pasajero(String nombre, String apellidos, String telefono, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.dni = dni;
		this.edad = edad;
	}

	public Pasajero(String dni) {
		super();
		this.dni = dni;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void mostrarDatosPasajero() {
		System.out.println("****************************************\n* Nombre y apellidos: " + this.nombre + " "
				+ this.apellidos + "\n* DNI: " + this.dni + "\n* Edad: " + this.edad + "\n*"
				+ "\n****************************************");
	}
}
