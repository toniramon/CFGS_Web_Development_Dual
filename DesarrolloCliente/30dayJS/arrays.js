
// Resolverlos en la consola web de Firefox
// con el mundo perdido.

clear() // para limpiar consola ;)

// ARRAY.FROM()
// Array from para transformar en array un nodeList del DOM

let lis = document.querySelectorAll('div.inner.sidebar-inner li.sidebar-inner-image');

Array.from(lis).forEach(li => console.log(li.innerText));

/**
 * Profesor Challenger
 * Ed Malone 
 * Gómez 
 * Zambo
 * Lord John Roxton
 */


// Array from alternativa a MAP() en un array

let lis = document.querySelectorAll('div.inner.sidebar-inner li.sidebar-inner-image');

Array.from(lis, li => li.innerText.toUpperCase());

// Array(5) [ "PROFESOR CHALLENGER", "ED MALONE", "GÓMEZ", "ZAMBO", "LORD JOHN ROXTON" ]



// Sparse arrays

Array.from([0,,2]);
// Array(3) [ 0, undefined, 2 ]



// Generar arrays

Array.from(new Array(5), () => 'a');
// Array(5) [ "a", "a", "a", "a", "a" ]

Array.from(new Array(5), (element,index) => index);
// Array(5) [ 0, 1, 2, 3, 4 ]



// ARRAY.OF() para crear arrays a partir de elementos

// SPREAD OPERATOR ...

liText = Array.of(... lis).map(li => li.innerText);
// Array(5) [ "Profesor Challenger", "Ed Malone", "Gómez", "Zambo", "Lord John Roxton" ]

// ojo a la diferencia entre from y of:
Array.from(['a', 'b']);
// Array [ "a", "b" ]
// (2) […]
​//     0: "a"
​//     1: "b"
​//     length: 2

Array.of(['a', 'b']);
// (1) […]
​//   0: Array [ "a", "b" ]
​//   length: 1



// los metodos Array.protoype NO son estáticos 
// Array.prototype.entries(['a', 'b']) => NO funciona!

// entries(), etc, devuelven ITERATORS => convertir a Array

Array.from(lis.keys());
// Array(5) [ 0, 1, 2, 3, 4 ]

Array.from(lis.values()).map(li => li.innerText);
// Array(5) [ "Profesor Challenger", "Ed Malone", "Gómez", "Zambo", "Lord John Roxton" ]

Array.from(['a', 'b'].entries());
// (2) […]
​//     0: Array [ 0, "a" ]
​//     1: Array [ 1, "b" ]

// Spread operator to convert ITERATORS to arrays
// entries() devuelve un iterator
[...['a', 'b'].entries()];


// Iterar

// Diferencias for in - of

// The for...in statement iterates over the 
// enumerable properties of an object, in an arbitrary order:
// heredadas también + ownproperties

// The for...of statement iterates over 
// values that the iterable object defines to be iterated over:
// sólo las ownproperties
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for...of

/**
 * Enumerable properties are those properties 
 * whose internal enumerable flag is set to true, 
 * which is the default for properties created 
 * via simple assignment or via a property initializer
 * Enumerable properties show up in for...in loops 
 * unless the property's key is a Symbol. 
 * Ownership of properties is determined by 
 * whether the property belongs to the object directly 
 * and not to its prototype chain.
 */

 // Ver ejemplo de código en:
 // https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for...of

// Ver detection table en:
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Enumerability_and_ownership_of_properties 


for (const [index, li] of Array.from(lis).entries()) { // entries() devuelve iterator
    console.log(index + " " + li.innerText)};
// 0 Profesor Challenger
// 1 Ed Malone 
// 2 Gómez
// 3 Zambo
// 4 Lord John Roxton


// SEARCH

Array.from(lis).find(li => li.innerText == "Zambo").innerText;
// > "Zambo"
Array.from(lis).find(li => li.innerText == "");
// undefined

Array.from(lis).findIndex(li => li.innerText == "Zambo");
// 3
Array.from(lis).findIndex(li => li.innerText == "Lolo");
// -1


// FILL
// ojo que lo modifica IN PLACE

new Array(5).fill(5);
// Array(5) [ 5, 5, 5, 5, 5 ]

new Array(5).fill(5, start=0, end=4);
// Array(5) [ 5, 5, 5, 5, undefined ]

new Array(5).fill(5, 0, 4); // la pos 4 no entra
// Array(5) [ 5, 5, 5, 5, undefined ]

let arr = new Array(5); 
arr.fill('0', 0, this.length); // this!!
Array(5) [ "0", "0", "0", "0", 5 ]



// MAP

// new Map desde un iterable [key, value]

let mapica = new Map(Array.from(lis, li => li.innerText).entries());
// Map(5) { 0 → "Profesor Challenger", 1 → "Ed Malone", 2 → "Gómez", 3 → "Zambo", 4 → "Lord John Roxton" }

mapica.get(0)
// "Profesor Challenger"

mapica.has(3);
// true
mapica.has("Zambo");
// false

mapica.delete(4);
// true

mapica.size;
mapica.clear;



// NO EXISTE MAP ni ForEach en los mapas

new Map([...mapica].map(([k,v]) => [k, v+'_']));
// Map(4) { 0 → "Profesor Challenger_", 1 → "Ed Malone_", 2 → "Gómez_", 3 → "Zambo_" }



// SET

new Set(Array.from(lis, li => li.innerText));
// new Set(Array.from(lis, li => li.innerText));

new Set([1, 2, 3, 3, 3, 4]);
// Set(4) [ 1, 2, 3, 4 ]


// convertir set a array y vuelta para filtrar, map

// FILTER no existe
let setica = new Set([1, 2, 3, 3, 3, 4]);
setica = new Set([...setica].filter(el => el>2));
// Set [ 3, 4 ]
setica = new Set([...setica].map(el => el*2));
// Set [ 6, 8 ]