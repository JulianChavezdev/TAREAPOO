//usamos package,por que es la carpeta que lo contiene
package articulos;
//atributos de la clase
public class pelicula extends articulo{
    private String director;
    protected int duracion;

    public pelicula(String titulo, int anyoLanzamiento, double precioPorDia, String director, int duracion) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.duracion = duracion;
    }

    public pelicula() {
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
// getDuracionHorasYMinutos para obtener las horas, y con la cantidad de minutos exactos, dada la duracion en minutos.
    public void getDuracionHorasYMinutos(){
        int horas= this.duracion/60;
        int minutos= this.duracion%60;
        System.out.println(+horas+ "horas y " +minutos+ "minutos ");
    }
    //String para que nos devolvera el nombre de la pelicula con su director y el precio x dia.
    @Override
    public String toString() {
        return "[pelicula] " +this.titulo+ ", de " +this.director+ " ("+this.precioPorDia+"€/Dia)";
    }
}
