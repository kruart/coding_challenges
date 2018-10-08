# https://www.hackerrank.com/challenges/sparse-arrays/problem
def matchingStrings(strings, queries):
    d = {q: 0 for q in queries} # dict

    for s in strings:
        if s in queries:
            d[s] += 1
    return [d[q] for q in queries]


if __name__ == '__main__':
    arr1 = matchingStrings(["aba", "baba", "aba", "xzxb"], ["aba", "xzxb", "ab"])  # 2 1 0
    arr2 = matchingStrings(["def", "de", "fgh"], ["de", "lmn", "fgh"])  # 1 0 1
    arr3 = matchingStrings(["abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf"],
                           ["abcde", "sdaklfj", "asdjf", "na", "basdn", "abcde"])  # 1 3 4 3 2 1

    print(arr1)
    print(arr2)
    print(arr3)