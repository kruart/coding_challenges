import math

# https://www.hackerrank.com/challenges/encryption/problem
def encryption(s):
    s = s.replace(" ", "")
    sqrt = math.sqrt(len(s))
    cols = math.ceil(sqrt)

    encrypt_pass = []
    for i in range(0, cols):
        word = ''
        for j in range(i, len(s), cols):
            word += s[j]
        encrypt_pass.append(word)

    return ' '.join(encrypt_pass)


if __name__ == '__main__':
    result1 = encryption("if man was meant to stay on the ground god would have given us roots")
    print(result1)  # imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau

    print(encryption('haveaniceday'))   # hae and via ecy
    print(encryption('feedthedog'))     # fto ehg ee dd
