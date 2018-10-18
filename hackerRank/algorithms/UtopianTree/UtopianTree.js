// https://www.hackerrank.com/challenges/utopian-tree/problem
function utopianTree(n) {
    return [...Array(n).keys()].reduce((acc, value) => {
        return (value % 2 === 0 || value === 0) ? acc*2: acc+1;
    }, 1);
}

console.log(utopianTree(5)); //14
console.log(utopianTree(0)); //1
console.log(utopianTree(1)); //2
console.log(utopianTree(4)); //7