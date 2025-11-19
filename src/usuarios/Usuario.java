//package usuarios, porque asi se llama la carpeta en la que estan contenidos.
package usuarios;
//ATRIBUTOS DE USUARIO
public class Usuario {
    protected String nombreUsuario;
    private String contrasenya;
    protected int id;
    private int anyoNacimiento;
//constructores, getters y setters
    public Usuario(String nombreUsuario, String contrasenya, int id, int anyoNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
        this.id = id;
        this.anyoNacimiento = anyoNacimiento;
    }

    public Usuario() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }
//booleano para que nos diga si la persona es adulta, si es mayor o igual que 18, teniendo en cuenta el año con la fecha de nacimiento.
    public boolean esAdulto(){
        return (2025-this.anyoNacimiento) >= 18;
    }
    //booleano para saber si la contraseña es segura, diciendole que nos diga true siempre si es mayor o igual que 10. con ".length()"
    public boolean contrasenyaSegura(){
        return (this.contrasenya.length()>=10);
    }
    //String con nombre usuario e ID.
    @Override
    public String toString() {
        return this.nombreUsuario+ " ("+this.id+") ";

    }
}
