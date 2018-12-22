function findDigits(n) {
    return n.toString().split("")
        .filter(ch => { return (ch) !== "0" && n % parseInt(ch) === 0 })
        .length
}

console.log(findDigits(12));     //2
console.log(findDigits(1012));   //3