package Biblioteca;

// esta clase representa un préstamo que se registra en la biblioteca
// su trabajo es recibir un libro y pedirle que se preste
public class Prestamo {

    // atributo: la fecha en la que se hace el préstamo
    String fecha;

    // constructor: al crear un préstamo le pasamos la fecha
    public Prestamo(String fecha) {
        this.fecha = fecha;
    }

    // EL CONCEPTO CLAVE: Recibe un objeto 'Libro' completo como parámetro
    // o sea, no recibe solo el título, recibe todo el objeto con sus atributos y métodos
    public void procesarPrestamo(Libro unLibro) {
        // primero mostramos la fecha del préstamo
        System.out.println("Registrando préstamo en la fecha: " + fecha);

        // Colaboración entre clases: Invocamos el método del libro
        // aquí la clase Prestamo "le habla" a la clase Libro usando su método prestar()
        unLibro.prestar();
    }
}
