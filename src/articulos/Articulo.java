//package articulos, nos dice la carpeta que lo contiene
package articulos;
//atributos de la clase padre, que luego sera usada por el resto de clases hijas.
public class Articulo {
    protected String titulo;
    private int anyoLanzamiento;
    protected double precioPorDia;

    public Articulo() {
    }

    public Articulo(String titulo, int anyoLanzamiento, double precioPorDia) {
        this.titulo = titulo;
        this.anyoLanzamiento = anyoLanzamiento;
        this.precioPorDia = precioPorDia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

    public void setAnyoLanzamiento(int anyoLanzamiento) {
        this.anyoLanzamiento = anyoLanzamiento;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    //creamos metodo calcularPrecio para que nos diga cual es el precio de numArticulos*dias*precioPorDia.
     public double calcularPrecio(int numArticulos, int dias){
        return this.precioPorDia * numArticulos * dias;
     }
     //String que nos devuelve el titulo del articulo, y el precio.
     @Override
     public String toString() {
        return "[Articulo]" +this.titulo+ " ("+this.precioPorDia+ " €/dia )";
     }
}
