package StarWars;

public class Jedi {
	private String nombre;
	private int edad;
	private int fuerza;
	private String planeta;
	private String color_laser;

	public Jedi() {
	}

	public Jedi(String nombre, int edad, int fuerza, String planeta, String color_laser) {
		this.nombre = nombre;
		this.edad = edad;
		if (fuerza >= 0 && fuerza <= 10)
			this.fuerza = fuerza;
		else
			this.fuerza = 0;
		this.planeta = planeta;
		this.color_laser = color_laser;
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

	public String getPlaneta() {
		return this.planeta;
	}

	public void setPlaneta(String planeta) {
		this.planeta = planeta;
	}

	public String getColor_laser() {
		return this.color_laser;
	}

	public void setColor_laser(String color_laser) {
		this.color_laser = color_laser;
	}

	public void mostrarDatos() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Edad: " + this.edad);
		System.out.println("Fuerza: " + this.fuerza);
		System.out.println("Planeta: " + this.planeta);
		System.out.println("Color de espada laser: " + this.color_laser);
	}

	public void degradacipmFuerza(int valor) {
		this.fuerza = this.fuerza - valor;
	}

}
