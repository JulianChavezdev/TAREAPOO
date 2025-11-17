//Aqui importaremos de las otras clases, ya que esta en packages, debemos importarlos.

import articulos.articulo;
import articulos.pelicula;
import articulos.albumMusica;
import articulos.libro;
import articulos.videojuego;
import usuarios.administrador;
import usuarios.cliente;

import static usuarios.administrador.rol.JEFE;

void main() {
//Aqui creamos 4 articulos, 2 pelicula y 2 videojuego, cada uno con sus datos.
    //Luego creamos los clientes, pero les doy valor null, para que luego el administrador los articulos
    pelicula pl1 = new pelicula("INCEPTION", 2016,20.5, "Christopher Nolan", 138);
    pelicula pl2 = new pelicula("El Lobo de Wall Street", 2013, 20, "Julian Chavez",125);


    videojuego vj1 = new videojuego("GTA V",2013, 18.4, "Rockstar","STEAM", 18);
    videojuego vj2 = new videojuego("Fortnite", 2017, 16, "Epic Games", "Steam", 12);

    albumMusica album1 = new albumMusica("tropicoqueta", 2020, 20.0, "Karol G", 12, false);
    albumMusica album2 = new albumMusica("No le temas a la oscuridad", 2023, 12, "Feid", 8, true);

    libro lb1 = new libro("IT", 1996, 18, libro.genero.TERROR);
    libro lb2 = new libro("Maze runner", 2015, 8, libro.genero.ACCION);


    cliente cl1 = new cliente("Julian","Julian123", 810, 2010,null, 1);
    cliente cl2 = new cliente("Melissa", "melissa2000", 999, 1979, null, 2 );


    administrador ad1 = new administrador("admin123", "admin123",123, 1999 , JEFE);


 //Aqui decimos que ad1 (el admin que creamos) asignara al cliente 1(cl1) el Album2.
    ad1.asignarArticulo(cl1, album2);

    System.out.println("El album Asignado a "+cl1.getNombreUsuario()+ " es " +cl1.getArticulo());
}
