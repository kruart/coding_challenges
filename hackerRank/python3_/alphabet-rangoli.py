# https://www.hackerrank.com/challenges/alphabet-rangoli/problem
def print_alphabet(num):
    for i in range(-(num - 1), num):
        for j in range(-2*(num - 1), 2 * (num - 1) + 1):
            if j % 2 == 0 and (abs(j // 2) + abs(i)) < num:
                print(chr(abs(j//2) + abs(i) + ord('a')), end='')
            else:
                print('-', end='')
        print()


if __name__ == '__main__':
    print_alphabet(int(input()))
