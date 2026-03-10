import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // constructor con parámetros
        Libro libro1 = new Libro("Cien años de soledad", "Gabo", 5, 0);

        //constructor y datos por consola
        Libro libro2 = new Libro();
        System.out.print("Ingrese título para Libro 2: ");
        libro2.setTitulo(sc.nextLine());
        System.out.print("Ingrese autor para Libro 2: ");
        libro2.setAutor(sc.nextLine());
        libro2.setNumEjemplares(3);
        libro2.setNumPrestados(0);

        // LibroTexto
        LibroTextoUniajc libroU = new LibroTextoUniajc("Física I", "Sears", 10, 2, "Ciencias", "Ingeniería");

        //Novela
        Novela novela1 = new Novela("El resplandor", "Stephen King", 4, 1, "Terror");

        // Prueba
        System.out.println("\n--- Realizando préstamos ---");
        libro1.prestamo();
        libroU.prestamo();

        System.out.println("\n--- Información de los libros ---");
        libro1.mostrarDatos();
        libro2.mostrarDatos();
        libroU.mostrarDatos();
        novela1.mostrarDatos();
    }
}