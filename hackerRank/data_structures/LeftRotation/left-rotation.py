if __name__ == '__main__':
    nd = input().split()
    n = int(nd[0])
    d = int(nd[1])

    a = input().rstrip().split()
    newList = a[d:] + a[:d]
    print(" ".join(newList))