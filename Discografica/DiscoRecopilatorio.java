package Discografica;

public class DiscoRecopilatorio {
	private String titulo;
	private String codigo;
	private Disco[] discos;

	public DiscoRecopilatorio() {
	}

	public DiscoRecopilatorio(String titulo, String codigo, Disco[] discos) {
		this.titulo = titulo;
		this.codigo = codigo;
		this.discos = discos;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Disco[] getDiscos() {
		return this.discos;
	}

	public void setDiscos(Disco[] discos) {
		this.discos = discos;
	}

	public void showData() {
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Código: " + this.codigo);
		for (int i = 0; i < this.discos.length; i++) {
			System.out.println("Disco " + i + ": " + this.discos[i].getTitulo());
		}
	}

	public void titulosCanciones() {
		System.out.println("Titulo1: " + this.discos[0].getCanciones()[0].getTitulo()
				+ " - Título2: " + this.discos[1].getCanciones()[this.discos[1].getCanciones().length].getTitulo());
	}

}
