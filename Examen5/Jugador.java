
public class Jugador {
	public int codigo;
	public String nombre;
	public String procedencia;
	public String altura;
	public int peso;
	public String posicion;
	public String Nombre_equipo;

	public Jugador() {
	}

	public Jugador(int codigo, String nombre, String procedencia, String altura, int peso, String posicion,
			String nombre_equipo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.procedencia = procedencia;
		this.altura = altura;
		this.peso = peso;
		this.posicion = posicion;
		Nombre_equipo = nombre_equipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getNombre_equipo() {
		return Nombre_equipo;
	}

	public void setNombre_equipo(String nombre_equipo) {
		Nombre_equipo = nombre_equipo;
	}

}
