//package es la carpeta en donde esta contenida
package articulos;
//Atributos de videojuego
public class videojuego extends articulo{
    private String director;
    private String plataformas;
    private int pegi;

    public videojuego(String titulo, int anyoLanzamiento, double precioPorDia, String director, String plataformas, int pegi) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.plataformas = plataformas;
        this.pegi = pegi;
    }

    public videojuego() {
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }
    //boolean para que nos diga si el pegi es mayor de 18, es para adultos, y nos de true, de lo contrario false.
    public boolean paraAdultos(){
        return this.pegi >= 18;
    }
    //boolean para que nos diga que si la edad es mayor que el pegi sea apto, de lo contrario false.
    public boolean esApto(int edad){
        return edad >= this.pegi;
    }
    //String para que nos devuelva el titulo del videojuego, con el director, y el precio por dia.
    @Override
    public String toString() {
        return "[VideoJuego]: "+this.titulo+", de " +this.director+" ("+this.precioPorDia+"€/dia)";
    }
}
