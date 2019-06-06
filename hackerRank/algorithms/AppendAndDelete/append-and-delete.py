# https://www.hackerrank.com/challenges/append-and-delete/problem
def appendAndDelete(s, t, k):
    total_length = len(s) + len(t)
    if k >= total_length:
        return "Yes"

    same_length = 0
    for i in range(min(len(s), len(t))):
        if s[i] != t[i]:
            break
        same_length += 1

    diff = total_length - 2 * same_length
    if k >= diff and (k - diff) % 2 == 0:
        return "Yes"

    return "No"


if __name__ == '__main__':
    s, t, k = input(), input(), int(input())
    print(appendAndDelete(s, t, k))
