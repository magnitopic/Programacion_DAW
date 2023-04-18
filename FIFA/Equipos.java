package FIFA;

public class Equipos {
	private int cod_eqipo;
	private String nombre;
	private int cod_liga;

	public Equipos(int cod_eqipo, String nombre, int cod_liga) {
		super();
		this.cod_eqipo = cod_eqipo;
		this.nombre = nombre;
		this.cod_liga = cod_liga;
	}

	public Equipos() {
		super();
	}

	public int getCod_eqipo() {
		return cod_eqipo;
	}

	public void setCod_eqipo(int cod_eqipo) {
		this.cod_eqipo = cod_eqipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCod_liga() {
		return cod_liga;
	}

	public void setCod_liga(int cod_liga) {
		this.cod_liga = cod_liga;
	}

}
