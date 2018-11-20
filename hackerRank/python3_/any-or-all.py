# https://www.hackerrank.com/challenges/any-or-all/problem
if __name__ == '__main__':
    _, nums = input(), input().split()
    res = all(int(i) > 0 for i in nums) and any(i == i[::-1] for i in nums)
    print(res)
