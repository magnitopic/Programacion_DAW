package TiendaVideojuegos;

public class Tienda {
	private String nombre;
	private String direccion;
	private String ciudad;
	private String num_tienda;

	public Tienda() {
	}

	public Tienda(String nombre, String direccion, String ciudad, String num_tienda) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.num_tienda = num_tienda;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getNum_tienda() {
		return this.num_tienda;
	}

	public void setNum_tienda(String num_tienda) {
		this.num_tienda = num_tienda;
	}

}
