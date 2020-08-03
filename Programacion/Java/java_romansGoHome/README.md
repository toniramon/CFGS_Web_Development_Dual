# romansGoHome

## Kata Numerales Romanos

con nuestros simpáticos amigos los
~~~
Enum Types
~~~
y las alegres
~~~
Expresiones Regulares
~~~
en una nueva producción de
~~~
Maven.
~~~

## Enunciado
Los romanos trajeron muchas cosas...
https://www.youtube.com/watch?v=p-fRo5-p9hE 
https://www.youtube.com/watch?v=p-fRo5-p9hE
pero admitamos que los números no eran su fuerte. Para qué los necesitaban si podían crucificar al que sabía contar.

Se trata de escribir una programa que transforme números romanos en decimales:

~~~
I  uno 
II dos 
III tres 
IV  cuatro 
V cinco 
VI  seis 
VII  siete 
VIII  ocho 
IX   nueve 
XXXII   treinta y dos 
XLV   cuarenta y cinco
~~~

Has de utilizar expresiones regulares y tipos enumerados.

Las reglas están descritas en el artículo de la Wikipedia
https://es.wikipedia.org/wiki/Numeraci%C3%B3n_romana

~~~
Hay que tener en cuenta que la numeración romana, al no ser un sistema posicional, no requiere del cero.
Para la notación moderna de los números romanos se utilizan las siguientes normas:
Los números se leen de izquierda a derecha empezando por los símbolos con mayor valor, o conjunto de símbolos de mayor valor.
Un símbolo seguido de otro de igual o inferior valor, suma (p.e. X·X·I = 10+10+1 = 21), mientras que si está seguido de otro de mayor valor, ambos símbolos forman un conjunto en el cual debe restarse el valor del primero al valor del siguiente (p.e. X·IX = 10+[10-1] = 19).
La unidad (I) y los números con base 10 (X, C y M) pueden repetirse hasta 3 veces consecutivas como sumandos.
Los números con base 5 (V, L y D), no pueden repetirse seguidos, ya que la suma de esos dos símbolos tiene representación con alguno de los símbolos anteriores.
La unidad y los símbolos de base 10 también pueden aparecer restando antes de un símbolo de mayor valor, pero con las siguientes normas:
solo pueden aparecer restando sobre los símbolos con base 5 y 10 de valor inmediatamente superiores, pero no de otros con valores más altos(p.e. ‘IV’ y ‘IX’, pero no ‘IL’ ni ‘IC’).
en el caso de estar restando, no pueden repetirse.
Los símbolos con base 5 no pueden utilizarse para restar (p.e. 45 se escribe ‘XLV’ y no ‘VL’).
~~~

### Casos Test
Utilizad los que aparecen en el artículo de la Wikipedia, que explican cómo funcionan las normas.
El código propuesto no existe si no incluye casos test para testear las expresiones regulares y la conversión de los números.

### Directrices
Dado un número romano, p.e.
~~~
String numeroRomano = "MDCCCLXXXVIII";
~~~
de las reglas puede deducirse que estas son las únicas combinaciones que se presentarán:
M, C, X, I pueden aparecer de cero a tres veces (sumando).
D, L, V pueden aparecer de cero a una vez sumando, ya que no pueden restar.
Restando, sólo pueden aparecer las combinaciones:

~~~
IV e IX
XL y XC
CD y CM
D, L, V no pueden aparecer restando.
~~~

Esto puede traducirse a expresiones regulares y a tipos enumerados:
Puedes crear expresiones regulares para estudiar el string con el número romano.
y luego utilizar los tipos enumerados para obtener el valor de los símbolos romanos (y las combinaciones permitidas, por ejemplo, aunque esto no es necesario).

## Expresiones regulares

Resuelve primero el ejercicio Listing 14-2.  Using Pattern and Matcher Classes pag. 527 del libro Beginning Java 8 Fundamentals. Es necesario leerse el capítulo del libro para entender cómo se usan las expresiones regulares en Java.

Será necesario utilizar herramientas online para testear expresiones regulares:
http://www.freeformatter.com/java-regex-tester.html

Es recomendable profundizar un poco en el conocimiento de las expresiones regulares. Por ejemplo, Lookahead y Lookbehind resultan muy útiles:
http://www.regular-expressions.info/lookaround.html

ATENCIÓN SPOILER !!!
Estas son las mías:
~~~
"grupoSumatorio" = "[MCXI]{3}|(?<!C)[DM]|(?<!X)[LC](?!D)|(?<!I)[VX](?![LC])|I(?![VX])" "grupoSustractivo" = "(C[DM])|(X[LC])|(I[VX])"
~~~

Proyecto
En tu GitHub desde ahora mismo, y no olvides imputar en el paneloide.
