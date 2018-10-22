// https://www.hackerrank.com/challenges/angry-professor/problem
function angryProfessor(k, a) {
    return k > a.filter(i => i <= 0).length ? "YES" : "NO";
}

console.log(angryProfessor(3, [-1, -3, 4, 2])); //YES
console.log(angryProfessor(2, [0, -1, 2, 1]));  //NO