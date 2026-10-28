package Biblioteca;

public class Main {
    public static void main(String[] args) {

        // Creación de 20 objetos Libro
        Libro[] libros = {
            new Libro("Cien años de soledad", "Gabriel García Márquez"),
            new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"),
            new Libro("La ciudad y los perros", "Mario Vargas Llosa"),
            new Libro("Huasipungo", "Jorge Icaza"),
            new Libro("Rayuela", "Julio Cortázar"),
            new Libro("Pedro Páramo", "Juan Rulfo"),
            new Libro("El principito", "Antoine de Saint-Exupéry"),
            new Libro("1984", "George Orwell"),
            new Libro("Un mundo feliz", "Aldous Huxley"),
            new Libro("Crimen y castigo", "Fiódor Dostoyevski"),
            new Libro("La metamorfosis", "Franz Kafka"),
            new Libro("Orgullo y prejuicio", "Jane Austen"),
            new Libro("El código limpio", "Robert C. Martin"),
            new Libro("Ingeniería del Software", "Roger S. Pressman"),
            new Libro("Sistemas Operativos", "Andrew S. Tanenbaum"),
            new Libro("Java: Cómo programar", "Deitel y Deitel"),
            new Libro("Introducción a los algoritmos", "Thomas H. Cormen"),
            new Libro("El arte de la guerra", "Sun Tzu"),
            new Libro("La Odisea", "Homero"),
            new Libro("Hamlet", "William Shakespeare")
        };

        System.out.println("===== CATÁLOGO DE LA BIBLIOTECA =====");
        for (Libro l : libros) {
            l.mostrarInfo();
        }

        System.out.println("\n===== PROCESANDO PRÉSTAMOS =====");
        Prestamo p1 = new Prestamo("28/10/2026");
        p1.procesarPrestamo(libros[0]);

        Prestamo p2 = new Prestamo("29/10/2026");
        p2.procesarPrestamo(libros[13]);

        Prestamo p3 = new Prestamo("30/10/2026");
        p3.procesarPrestamo(libros[19]);

        // Intento de prestar un libro ya prestado
        Prestamo p4 = new Prestamo("31/10/2026");
        p4.procesarPrestamo(libros[0]);

        System.out.println("\n===== DEVOLUCIÓN =====");
        libros[0].devolver();

        System.out.println("\n===== CATÁLOGO ACTUALIZADO =====");
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }
}
