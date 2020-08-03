// Use functions like forEach, map, filter, every, some.

var data = [1,1,3,5,5]; // This is our array of numbers
// The mean is the sum of the elements divided by the number of elements var total = 0;

var sum = 0;
data.forEach(function(value) { sum += value; }); 
var mean = sum / data.length;

// To compute the standard deviation, we first sum the squares of // the deviation of each element from the mean.
var total = 0;
var subtotal = data.map(function(x) { return (x - mean) ** 2; }); // b is [1, 4, 9]
total = subtotal.reduce(function(x,y) { return x+y }, 0); // Sum of values

var stddev = Math.sqrt(total/(data.length)); // The standard deviation is 2
console.log(stddev);




