//fruits
let fruits = ['apple', 'banana', 'mango', 'orange', 'strawberry'];  

console.log(fruits[0]); //apple

fruits.push('grapes'); //add grapes to the end of the array
console.log(fruits); //['apple', 'banana', 'mango', 'orange', 'strawberry', 'grapes']

fruits.pop(); //remove grapes from the end of the array
console.log(fruits); //['apple', 'banana', 'mango', 'orange', 'strawberry']

fruits.shift(); //remove apple from the beginning of the array
console.log(fruits); //['banana', 'mango', 'orange', 'strawberry']

fruits.unshift('kiwi'); //add kiwi to the beginning of the array
console.log(fruits); //['kiwi', 'banana', 'mango', 'orange', 'strawberry']

fruits.splice(2, 0, 'grapes'); //add grapes at index 2
console.log(fruits); //['kiwi', 'banana', 'grapes', 'mango', 'orange', 'strawberry']

fruits.splice(2, 1); //remove 1 element from index 2
console.log(fruits); //['kiwi', 'banana', 'mango', 'orange', 'strawberry']

let fruits1 = ['apple', 'banana', 'mango', 'orange', 'strawberry'];
let fruits2 = ['kiwi', 'grapes'];

let allFruits = fruits1.concat(fruits2); //concatenate two arrays
console.log(allFruits); //['apple', 'banana', 'mango', 'orange', 'strawberry', 'kiwi', 'grapes']

let slicedFruits = allFruits.slice(2, 5); //slice elements from index 2 to 4
console.log(slicedFruits); //['mango', 'orange', 'strawberry']

let indexOfMango = allFruits.indexOf('mango'); //find the index of mango
console.log(indexOfMango); //2

let indexOfPineapple = allFruits.indexOf('pineapple'); //find the index of pineapple
console.log(indexOfPineapple); //-1

let isMangoIncluded = allFruits.includes('mango'); //check if mango is included
console.log(isMangoIncluded); //true

let isPineappleIncluded = allFruits.includes('pineapple'); //check if pineapple is included
console.log(isPineappleIncluded); //false

let fruitsCopy = allFruits.slice(); //copy allFruits array
console.log(fruitsCopy); //['apple', 'banana', 'mango', 'orange', 'strawberry', 'kiwi', 'grapes']

let fruitsCopy1 = [...allFruits]; //copy allFruits array
console.log(fruitsCopy1); //['apple', 'banana', 'mango', 'orange', 'strawberry', 'kiwi', 'grapes']

let fruitsCopy2 = Array.from(allFruits); //copy allFruits array
console.log(fruitsCopy2); //['apple', 'banana', 'mango', 'orange', 'strawberry', 'kiwi', 'grapes']

