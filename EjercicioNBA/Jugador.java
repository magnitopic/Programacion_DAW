package EjercicioNBA;

public class Jugador {
	public int codigo;
	public String altura;
	public String nombre;
	public String nombre_equipo;
	public int peso;
	public String posicion;
	public String procedencia;

	public Jugador() {
	}

	public Jugador(int codigo, String altura, String nombre, String nombre_equipo, int peso, String posicion,
			String procedencia) {
		this.codigo = codigo;
		this.altura = altura;
		this.nombre = nombre;
		this.nombre_equipo = nombre_equipo;
		this.peso = peso;
		this.posicion = posicion;
		this.procedencia = procedencia;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void getCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAltura() {
		return this.altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre_equipo() {
		return this.nombre_equipo;
	}

	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}

	public int getPeso() {
		return this.peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return this.posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getProcedencia() {
		return this.procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public void printData() {
		System.out.println("===================");
		System.out.println("ID: " + this.codigo);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Altura: " + this.altura);
		System.out.println("Peso: " + this.peso);
		System.out.println("Posición: " + this.posicion);
		System.out.println("Procedencia: " + this.procedencia);
		System.out.println("Nombre del equipo: " + this.nombre_equipo);
	}
}
