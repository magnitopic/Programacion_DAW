package ProyectoOpositores;

public class Opositor {
	private String nombre;
	private String dni;
	private String telefono;
	private String ciudad;

	public Opositor() {
		super();
	}

	public Opositor(String nombre, String dni, String telefono, String ciudad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
		this.ciudad = ciudad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Opositor [nombre=" + nombre + ", dni=" + dni + ", telefono=" + telefono + ", ciudad=" + ciudad + "]";
	}

	public void mostrarDatos() {
		System.out.println("--------------------");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("DNI: " + this.dni);
		System.out.println("Telefono: " + this.telefono);
		System.out.println("Ciudad: " + this.ciudad);
	}
}
