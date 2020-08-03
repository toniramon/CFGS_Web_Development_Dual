# Raza Pulpo Loba JS
¿Por qué Mariano se convierte en Pulpo?

## Indice:

1. [Transversales](#transversales)
2. [Tecnologías utilizadas.](#tecnologias)
3. [Asignatura Desplegament](#desplegament)
4. [Assignatura Desenvolupament Servidor](#servidor)
5. [Assignatura Disseny Interficies](#interficies)
6. [Assignatura Desenvolupament Client](#client)
7. [Problemas](#problemas)
8. [Mejoras](#mejoras)


## <a name="transversales"></a>Transversales

* Requisitos funcionales:

De vez en cuando, usualmente entre las 8 y las 10 de la noche, Mariano se transforma en un escurridizo pulpo de
gran tamaño con una larga barba blanca, lo que en Galicia llamamos un pulpo de raza loba.

Por un lado, Mariano se siente afortunado por no sufrir la típica licantropía de los gallegos. En vez de preocuparse
por comerse accidentalmente a los paisanos de la aldea, está muy afligido pensando que terminará en la pota los
martes en los que hay feria del pulpo en el pueblo. Tras varias ocasiones en las que se ha despertado aturdido y
desnudo entre las rocas de la playa, ha decidido cerrar las puertas de su casa con llave y llenar la bañera con
mejillones de la Ría para estar entretenido cuando se transforma.

Pero Mariano lo está pasando mal y quiere solucionar su problema. Sospecha que hay algo que dispara la
transformación, ya que no sucede todos los días. Como es un poco nerd, decide enfrentarse al problema de manera
científica, registrando en un diario lo que hace cada día y anotando si se transformó o no con unos de sus seis brazos
y 2 patas.

Vamos a ayudarle a construir un programa mediante el cual pueda recoger la información que necesita en una
estructura de datos, y luego aplicar un algoritmo para averiguar cuál o cuáles de las cosas que hace (caminar, ver la
vuelta ciclista, beber vino, etc.) produce que se transforme en pulpo.

--- 

Historias de usuario:
* Como: Mariano
* Quiero: saber qué alimentos me convierten en Pulpo
* Para: no convertirse en pulpo, ya que es doloroso.    

---

### Horas contabilizadas en el proyecto:
![Horas](https://toniramon.dev/horas.png)
![Horas](https://toniramon.dev/tareas.png)

### Análisis y justificación del tiempo invertido.

Se han invertido la mayoría de horas en el código javascript (Refactorización y aplicación de métodos asíncronos) debido a la falta de experiéncia en ese sector, y en el desarrollo de la interfaz, ya que cambiamos de diseño al principio. La parte de despliegue y servidor han llevado poco tiempo de desarrollo ya que una vez establecidas las directrices no se ha necesitado actualizar ni mejorar. 


## <a name="tecnologias"></a>Tecnologías utilizadas.

* Front-end: Javascript, HTML, SASS, CSS
* Back-end: PHP
* Base de datos: PostgreSQL
* Servidores: AWS - Ubuntu

* Control de versiones: Se ha utilizado Github con varias ramas: master, develop, y ramas derivadas de develop que se han ido 
mergeando dentro de develop. Finalmente la rama que se despliega es Master, donde se mergean los cambios de develo una vez
validados por todos los miembros del equipo.
* Integración contínua: se han utilizado los pipeline de github para lanzar los casos test cada push al servidor y verificar su 
correcto funcionamiento.


## <a name="desplegament"></a>Asignatura Desplegament

Se han creado dos servidores en Amazon Web Services:

Se han creado dos instancias de 1vCore y 1GB de RAM con apache cada una para lanzar la aplicación.
Servidor con Backend: Se ha utilizado apache y modificado la directiva DocumentRoot: /var/www/html/public
Servidor FrontEnd: Se ha utilizado apache y modificado la directiva DocumentRoot: /var/www/html/raza-pulpo-loba-js

Se ha creado un servidor de bases de datos basado en AWS en la útima versión de PostgreSQL.


## <a name="servidor"></a>Assignatura Desenvolupament Servidor

Se ha creado una aplicación con Laravel, utilizando esta aplicación como ApiREST donde nuestro front consumirá el recurso.
Esta API apunta a un controlador, el cual es el encargado de llamar un Modelo (que obtendrá todos los días del diario de Mariano)
y nos devolverá este resultado codificado en json para que el Front creado en JavaScript pueda leerlo sin problema.

Para alimentar la base de datos se ha utilizado un seeder que lee el JSON que contiene el diario. También se han creado 
rutas para que se pueda añadir más información al diario via ApiREST.

Requisitos:
PHP 7.3.x
Composer

Instalación:
git clone https://github.com/toniramon/api-pulpo.git
composer install
php artisan key:generate
    
Y ya funciona!


## <a name="interficies"></a>Assignatura Disseny Interficies

La estructura ha sido implementada con Grid layout, la cual se compone de 12 columnas, componiéndose la página de esta manera de un header, menu de navegación, sección y footer.

Para realizar la tabla de datos se ha utilizado la estructura de flexbox. 
Para el estilo de colores se ha utilizado una paleta de 6 colores más suplementarios, por lo general colores claros. 
El diseño se ha realizado con Sass, con un archivo base el cual compone las variables de breakpoints y colores. 
Cada componente de la página se  encuentra dividido en módulos, los cuales acaban compilándose en un mismo archivo ( main.css ) y este siendo importado en el html.

Las fuentes utilizadas són: 
* Josefin Sans
* Nunito

Paleta de colores: ![Paleta de Colores](https://toniramon.dev/paleta.png)


## <a name="client"></a>Assignatura Desenvolupament Client

La aplicación se ha dividido en módulos para que la aplicación sea modular, fácil de testear y de mantener. Gracias a esto
tenemos un archivo main.js que es quien va importando según necesidad los módulos.

Se ha utilizado webpack para transpilar el código de ES6 a ES5 y un plugin (TerserPlugin) para minificar el código,
para ocupar el espacio mínimo ya que la carga rápida de una web mejora la experiencia de usuario.
Para vincular el html con el JS se manipula el DOM mediante el uso de eventListeners. Con esto hacemos que al clickar un botón
nos genere una tabla dinámicamente.

Realizamos una petición al servidor mediante fetch con una función asíncrona, esto nos permite obtener los datos necesarios para generar la tabla donde nos indicará los alimentos que tienen mayor impacto en la transformación de Mariano.
Para testear los diferentes módulos utilizamos la librería de test JEST. Con jest testeamos que la correlación de los eventos son los correctos, el porcentaje de diferentes alimentos en la transformación de Mariano y la función phi.


## <a name="problemas"></a>Problemas en general

Donde nos hemos encontrado con más problemas ha sido a la hora de estructurar el proyecto, ya que empezamos creando una clase y cuando teníamos los casos test funcionando, tubimos que dividir en módulos y refactorizar gran parte de la aplicación.

Al dividir en módulos teníamos problemas cuando importábamos módulos, era incompatible con el navegador, utilizamos webpack y configurarlo fué complicado. 

La función fetch devolvía la respuesta de manera asíncrona y la recuperabamos a destiempo, esto nos llevo un par de horas arreglarlo.

Al utilizar la base de datos postgreSql tenemos problemas con los acentos, este motor nos convierte los digitos utf8 en unicode y complica el proceso de obtención de datos.

No mostramos correctamente la tabla de correlación, aparecen algunos Nan, debido que cuando recuepramos los datos del servidor, los nombres de evento tienen carácteres unicode y el código no calcula bien las correlaciones.


## <a name="mejoras"></a>Posibles mejoras

Hay muchas posibles mejoras, destacaremos las más importantes:
* La aplcación no es del todo responsive.
* La aplicación no responde a todos los requisitos de Experiencia de Usuario.
* No mostramos la tabla de correlación como debería, ya que los Nan nos impiden mostrar el valor.
* El diseño podría mejorar mucho.


## Personas de contacto
Toni | Marcos

With ❤️ from Marcos Monjon & Toni Ramon

