// https://www.hackerrank.com/challenges/strong-password/problem
function minimumNumber(n, password) {
   const count = [/[a-z]/, /[A-Z]/, /[0-9]/, /\W/]
       .filter(p => !p.test(password))
       .length;

    return Math.max(count, 6 - n);
}

