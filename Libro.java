package Biblioteca;

public class Libro {
    String titulo;
    String autor;
    boolean disponible;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    // Método que invoca la clase Prestamo
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro '" + titulo + "' de " + autor + " ha sido prestado.");
        } else {
            System.out.println("El libro '" + titulo + "' no está disponible.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    }

    public void mostrarInfo() {
        System.out.println("- " + titulo + " | " + autor + " | "
                + (disponible ? "Disponible" : "Prestado"));
    }
}
