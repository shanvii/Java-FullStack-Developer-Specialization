
let str1 = 'Hello'
let str2 = 'World!'

let str3 = str1 + ' ' + str2

let str4 = str1.concat(' ', str2, ' ', 'How are you?')

console.log(str3)
console.log(str4)

let str = 'Hello, World!'

//slice method extracts a part of a string and returns the extracted part in a new string without changing the original string 
let result = str.slice(7,12) //World
console.log(str)
console.log(result)

//substring method is similar to slice method but it cannot accept negative indexes as arguments 
let result2 = str.substring(7,12) //World 
console.log(result2)