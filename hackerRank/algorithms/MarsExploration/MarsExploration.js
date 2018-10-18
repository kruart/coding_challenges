// https://www.hackerrank.com/challenges/mars-exploration/problem
function marsExploration(s) {
    let pattern = "SOS";
    return [...Array(s.length).keys()]
        .filter((i) => s[i] != pattern[i % 3])
        .length;
}

console.log(marsExploration("SOSSPSSQSSOR"));    //3
console.log(marsExploration("SOSSOT"));          //1
console.log(marsExploration("SOSSOSSOS"));