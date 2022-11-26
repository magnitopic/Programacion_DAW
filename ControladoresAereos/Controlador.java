package ControladoresAereos;

public class Controlador {
	private String nombre;
	private String apellidos;
	private String dni;
	private int anoNac;
	private int anosExp;
	private int destreza;

	public Controlador() {
	}

	public Controlador(String nombre, String apellidos, String dni, int anoNac, int anosExp, int destreza) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.anoNac = anoNac;
		this.anosExp = anosExp;
		if (destreza >= 0 && destreza <= 100)
			this.destreza = destreza;
		else {
			System.out.println("Valor para destreza invalido");
			this.destreza = 0;
		}
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

	public int getAnoNac() {
		return this.anoNac;
	}

	public void setAnoNac(int anoNac) {
		this.anoNac = anoNac;
	}

	public int getAnosExp() {
		return this.anosExp;
	}

	public void setAnosExp(int anosExp) {
		this.anosExp = anosExp;
	}

	public int getDestreza() {
		return this.destreza;
	}

	public void setDestreza(int destreza) {
		if (destreza >= 0 && destreza <= 100)
			this.destreza = destreza;
		else {
			System.out.println("Valor para destreza invalido");
			this.destreza = 0;
		}
	}

	public void showData() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellidos: " + this.apellidos);
		System.out.println("DNI: " + this.dni);
		System.out.println("Año nacimiento: " + this.anoNac);
		System.out.println("Años de experiencia: " + this.anosExp);
		System.out.println("Destreza: " + this.destreza);
	}
}
