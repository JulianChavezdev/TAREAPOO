//Aquí importaremos de las otras clases, ya que está en packages, debemos importarlos.

import articulos.Pelicula;
import articulos.AlbumMusica;
import articulos.Libro;
import articulos.Videojuego;
import usuarios.Administrador;
import usuarios.Cliente;

import static usuarios.Administrador.Rol.JEFE;

void main() {
//Aquí creamos 4 articulos, 2 pelicula y 2 videojuegos, cada uno con sus datos.

    Pelicula pl1 = new Pelicula("INCEPTION", 2016,20.5, "Christopher Nolan", 138);
    Pelicula pl2 = new Pelicula("El Lobo de Wall Street", 2013, 20, "Julian Chavez",125);


    Videojuego vj1 = new Videojuego("GTA V",2013, 18.4, "Rockstar","STEAM", 18);
    Videojuego vj2 = new Videojuego("Fortnite", 2017, 16, "Epic Games", "Steam", 12);

    AlbumMusica album1 = new AlbumMusica("tropicoqueta", 2020, 20, "Karol G", 12, false);
    AlbumMusica album2 = new AlbumMusica("No le temas a la oscuridad", 2023, 12, "Feid", 8, true);

    Libro lb1 = new Libro("IT", 1996, 18, Libro.Genero.TERROR);
    Libro lb2 = new Libro("Maze runner", 2015, 8, Libro.Genero.ACCION);

//Luego creamos los clientes, pero les doy valor null, para que luego el administrador los articulos
    Cliente cl1 = new Cliente("Julian","Julian123", 810, 2010,null, 1);
    Cliente cl2 = new Cliente("Melissa", "melissa2000", 999, 1979, null, 2 );


    Administrador ad1 = new Administrador("admin123", "admin123",123, 1999 , JEFE);


 //aquí decimos que ad1 (el admin que creamos) asignara al cliente 1(cl1) el Album2.
    ad1.asignarArticulo(cl1, album2);

    System.out.println("El album Asignado a "+cl1.getNombreUsuario()+ " es " +cl1.getArticulo());
}
