package EjerciciosFicheros05;

public class Paciente {
	public int id;
	public String nombre;
	public String apellidos;
	public String direccion;
	public String ciudad;
	public String codigoPostal;
	public String telefono;
	public String fechaNacimiento;

	public Paciente() {
	}

	public Paciente(int id, String nombre, String apellidos, String direccion, String ciudad, String codigoPostal,
			String telefono, String fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void showData() {
		System.out.println("Id: " + this.id);
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Apellidos: " + this.apellidos);
		System.out.println("Dirección: " + this.direccion);
		System.out.println("Ciudad: " + this.ciudad);
		System.out.println("Código Postal: " + this.codigoPostal);
		System.out.println("Teléfono: " + this.telefono);
		System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
	}
}
