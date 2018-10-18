// https://www.hackerrank.com/challenges/simple-array-sum/problem
function simpleArraySum(ar) {
    // way 1
    // let total = 0;
    // ar.forEach(item => total += item);
    // return total;

    // way 2
    return ar.reduce((total, curr) => total + curr);
}

console.log(simpleArraySum([1, 2, 3]));             //6
console.log(simpleArraySum([1, 2, 3, 4, 10, 11]));  //31
console.log(simpleArraySum([5, 2, 1, 4, 73, 25]));  //110
