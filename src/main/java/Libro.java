public class Libro {
    // Atributos (Encapsulamiento)
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numPrestados;

    // vacío
    public Libro() {
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }

    // Métodos Préstamo y Devolución
    public boolean prestamo() {
        if (numPrestados < numEjemplares) {
            numPrestados = numPrestados + 1;
            return true;
        }
        return false;
    }

    public boolean devolucion() {
        if (numPrestados > 0) {
            numPrestados = numPrestados - 1;
            return true;
        }
        return false;
    }

    //Para acceder a los datos privados
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getNumEjemplares() { return numEjemplares; }
    public void setNumEjemplares(int numEjemplares) { this.numEjemplares = numEjemplares; }

    public int getNumPrestados() { return numPrestados; }
    public void setNumPrestados(int numPrestados) { this.numPrestados = numPrestados; }

    // Método para imprimir
    public void mostrarDatos() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Prestados: " + numPrestados);
    }
}