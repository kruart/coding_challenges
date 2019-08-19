package hammingDistance;

// https://leetcode.com/problems/hamming-distance/
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            int bitX = x & (1 << i);
            int bitY = y & (1 << i);
            if (bitX == 0 && bitY > 0 || bitX > 0 && bitY == 0)
                count++;
        }
        return count;
    }

    public int hammingDistance2(int x, int y) {
        int count = 0;
        int xor = x ^ y;
        for (int i = 0; i < 32; i++) {
            if ((xor & (1 << i)) != 0)
                count++;
        }
        return count;
    }
}
