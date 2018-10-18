// https://www.hackerrank.com/challenges/the-hurdle-race/problem
function hurdleRace(k, height) {
    const max = Math.max(...height);
    return k - max >= 0 ? 0 : max - k;
}