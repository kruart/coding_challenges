# https://www.hackerrank.com/challenges/text-wrap/problem
def wrap(string, max_width):
    text = ""
    for i in range(0, len(string), max_width):
        text += string[i:i + max_width] + '\n'
    return text


if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)