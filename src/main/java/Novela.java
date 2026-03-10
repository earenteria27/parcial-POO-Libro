public class Novela extends Libro {
    private String tipo;

    public Novela(String titulo, String autor, int numEjemplares, int numPrestados, String tipo) {
        super(titulo, autor, numEjemplares, numPrestados);
        this.tipo = tipo;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}