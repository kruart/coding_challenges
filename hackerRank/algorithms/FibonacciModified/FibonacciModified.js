// https://www.hackerrank.com/challenges/fibonacci-modified/problem
function fibonacciModified(t1, t2, n) {
    const ts = [BigInt(t1), BigInt(t2)];

    for (let i = 2; i < n; i++) {
        ts[i] = ts[i-2] + ts[i-1]**2n;
    }
    return ts[n-1].toString().substr(0, ts[n-1].toString().length)
}

console.log(fibonacciModified(0, 1, 5)); // 5
console.log(fibonacciModified(0, 1, 5)); // 5
console.log(fibonacciModified(0, 1, 10)); // 27
