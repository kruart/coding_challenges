package Binary;

public class BinaryHacks1Basics {
    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    private static boolean isNumbersHaveOppositeSigns(int x, int y) {
        return (x ^ y) < 0;
    }

    private static int increment(int n) {
        return -~n;
    }

    private static void swap(int x, int y) {
        if (x != y) {
            x = x ^ y;
            y = x ^ y;
            x = x ^ y;
        }
        System.out.println("x: " + x + "; y: " + y + ";");
    }

    public static void main(String[] args) {
        // is odd
        System.out.println(isOdd(11));  // true
        System.out.println(isOdd(22));  // false
        System.out.println(isOdd(33));  // true

        // is opposite signs
        System.out.println(isNumbersHaveOppositeSigns(10, 10));     // false
        System.out.println(isNumbersHaveOppositeSigns(10, -10));    // true
        System.out.println(isNumbersHaveOppositeSigns(-10, 10));    // true
        System.out.println(isNumbersHaveOppositeSigns(-10, -10));   // false

        // binary increment
        System.out.println(increment(5));       // 6
        System.out.println(increment(-5));      // -4
        System.out.println(increment(0));       // 1

        // swap
        swap(4, 3);
    }
}
