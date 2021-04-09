package clases;

public class Libro extends Documento {
	// variables
	private int numPaginas;

	// constructor
	public Libro(String titulo, String autor, int numPaginas, int numEjemplares, int numEjemplaresPrestados) {
		super(titulo, autor, numEjemplares, numEjemplaresPrestados);
		this.numPaginas = numPaginas;
	}

	// setters y getters
	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	// metodo prestamo
	public void prestamo() {

		System.out.println("Iniciando el pr�stamo...");

		if (super.getNumEjemplares() == super.getNumEjemplaresPrestados()) {
			System.out.println("No se pueden prestar m�s libros, �est�n todos prestados!");
			System.out.println("");
		} else {
			super.incrementaNumEjemplaresPrestados();
			System.out.println("El libro se ha prestado correctamente.");
			System.out.println("");
		}
	}

	// metodo devolucion
	public void devolucion() {
		System.out.println("Iniciando la devoluci�n...");
		if (super.getNumEjemplaresPrestados() == 0) {
			System.out.println("No se pueden devolver m�s libros, �est�n todos devueltos!.");
			System.out.println("");
		} else {
			super.decrementaNumEjemplaresPrestados();
			System.out.println("El libro se ha devuelto correctamente.");
			System.out.println("");
		}
	}
}
