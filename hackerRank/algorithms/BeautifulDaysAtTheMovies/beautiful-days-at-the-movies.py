def beautifulDays(i, j, k):
    # return len(list(filter(lambda n: (n - int(str(n)[::-1])) % k == 0, range(i, j+1))))
    return len([n for n in range(i, j+1) if (n - int(str(n)[::-1])) % k == 0])


if __name__ == '__main__':
    print(beautifulDays(20, 23, 6))  # 2
