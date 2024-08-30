const { sortAndDeduplicateDiagnostics } = require("typescript");

// function add(a,b){
//     return a+b;
// }

// let add = function(a,b){
//     return a+b;
// }

let add = (a,b) => a+b;

let sum = add(10,20);

console.log(sum);
