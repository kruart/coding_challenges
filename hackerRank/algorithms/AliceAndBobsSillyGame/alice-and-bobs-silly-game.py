# https://www.hackerrank.com/challenges/alice-and-bobs-silly-game/problem
def count_primes():
    r = 10**5+1     # 1 <= n <= 10**5
    sieve = [0] * r

    for i in range(2, r):
        if not sieve[i]:
            sieve[i] = 2
            for j in range(i*2, r, i):
                sieve[j] = 1
    return sieve


if __name__ == '__main__':
    primes = count_primes()
    n = int(input())
    for _ in range(n):
        n = int(input())
        print("Bob" if primes[:n+1].count(2) % 2 == 0 else "Alice")

