package clases;

public abstract class Documento {
	// variables
	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numEjemplaresPrestados;

//constructor
	public Documento(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

//setters y getters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}

	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	public void incrementaNumEjemplaresPrestados() {
		this.numEjemplaresPrestados++;
	}

	public void decrementaNumEjemplaresPrestados() {
		this.numEjemplaresPrestados--;
	}

	// metodo prestamo
	public abstract void prestamo();

	// metodo devolucion
	public abstract void devolucion();
}
