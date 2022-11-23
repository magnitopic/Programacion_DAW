package StarWars;

public class Padawan {
	private String nombre;
	private int edad;
	private int fuerza;
	private int potencial;
	private String planeta;

	public Padawan() {
	}

	public Padawan(String nombre, int edad, int fuerza, int potencial, String planeta) {
		this.nombre = nombre;
		this.edad = edad;
		if (fuerza >= 0 && fuerza <= 10)
			this.fuerza = fuerza;
		else
			this.fuerza = 0;
		this.potencial = potencial;
		this.planeta = planeta;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getFuerza() {
		return this.fuerza;
	}

	public void setFuerza(int fuerza) {
		if (fuerza >= 0 && fuerza <= 10)
			this.fuerza = fuerza;
		else
			System.out.println("Valor de fuerza fuera de rango");
	}

	public int getPotencial() {
		return this.potencial;
	}

	public void setPotencial(int potencial) {
		this.potencial = potencial;
	}

	public String getPlaneta() {
		return this.planeta;
	}

	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}

	public void mostrarDatos() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Fuerza: " + this.fuerza);
		System.out.println("Potencial: " + this.potencial);
		System.out.println("Planeta: " + this.planeta);
	}
}
