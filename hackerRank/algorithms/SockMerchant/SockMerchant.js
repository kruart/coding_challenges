// https://www.hackerrank.com/challenges/sock-merchant/problem
function sockMerchant(n, ar) {
    const socks = new Set();
    let pairs = 0;

    ar.forEach((elem) => {
        if (socks.has(elem)) {
            pairs++;
            socks.delete(elem)
        } else {
            socks.add(elem)
        }
    });
    return pairs;
}