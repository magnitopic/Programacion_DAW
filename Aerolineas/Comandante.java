package Aerolineas;

public class Comandante {
	private String nombre;
	private String apellidos;
	private String telefono;
	private String dni;
	private int edad;
	private String rango;

	public Comandante() {
	}

	public Comandante(String dni) {
		this.dni = dni;
	}

	public Comandante(String nombre, String apellidos, String telefono, String dni, int edad, String rango) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.dni = dni;
		this.edad = edad;
		this.rango = rango;
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

	public String getRango() {
		return this.rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public void mostrarDatosComandante() {
		for (int i = 0; i < 40; i++)
			System.out.print("*");
		System.out.println("\n*	Nombre y apellidos: " + this.nombre + " " + this.apellidos);
		System.out.println("*	DNI: " + this.dni);
		System.out.println("*	Edad: " + this.edad);
		System.out.println("*	Rango: " + this.rango);
		for (int i = 0; i < 40; i++)
			System.out.print("*");
		System.out.print("\n");
	}

	public void nombreSiRango(String rango) {
		if (this.rango.equalsIgnoreCase(rango))
			System.out.println("Nombre y apellidos: " + this.nombre + " " + this.apellidos);
	}
}
