# https://www.hackerrank.com/challenges/symmetric-difference/problem
def symmetric_difference(seq1, seq2):
    return seq1.difference(seq2) | seq2.difference(seq1)


if __name__ == '__main__':
    _ = input()
    set1 = set(map(int, input().split()))
    _ = input()
    set2 = set(map(int, input().split()))

    print(*sorted(symmetric_difference(set1, set2)), sep="\n")