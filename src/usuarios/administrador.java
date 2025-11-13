//asignamos package que es la carpeta donde esta contenida esta clase y luego usamos import para importar la clase articulos, que esta en el package articulos.
package usuarios;
import articulos.articulo;
// atributos de la clase
public class administrador extends usuario{
    public enum rol {JEFE, VENDEDOR};
    private rol rol;

    public administrador(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, rol rol) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.rol = rol;
    }

    public administrador() {
    }

    public rol getRol() {
        return rol;
    }

    public void setRol(rol rol) {
        this.rol = rol;
    }

    //Aqui usamos usuario.setarticulo, para que cuando se use asignarArticulo "setee" un (articulo)
    public void asignarArticulo(cliente usuario, articulo articulo){
        usuario.setArticulo(articulo);
    }
//Aqui es basicamente lo mismo, pero en vez de que "setee" un (articulo) lo "setee" con (null)
    public void retirarArticulo(cliente usuario, articulo articulo){
        usuario.setArticulo(null);
    }
    //String con la info del admin y su ID.
    @Override
    public String toString() {
        return "Administrador: " +this.nombreUsuario+ " (" +id+ ")";
    }
}

