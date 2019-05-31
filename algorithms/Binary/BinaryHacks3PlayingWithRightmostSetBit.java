package Binary;

public class BinaryHacks3PlayingWithRightmostSetBit {
    private static boolean isNumberPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    private static int findPositionOfRightmostSetBit(int n) {
        // if number is odd, return 1
        if ((n & 1) == 1) {
            return 1;
        }

        // unset rightmost bit and xor with number itself
        n = n ^ (n & (n - 1));

        int pos = 0;
        while (n != 0) {
            n = n >> 1;
            pos++;
        }
        return pos;
    }

    private static int increment(int n) {
        return -~n;
    }

    public static void main(String[] args) {
        // is number power of two
        System.out.println(isNumberPowerOfTwo(11));   // false
        System.out.println(isNumberPowerOfTwo(22));   // false
        System.out.println(isNumberPowerOfTwo(16));   // true
        System.out.println(isNumberPowerOfTwo(64));   // true
        System.out.println(isNumberPowerOfTwo(512));  // true


        // position of rightmost set bit
        System.out.println(findPositionOfRightmostSetBit(20));
    }
}
