# https://www.hackerrank.com/challenges/exceptions/problem
if __name__ == '__main__':
    n = int(input())

    for _ in range(0, n):
        try:
            args = list(map(int, input().split()))
            print(args[0] // args[1])
        except ZeroDivisionError as e:
            print("Error Code:", e)
        except ValueError as e:
            print("Error Code:", e)
