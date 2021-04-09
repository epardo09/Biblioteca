package principal;

import clases.Enciclopedia;
import clases.Libro;

public class GestionBiblioteca {

	public static void main(String[] args) {

		// Creamos 2 libros
		Libro l1 = new Libro("IT", "Stephen King", 1504, 5, 0);
		Libro l2 = new Libro("El Se�or de los Anillos - La comunidad del anillo", "J.R.R. Tolkien", 547, 10, 10);

		// Mostramos informaci�n del primer libro
		extracted(l1);

		// Devolvemos un ejemplar de l1 (mirad que no tenemos dejado ninguno...)
		l1.devolucion();
		// Prestamos uno
		l1.prestamo();
		// Y ahora lo devolvemos
		l1.devolucion();

		// Mostramos informaci�n del primer libro
		extracted(l2);
		// Devolvemos un ejemplar de l2 (mirad que no tenemos dejado ninguno...)
		l2.prestamo();
		// Prestamos uno
		l2.devolucion();
		// Y ahora lo devolvemos
		l2.prestamo();

		// Creamos 2 enciclopedias
		Enciclopedia e1 = new Enciclopedia("Enciclopedia Espasa", "Antonio Ramirez", "ESPASA", 10, 5);
		Enciclopedia e2 = new Enciclopedia("Enciclopedia Encarta", "Bill Gates", "Microsoft", 20, 15);

		// Mostramos informaci�n de la primera enciclopedia
		extracted(e1);

		// Devolvemos un ejemplar de e1
		e1.devolucion();
		// Prestamos una
		e1.prestamo();
		// Y ahora la devolvemos
		e1.devolucion();

		extracted(e2);

		// Prestamos una
		e2.prestamo();
		// TODO nose si es un fallo
		// Devolvemos un ejemplar de e2
		e2.devolucion();
		// Prestamos una
		e2.prestamo();
		// Y ahora la devolvemos
		e2.devolucion();
	}

//metodo informacion del Enciclopedia
	private static void extracted(Enciclopedia e1) {
		System.out.println("");
		System.out.println("== Informaci�n de la enciclopedia - " + e1.getTitulo() + " ==");
		System.out.println("Autor: " + e1.getAutor());
		System.out.println("Editorial: " + e1.getEditorial());
		System.out.println("N�mero de ejemplares en posesi�n: " + e1.getNumEjemplares());
		System.out.println("N�mero de ejemplares prestados: " + e1.getNumEjemplaresPrestados());
		System.out.println("");
	}

	// metodo informacion del libro
	private static void extracted(Libro l1) {
		System.out.println("");
		System.out.println("== Informaci�n del libro - " + l1.getTitulo() + " ==");
		System.out.println("Autor: " + l1.getAutor());
		System.out.println("N� de p�ginas: " + l1.getNumPaginas() + " p�ginas");
		System.out.println("N�mero de ejemplares en posesi�n: " + l1.getNumEjemplares());
		System.out.println("N�mero de ejemplares prestados: " + l1.getNumEjemplaresPrestados());
		System.out.println("");
	}
}
