//Aqui importaremos de las otras clases, ya que esta en packages, debemos importarlos.

import articulos.articulo;
import articulos.pelicula;
import articulos.videojuego;
import usuarios.administrador;
import usuarios.cliente;

import static usuarios.administrador.rol.JEFE;

void main() {
//Aqui creamos 2 articulos, 1 pelicula y 1 videojuego, cada uno con sus datos.
    //Luego creamos los clientes, pero les doy valor null, para que luego el administrador los articulos
    pelicula pl1 = new pelicula("INCEPTION", 2016,20.5, "Christopher Nolan", 138);
    videojuego vj1 = new videojuego("GTA V",2013, 18.4, "Rockstar","STEAM", 18);
    cliente cl1 = new cliente("Julian","Julian123", 810, 2010,null, 1);
    cliente cl2 = new cliente("Melissa", "melissa2000", 999, 1979, null, 2 );
    administrador ad1 = new administrador("admin123", "admin123",123, 1999 , JEFE);
 //Aqui decimos que ad1( el admin que creamos) asignara al cliente 1(cl1) la pelicula 1( pl1)
    ad1.asignarArticulo(cl1, pl1);

    System.out.println(cl2.contrasenyaSegura());
}
