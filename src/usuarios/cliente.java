//package porque es la carpeta en la que esta contenida, e import, porque importaremos la clase articulo, del package articulos.
package usuarios;
import articulos.articulo;
//atributos de clase
public class cliente extends usuario{
    private articulo articulo;
    private int numSocio;

    public cliente(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, articulo articulo, int numSocio) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.articulo = articulo;
        this.numSocio = numSocio;
    }

    public cliente() {
    }

    public articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(articulo articulo) {
        this.articulo = articulo;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }
    //calculamos el precio , teniendo en cuenta el numero de articulos, con la cantidad de dias. usamos .getarticulo() para obtener el articulo y .calcular para hacer la matematica-
    public double calcularPrecio(int numArticulos,int dias){
        return this.getArticulo().calcularPrecio(numArticulos, dias);
    }
    //String que nos da el nombre del cliente con su ID
    @Override
    public String toString() {
        return "Cliente: " +this.nombreUsuario+ " ("+this.id+ ")";
    }
}
