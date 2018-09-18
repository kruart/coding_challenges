# //https://www.hackerrank.com/challenges/compare-the-triplets/problem
def compareTriplets(a: list, b: list):
    alice_score = 0
    bob_score = 0

    for i in range(len(a)):
        if a[i] > b[i]:
            alice_score += 1
        elif a[i] < b[i]:
            bob_score += 1
    return [alice_score, bob_score]


def main():
    alice_rates = [17, 28, 30]
    bob_rates = [99, 16, 8]
    print(compareTriplets(alice_rates, bob_rates))

    alice_rates2 = [5, 6, 7]
    bob_rates2 = [3, 6, 10]
    print(compareTriplets(alice_rates2, bob_rates2))


if __name__ == '__main__':
    main()
