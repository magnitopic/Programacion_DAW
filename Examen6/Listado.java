
public class Listado {
	public String nombreDisco;
	public String nombreGrupo;
	public String nombreCompanyia;
	
	public Listado(){
	}
	
	public Listado(String nombreDisco, String nombreGrupo, String nombreCompanyia) {
		super();
		this.nombreDisco = nombreDisco;
		this.nombreGrupo = nombreGrupo;
		this.nombreCompanyia = nombreCompanyia;
	}

	public String getNombreDisco() {
		return nombreDisco;
	}

	public void setNombreDisco(String nombreDisco) {
		this.nombreDisco = nombreDisco;
	}

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public String getNombreCompanyia() {
		return nombreCompanyia;
	}

	public void setNombreCompanyia(String nombreCompanyia) {
		this.nombreCompanyia = nombreCompanyia;
	}
	
	
}
