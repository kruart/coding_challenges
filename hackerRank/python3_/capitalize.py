# https://www.hackerrank.com/challenges/capitalize/problem
def solve(s):
    return " ".join(map(lambda x: x.capitalize(), s.split(" ")))
    # return " ".join([i.capitalize() for i in s.split(" ")])


if __name__ == '__main__':
    print(solve("alison heck"))  # Alison Heck
    print(solve("12abc"))  # 12abc
