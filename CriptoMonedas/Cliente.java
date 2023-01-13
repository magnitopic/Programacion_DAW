package CriptoMonedas;


public class Cliente {
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	private String fecha_nac;
	private String provincia;
	private String nacionalidad;
	private ArrayList<Cuenta_bancaria> cuentas;
	private Billetera billetera;

	public Cliente() {
	}

	public Cliente(String nombre, String apellidos, String dni, String direccion, String fecha_nac, String provincia,
			String nacionalidad, ArrayList<Cuenta_bancaria> cuentas, Billetera billetera) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.fecha_nac = fecha_nac;
		this.provincia = provincia;
		this.nacionalidad = nacionalidad;
		this.cuentas = cuentas;
		this.billetera = billetera;
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

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFecha_nac() {
		return this.fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public ArrayList<Cuenta_bancaria> getCuentas() {
		return this.cuentas;
	}

	public void setCuentas(ArrayList<Cuenta_bancaria> cuentas) {
		this.cuentas = cuentas;
	}

	public Billetera getBilletera() {
		return this.billetera;
	}

	public void setBilletera(Billetera billetera) {
		this.billetera = billetera;
	}

	/**
	 * Método 14
	 * 
	 * @return el numero de cuenta con más saldo
	 */
	public String nCuentaMaxSaldo() {
		Cuenta_bancaria cuentaMax = this.cuentas.get(0);

		for (Cuenta_bancaria o : this.cuentas) {
			if (o.getSaldo() > cuentaMax.getSaldo())
				cuentaMax = o;
		}

		return cuentaMax.getN_cuenta();
	}

	/**
	 * Método 15
	 * 
	 * @return el numero de cuenta con más operaciones
	 */
	public String nCuentaMaxOperations() {
		Cuenta_bancaria cuentaMax = this.cuentas.get(0);

		for (Cuenta_bancaria o : this.cuentas) {
			if (o.getHistorial().size() > cuentaMax.getHistorial().size())
				cuentaMax = o;
		}

		return cuentaMax.getN_cuenta();
	}

	// Auxiliar
	public int maxOperations() {
		int transactionMax = this.cuentas.get(0).getHistorial().size();

		for (Cuenta_bancaria o : this.cuentas) {
			if (o.getHistorial().size() > transactionMax)
				transactionMax = o.getHistorial().size();
		}

		return transactionMax;
	}

	/**
	 * Método 18
	 * @return
	 */
	public String menosUdCriptomoneda() {
		String menosUd = null;
		double min = 0;
		for (L_billetera l : this.billetera.getLineas_b()) {
			if (menosUd == null || l.getUnidades() < min) {
				menosUd = l.getCriptomoneda().getNombre();
				min = l.getUnidades();
			}
		}

		return menosUd;
	}
}
