public class LibroTextoUniajc extends LibroTexto {
    private String facultad;

    public LibroTextoUniajc(String titulo, String autor, int numEjemplares, int numPrestados, String curso, String facultad) {
        super(titulo, autor, numEjemplares, numPrestados, curso);
        this.facultad = facultad;
    }

    public String getFacultad() { return facultad; }
    public void setFacultad(String facultad) { this.facultad = facultad; }
}