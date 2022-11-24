package EjerciciosClases02;

public class Jugador {
	private String nombre;
	private String apellidos;
	private String direccion;
	private String provincia;
	private String equipo;
	private int edad;
	private int nHijos;
	private int ppp; // Puntos por partido
	private int app; // Asistencias por partido
	private int rpp; // Rebotes por partido
	private int tpp; // Tapones por partido
	private int mpp; // Mates por partido
	private int perpp; // Perdidas por partido
	private int fpp; // Faltas por partido

	public Jugador() {
	}

	public Jugador(String nombre, String apellidos, String provincia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.provincia = provincia;
	}

	// Constructor con todos sus atributos
	public Jugador(String nombre, String apellidos, String direccion, String provincia, String equipo, int edad,
			int nHijos, int ppp,
			int app, int rpp, int tpp, int mpp, int perpp, int fpp) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.provincia = provincia;
		this.edad = edad;
		this.nHijos = nHijos;
		this.ppp = ppp;
		this.app = app;
		this.rpp = rpp;
		this.tpp = tpp;
		this.mpp = mpp;
		this.perpp = perpp;
		this.fpp = fpp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getnHijos() {
		return nHijos;
	}

	public void setnHijos(int nHijos) {
		this.nHijos = nHijos;
	}

	public int getPpp() {
		return ppp;
	}

	public void setPpp(int ppp) {
		this.ppp = ppp;
	}

	public int getApp() {
		return app;
	}

	public void setApp(int app) {
		this.app = app;
	}

	public int getRpp() {
		return rpp;
	}

	public void setRpp(int rpp) {
		this.rpp = rpp;
	}

	public int getTpp() {
		return tpp;
	}

	public void setTpp(int tpp) {
		this.tpp = tpp;
	}

	public int getMpp() {
		return mpp;
	}

	public void setMpp(int mpp) {
		this.mpp = mpp;
	}

	public int getPerpp() {
		return perpp;
	}

	public void setPerpp(int perpp) {
		this.perpp = perpp;
	}

	public int getFpp() {
		return fpp;
	}

	public void setFpp(int fpp) {
		this.fpp = fpp;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String nameSurname() {
		return this.nombre + " " + this.apellidos;
	}

	public int getEficiencia() {
		return (this.ppp + this.app + this.rpp + this.tpp + this.mpp - this.perpp - this.fpp);
	}

	public void canaston() {
		System.out.println("https://www.centronelson.org/wp-content/uploads/2022/11/chof.mp3");
	}

	public boolean esCrack() {
		return this.ppp > 30;
	}

}