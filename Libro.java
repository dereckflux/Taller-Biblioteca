package Biblioteca;

// esta clase representa un libro de la biblioteca
// cada libro que creemos será un objeto de esta clase
public class Libro {

    // atributos: son las características que tiene cada libro
    String titulo;      // guarda el nombre del libro
    String autor;       // guarda quién escribió el libro
    boolean disponible; // true si el libro está en la biblioteca, false si ya está prestado

    // constructor: se ejecuta cuando hacemos "new Libro(...)"
    // sirve para darle valores iniciales a los atributos del objeto
    public Libro(String titulo, String autor) {
        this.titulo = titulo;   // "this" se refiere al atributo del objeto, no al parámetro
        this.autor = autor;
        this.disponible = true; // todo libro nuevo empieza disponible
    }

    // método prestar: este es el método que la clase Prestamo va a invocar
    // revisa si el libro está disponible antes de prestarlo
    public void prestar() {
        if (disponible) {
            // si está disponible, lo marcamos como prestado
            disponible = false;
            System.out.println("El libro '" + titulo + "' de " + autor + " ha sido prestado.");
        } else {
            // si ya estaba prestado, no se puede volver a prestar
            System.out.println("El libro '" + titulo + "' no está disponible.");
        }
    }

    // método devolver: cuando el usuario regresa el libro, vuelve a estar disponible
    public void devolver() {
        disponible = true;
        System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    }

    // método mostrarInfo: imprime los datos del libro en una sola línea
    // el operador "? :" es un if corto: si disponible es true muestra "Disponible", si no "Prestado"
    public void mostrarInfo() {
        System.out.println("- " + titulo + " | " + autor + " | "
                + (disponible ? "Disponible" : "Prestado"));
    }
}
