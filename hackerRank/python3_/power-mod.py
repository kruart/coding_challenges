
# https://www.hackerrank.com/challenges/python-power-mod-power/problem
if __name__ == '__main__':
    a, b, m = [int(input()) for _ in range(3)]
    print(a**b)  # or pow(a, b)
    print(pow(a, b, m))
