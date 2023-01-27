package Examen4;

public class Tienda {
	private String Nombre;
	private String direccion;
	private String ciudad;
	private String num_tienda;

	public Tienda() {
		super();
	}

	public Tienda(String nombre, String direccion, String ciudad, String num_tienda) {
		super();
		Nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.num_tienda = num_tienda;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNum_tienda() {
		return num_tienda;
	}

	public void setNum_tienda(String num_tienda) {
		this.num_tienda = num_tienda;
	}

}