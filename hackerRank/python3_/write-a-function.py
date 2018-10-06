# https://www.hackerrank.com/challenges/write-a-function/problem
def is_leap(year):
        return year % 400 == 0 or (year % 4 == 0 and year % 100 != 0)


if __name__ == '__main__':
    print(is_leap(2000))    # True
    print(is_leap(2400))    # True
    print(is_leap(1800))    # False
    print(is_leap(1900))    # False
    print(is_leap(2100))    # False
    print(is_leap(2200))    # False
    print(is_leap(2300))    # False
    print(is_leap(2500))    # False
