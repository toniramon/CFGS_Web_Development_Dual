// Nombre d'enllaços a la pagina web.
console.log("Numero de links en la web: " + document.links.length);

// Nombre de paràgrafs a la pàgina web.
console.log("Numero de párrafos en la web: " + document.getElementsByTagName("p").length);

// Adreça a la qual enllaça el penúltim enllaç
var countLinkList = document.getElementsByTagName("a").length;
var penultimateLink = document.getElementsByTagName("a")[countLinkList - 2];
console.log("Penúltimo enlace: " + penultimateLink);

// Adreça a la qual enllaça el darrer enllaç
var lastLinkAttribute = document.getElementsByTagName("a")[countLinkList - 1].getAttribute("href");
console.log(lastLinkAttribute);

// Número d'enllaços que enllacen a http://www.jurassicpark.com

// Nombre d'enllaços de tots els paràgrafs

// utilizar filterelement
// querySelectorAll
// ...document.querySelectAll('a').filterelement => element.getAttribute('href') === 'https://jurassicpark.com'; <-- tres puntos = crear una lista con lo que le pasamos.