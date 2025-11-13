**Actividad 2**

Un cliente quiere desarrollar una aplicación para la gestión de una biblioteca, en la que, además de libros, también se alquilan videojuegos, películas y música.

Ejercicios:

1.  Hacer un paquete **articulos** con las siguientes clases:

    1.  **Articulo**, con los siguientes elementos:

        1.  Atributos:

            1.  **titulo** (cadena de texto)

            2.  **anyoLanzamiento** (número entero)

            3.  **precioPorDia** (número decimal)

        2.  Constructores:

            1.  **Completo**

            2.  **Vacío**

        3.  Métodos:

            1.  Todos los **getters** y **setters**

            2.  **calcularPrecio(numArticulos, dias)** que devuelva el precio total para un número de artículos y un número de días

            3.  **toString()** que devuelva “**\[Artículo\] ( €/día)**”

    2.  **Libro**, que hereda de **Articulo**, con los siguientes elementos:

        1.  Atributos:

            1.  **autor** (cadena de texto)

            2.  **numPaginas** (número entero)

            3.  **genero** (enumerado que puede ser **Misterio**, **Terror**, **Acción**, **Historia** o **Fantasía**)

        2.  Constructores:

            1.  **Completo**

            2.  **Vacío**

            3.  Con **titulo**, **anyoLanzamiento**, **autor**, **precioPorDia** y **genero**, que ponga **numPaginas** a **100**.

        3.  Métodos:

            1.  Todos los **getters** y **setters**

            2.  **esLargo()** que devuelva **true** si tiene **más de 200 páginas**

            3.  **toString()** que devuelva “**\[Libro\] , de ( €/día)**”

    3.  **Pelicula**, que hereda de **Articulo**, con los siguientes elementos:

        1.  Atributos:

            1.  **director** (cadena de texto)

            2.  **duracion** (número entero, en minutos)

        2.  Constructores:

            1.  **Completo**

            2.  **Vacío**

        3.  Métodos:

            1.  Todos los **getters** y **setters**

            2.  **getDuracionHorasYMinutos()** que muestre por consola la duración de la película en formato “**X horas y Y minutos**”

            3.  **getDuracionSegundos()** que devuelva la duración en segundos

            4.  **toString()** que devuelva “**\[Película\] , de ( €/día)**”

    4.  **AlbumMusica**, que hereda de **Articulo**, con los siguientes elementos:

        1.  Atributos:

            1.  **autor** (cadena de texto)

            2.  **numCanciones** (número entero)

            3.  **single** (booleano)

        2.  Constructores:

            1.  **Completo**

            2.  **Vacío**

        3.  Métodos:

            1.  Todos los **getters** y **setters**

            2.  **getDuracionTotal(duracion)** que, dada una duración media en minutos, devuelva la duración total del álbum

            3.  **toString()** que devuelva “**\[Álbum\] , de ( €/día)**”

    5.  **Videojuego**, que hereda de **Articulo**, con los siguientes elementos:

        1.  Atributos:

            1.  **director** (cadena de texto)

            2.  **plataformas** (cadena de texto)

            3.  **pegi** (número entero)

        2.  Constructores:

            1.  **Completo**

            2.  **Vacío**

        3.  Métodos:

            1.  Todos los **getters** y **setters**

            2.  **paraAdultos()** que devuelva **true** si el **PEGI es mayor o igual que 18**

            3.  **esApto(edad)** que devuelva **true** si la **edad es mayor o igual que el PEGI**

            4.  **toString()** que devuelva “**\[Película\] , de ( €/día)**”


1.  Hacer un paquete **usuarios** con las siguientes clases:

    1.  **Usuario**, con los siguientes elementos:

        1.  Atributos:

            1.  **nombreUsuario** (cadena de texto)

            2.  **contrasenya** (cadena de texto)

            3.  **id** (número entero)

            4.  **anyoNacimiento** (número entero)

        2.  Constructores:

            1.  **Completo**

            2.  **Vacío**

        3.  Métodos:

            1.  Todos los **getters** y **setters**

            2.  **esAdulto()** que devuelva **true** si **tiene 18 años o más** (tomando 2025 como año actual)

            3.  **contrasenyaSegura()** que devuelva **true** si la **contraseña tiene más de 10 caracteres**

            4.  **toString()** que devuelva “ **()**”

    2.  **Cliente**, que hereda de **Usuario**, con los siguientes elementos:

        1.  Atributos:

            1.  **articulo** (de tipo Articulo)

            2.  **numSocio** (número entero)

        2.  Constructores:

            1.  **Completo**

            2.  **Vacío**

        3.  Métodos:

            1.  Todos los **getters** y **setters**

            2.  **calcularPrecio(numArticulos, dias)** que devuelva el precio total para un número de artículos y un número de días, teniendo en cuenta el artículo del cliente

            3.  **toString()** que devuelva “**Cliente ()**”

    3.  **Administrador**, que hereda de **Usuario**, con los siguientes elementos:

        1.  Atributos:

            1.  **rol** (enumerado que puede ser **Jefe** o **Vendedor**)

        2.  Constructores:

            1.  **Completo**

            2.  **Vacío**

        3.  Métodos:

            1.  Todos los **getters** y **setters**

            2.  **asignarArticulo(usuario, articulo)** que asigne un artículo a un usuario

            3.  **retirarArticulo(usuario)** que elimine el artículo del usuario

            4.  **toString()** que devuelva “**Cliente ()**”


1.  En la clase **Main**:

    1.  Crear **2 artículos de cada tipo**

    2.  Crear **2 clientes**

    3.  Crear **1 administrador** y **asignar un artículo a un cliente**


1.  Crear el **diagrama UML** de todas las clases
