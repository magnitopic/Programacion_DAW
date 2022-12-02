package Aerolineas;

public class Pasajero {
	private String nombre;
	private String apellidos;
	private String telefono;
	private String dni;
	private int edad;

	public Pasajero() {
	}

	public Pasajero(String dni) {
		this.dni = dni;
	}

	public Pasajero(String nombre, String apellidos, String telefono, String dni, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.dni = dni;
		this.edad = edad;
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

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
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

	public void mostrarDatosPasajero() {
		for (int i = 0; i < 40; i++)
			System.out.print("*");
		System.out.println("\n*	Nombre y apellidos: " + this.nombre + " " + this.apellidos);
		System.out.println("*	DNI: " + this.dni);
		System.out.println("Edad: " + this.edad);
		for (int i = 0; i < 40; i++)
			System.out.print("*");
		System.out.print("\n");
	}

	public boolean mayorEdad() {
		return this.edad >= 18;
	}

	public void sumaEdad(int edad) {
		this.edad += edad;
	}

	public void nombreSiMayorEdad(int edadMin) {
		if (this.edad > edadMin)
			System.out.println("Nombre y apellidos: " + this.nombre + " " + this.apellidos);
	}
}
