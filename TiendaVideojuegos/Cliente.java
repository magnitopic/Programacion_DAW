package TiendaVideojuegos;

public class Cliente {
	private String nombre;
	private String apellidos;
	private String direccion;
	private String dni;
	private String num_cliente;

	public Cliente() {
	}

	public Cliente(String nombre, String apellidos, String direccion, String dni, String num_cliente) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.dni = dni;
		this.num_cliente = num_cliente;
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

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNum_cliente() {
		return this.num_cliente;
	}

	public void setNum_cliente(String num_cliente) {
		this.num_cliente = num_cliente;
	}

}
