package Binary;

public class BinaryHacks2PlayingWithKthBit {
    private static int turnOffKthBit(int n, int k) {
        return n & ~(1 << (k - 1));
    }

    private static int turnOnKthBit(int n, int k) {
        return n | (1 << (k - 1));
    }

    private static int toggleTheKthBit(int n, int k) {
        return n ^ (1 << (k - 1));
    }

    public static void main(String[] args) {
        // turn off k'th bit in a number
        System.out.println(turnOffKthBit(20, 3));
        System.out.println(turnOffKthBit(15, 4));

        // turn on k'th bit in a number
        System.out.println(turnOnKthBit(20, 4));

        // toggle the k'th bit
        System.out.println(toggleTheKthBit(20, 3));
        System.out.println(toggleTheKthBit(15, 4));
    }
}
