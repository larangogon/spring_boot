# The movie db integration-testing

### Descripcion:

1. Utilizando JAVA y spring boot se realiza el consumo de los servicios del api "The Movie database"
["The Movie database"](https://www.themoviedb.org/documentation/api)

 2. Desde nuestra api se expone la siguiente informacion.

 - HTTP GET [api/movies](http://localhost:8080/api/movies) : aqui encontrara la lista de peliculas.

- HTTP GET [api/movies/id-de-la-pelicula](http://localhost:8080/api/movies/1) : detalle de la pelicula.

    Detalle de la pelicula. (Nombre de la pelicula, genero, lenguaje o idioma, calificacion, imagen de presentacion y sinopsis de la pelicula).

 - HTTP POST [api/movies/review]( http://localhost:8080/api/movies/review): Usted podra dejar un comentario sobre la pelicula.

  - HTTP POST [api/add_movie]( http://localhost:8080/api/add_movie): El usuario con rol de administrador podra agregar una pelicula.

 3. Los usuarios pueden loguearse en nuestra api, y el admin puede realizar gestion sobre la informacion.

 4. Se estandarizan respuestas http y formato de logs.

 5. Se pagina la informacion listada.

 7. El proyecto se despliega en AWS.

 8. La autenticacion se realiza con jwt
