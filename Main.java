package Biblioteca;

// clase principal: aquí empieza a ejecutarse el programa
public class Main {

    // método main: es lo primero que Java ejecuta
    public static void main(String[] args) {

        // creamos un arreglo de 20 objetos Libro
        // cada "new Libro(...)" crea un objeto distinto con su título y autor
        Libro[] libros = {
            new Libro("Cien años de soledad", "Gabriel García Márquez"),   // posición 0
            new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"),  // posición 1
            new Libro("La ciudad y los perros", "Mario Vargas Llosa"),     // posición 2
            new Libro("Huasipungo", "Jorge Icaza"),                        // posición 3
            new Libro("Rayuela", "Julio Cortázar"),                        // posición 4
            new Libro("Pedro Páramo", "Juan Rulfo"),                       // posición 5
            new Libro("El principito", "Antoine de Saint-Exupéry"),        // posición 6
            new Libro("1984", "George Orwell"),                            // posición 7
            new Libro("Un mundo feliz", "Aldous Huxley"),                  // posición 8
            new Libro("Crimen y castigo", "Fiódor Dostoyevski"),           // posición 9
            new Libro("La metamorfosis", "Franz Kafka"),                   // posición 10
            new Libro("Orgullo y prejuicio", "Jane Austen"),               // posición 11
            new Libro("El código limpio", "Robert C. Martin"),             // posición 12
            new Libro("Ingeniería del Software", "Roger S. Pressman"),     // posición 13
            new Libro("Sistemas Operativos", "Andrew S. Tanenbaum"),       // posición 14
            new Libro("Java: Cómo programar", "Deitel y Deitel"),          // posición 15
            new Libro("Introducción a los algoritmos", "Thomas H. Cormen"),// posición 16
            new Libro("El arte de la guerra", "Sun Tzu"),                  // posición 17
            new Libro("La Odisea", "Homero"),                              // posición 18
            new Libro("Hamlet", "William Shakespeare")                     // posición 19
        };

        // mostramos todos los libros al inicio (todos deben salir "Disponible")
        System.out.println("===== CATÁLOGO DE LA BIBLIOTECA =====");
        // for-each: recorre el arreglo y en cada vuelta "l" es un libro distinto
        for (Libro l : libros) {
            l.mostrarInfo();
        }

        System.out.println("\n===== PROCESANDO PRÉSTAMOS =====");

        // creamos un objeto Prestamo con su fecha y le pasamos un libro completo
        Prestamo p1 = new Prestamo("28/10/2026");
        p1.procesarPrestamo(libros[0]);  // presta "Cien años de soledad"

        Prestamo p2 = new Prestamo("29/10/2026");
        p2.procesarPrestamo(libros[13]); // presta "Ingeniería del Software"

        Prestamo p3 = new Prestamo("30/10/2026");
        p3.procesarPrestamo(libros[19]); // presta "Hamlet"

        // intento de prestar un libro ya prestado
        // como "Cien años de soledad" ya está prestado, debe salir que no está disponible
        Prestamo p4 = new Prestamo("31/10/2026");
        p4.procesarPrestamo(libros[0]);

        // el usuario devuelve el libro y vuelve a estar disponible
        System.out.println("\n===== DEVOLUCIÓN =====");
        libros[0].devolver();

        // mostramos otra vez el catálogo para ver qué libros siguen prestados
        System.out.println("\n===== CATÁLOGO ACTUALIZADO =====");
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }
}
