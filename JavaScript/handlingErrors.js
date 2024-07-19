function divide(numerator, denominator) {
    if(denominator === 0) {
        throw new Error('Error: Division by zero')
    }

    return numerator/denominator;
}

try{
    const result = divide(10,0)
    console.log(result)
}
catch(error) {
    console.log(error.message)
}