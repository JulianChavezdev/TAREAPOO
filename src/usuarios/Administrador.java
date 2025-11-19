//asignamos package que es la carpeta donde esta contenida esta clase y luego usamos import para importar la clase articulos, que esta en el package articulos.
package usuarios;
import articulos.Articulo;
// atributos de la clase
public class Administrador extends Usuario {
    public enum Rol {JEFE, VENDEDOR};
    private Rol rol;

    public Administrador(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Rol rol) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.rol = rol;
    }

    public Administrador() {
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    //Aqui usamos usuario.setarticulo, para que cuando se use asignarArticulo "setee" un (articulo)
    public void asignarArticulo(Cliente usuario, Articulo articulo){
        usuario.setArticulo(articulo);
    }
//Aqui es basicamente lo mismo, pero en vez de que "setee" un (articulo) lo "setee" con (null)
    public void retirarArticulo(Cliente usuario, Articulo articulo){
        usuario.setArticulo(null);
    }
    //String con la info del admin y su ID.
    @Override
    public String toString() {
        return "Administrador: " +this.nombreUsuario+ " (" +id+ ")";
    }
}

