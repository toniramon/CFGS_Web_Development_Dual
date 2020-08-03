// Exercises: Level 1

// create an empty set
// Create a set containing 0 to 10 using loop
// Remove an element from a set
// Clear a set
// Create a set of 5 string elements from array
// Create a map of countries and number of characters of a country

// Creamos un array de 10 posiciones,
let array = Array.from(new Array(10), () => (1));

// Creamos un Set vacío
let emptySet = new Set();

// Mapeamos cada valor al Set
array.map((currentElement, index) => {
    emptySet.add(index)
});
console.log(`Set`);
console.log(emptySet);

// Limpiamos el set
emptySet.clear();
console.log(`Empty set`);
console.log(emptySet);


let tonto = new Set();
tonto.forEach(element)
