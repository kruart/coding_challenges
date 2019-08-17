# https://leetcode.com/problems/reverse-integer/
class ReverseInteger:
    def reverse(self, x: int) -> int:
        rev = 0

        temp = abs(x)
        while temp != 0:
            last_digit = temp % 10
            rev = rev * 10 + last_digit
            temp //= 10
        rev = rev if x > 0 else rev * -1
        return rev if -2**31 <= rev <= 2**31-1 else 0


if __name__ == '__main__':
    s = ReverseInteger()
    print(s.reverse(-123))
    print(s.reverse(123))
    print(s.reverse(120))
    print(s.reverse(543985834095904))