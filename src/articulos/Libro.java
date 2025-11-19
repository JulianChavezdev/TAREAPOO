//package=carpeta que lo contiene
package articulos;
//atributos de clase, con genero como tipo enumerado.
public class Libro extends Articulo {
    private String autor;
    private int numPaginas;
    public enum Genero {MISTERIO, TERROR, ACCION, HISTORIA, FANTASIA};
    private Genero genero;

    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, int numPaginas, String autor) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.numPaginas = numPaginas;
        this.autor = autor;
    }

    public Libro() {
    }
//seteamos el numero de paginas en num.Paginas con este constructor
    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, Genero genero) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.genero = genero;
        this.numPaginas = 100;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void ñsetGenero(Genero genero) {
        this.genero = genero;
    }
    //booleano para que me diga que true si tiene 200 paginas o mas. false si tiene menos.
    public boolean esLargo(){
        return numPaginas >= 200;
    }
//String que nos devolvera libro, con el titulo, y el precio por dia.
    @Override
    public String toString() {
        return "[Libro]: "+this.titulo+ ", de "+this.autor+ " ("+this.precioPorDia+"€/Dia)";
    }
}
