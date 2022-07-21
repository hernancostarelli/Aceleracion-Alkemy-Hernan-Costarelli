# Proyecto ONG - Somos Más

Situación inicial 📍
Somos un equipo de desarrollo y nuestro líder técnico nos comparte el pedido de un
cliente nuevo que está buscando nuestra ayuda. El pedido lo hizo Marita, la
Directora de la ONG Somos Más, que está buscando desarrollar un sitio web para
su organización.
Marita y su equipo buscan que el sitio web funcione como carta de presentación,
medio de contacto, y que les permita participar del concurso “Juntos por el Cambio
Social”. Dicho concurso es organizado por una reconocida institución universitaria
de Córdoba, Argentina, y el premio les permitiría ayudar a 150 familias extra por, al
menos, los próximos 12 meses. Sin embargo, es requisito obligatorio para participar
del concurso, incluir el link a un sitio web para dar visibilidad a su trabajo.

# OT210-JAVA: ONG PROJECT

## Build and Run

Step 1: Build the project.

```sh
mvn clean install -DskipTests
```

Step 2: (Optional) run mysql on Docker.

```sh
docker container run -d --name mysql -e MYSQL_ALLOW_EMPTY_PASSWORD=True -p 3306:3306 mysql
```

Step 3: run the application.

```sh
 mvn spring-boot:run 
```
# User data created

## **For Regular User**

| User                | Password  | Role |
|---------------------|-----------|------|
| user1@somosmas.org  | usuario1  | USER |
| user2@somosmas.org  | usuario2  | USER |
| user3@somosmas.org  | usuario3  | USER |
| user4@somosmas.org  | usuario4  | USER |
| user5@somosmas.org  | usuario5  | USER |
| user6@somosmas.org  | usuario6  | USER |
| user7@somosmas.org  | usuario7  | USER |
| user8@somosmas.org  | usuario8  | USER |
| user9@somosmas.org  | usuario9  | USER |
| user10@somosmas.org | usuario10 | USER |

## **For Administrator**

| User                 | Password        | Role  |
|----------------------|-----------------|-------|
| admin1@somosmas.org  | administrador1  | ADMIN |
| admin2@somosmas.org  | administrador2  | ADMIN |
| admin3@somosmas.org  | administrador3  | ADMIN |
| admin4@somosmas.org  | administrador4  | ADMIN |
| admin5@somosmas.org  | administrador5  | ADMIN |
| admin6@somosmas.org  | administrador6  | ADMIN |
| admin7@somosmas.org  | administrador7  | ADMIN |
| admin8@somosmas.org  | administrador8  | ADMIN |
| admin9@somosmas.org  | administrador9  | ADMIN |
| admin10@somosmas.org | administrador10 | ADMIN |







