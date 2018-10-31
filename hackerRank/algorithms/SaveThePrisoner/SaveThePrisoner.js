// https://www.hackerrank.com/challenges/save-the-prisoner/problem
function saveThePrisoner(n, m, s) {
    const k = (m - 1 + s) % n;
    return k === 0 ? n : k;
}

console.log(saveThePrisoner(4, 6, 2));  // 3
console.log(saveThePrisoner(5, 2, 1));  // 2
console.log(saveThePrisoner(5, 2, 2));  // 3
console.log(saveThePrisoner(7, 19, 2)); // 6
console.log(saveThePrisoner(3, 7, 3));  // 3
console.log(saveThePrisoner(5, 5, 1));  // 5
console.log(saveThePrisoner(352926151, 380324688, 94730870));    // 122129406
console.log(saveThePrisoner(94431605, 679262176, 5284458));      // 23525398
console.log(saveThePrisoner(785405778, 835771758, 689182705));   // 739548684
console.log(saveThePrisoner(999999999, 999999999, 1));           // 999999999
console.log(saveThePrisoner(877625009, 999275937, 874127074));   // 118152992