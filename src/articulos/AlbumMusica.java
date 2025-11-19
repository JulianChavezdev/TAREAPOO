//package es la carpeta que contiene esta clase
package articulos;
//en todas las clases hijas, llevaran extends articulo, para decirnos que heredara atributos de la clase padre (articulo)
public class AlbumMusica extends Articulo {
    private String autor;
    private int numCanciones;
    private boolean single;

    public AlbumMusica(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numCanciones, boolean single) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numCanciones = numCanciones;
        this.single = single;
    }

    public AlbumMusica() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }
    //metodo para decirnos la media de la duracion total del album dada una media duracion al multiplicarla * la cantidad de canciones.
    public int getDuracionTotal(int duracion) {
    return this.numCanciones*duracion;
    }
    //String que nos devuelva el titulo del album, con el autor y el precio por dia.
    @Override
    public String toString() {
        return "[Album]: " +this.titulo+ ", de " +this.autor+ " ("+this.precioPorDia+"€/Dia)";
    }
}
