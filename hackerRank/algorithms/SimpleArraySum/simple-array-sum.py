def simpleArraySum(ar):
    return sum(ar)


if __name__ == '__main__':
    _, nums = input(), map(int, input().split())
    print(simpleArraySum(nums))