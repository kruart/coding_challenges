function funnyString(s) {
    return Array.from(Array(s.length).keys()).slice(1, s.length)
        .every(i => {
            const diff1 = Math.abs(s.charCodeAt(i) - Math.abs(s.charCodeAt(i-1)));
            const diff2 = Math.abs(s.charCodeAt(s.length - i) - Math.abs(s.charCodeAt(s.length-i-1)));
            return diff1 === diff2
        }) ? "Funny" : "Not Funny"
}

console.log(funnyString("acxz"));       //Funny
console.log(funnyString("bcxz"));       //Not Funny
console.log(funnyString("ivvkxq"));     //Not Funny
console.log(funnyString("ivvkx"));      //Not Funny