package MinimumSwapsToGroupAll1sTogether;

public class MinimumSwapsToGroupAll1sTogether {
    public int minSwaps(int[] data) {
        int ones = 0;

        for (int n : data) {
            ones += n;
        }

        int max = 0;
        int onesInCurrIntv = 0; // ones in current interval
        for (int i = 0; i < data.length; i++) {
            if (i >= ones) {
                onesInCurrIntv -= data[i-ones];
            }
            onesInCurrIntv += data[i];
            max = Math.max(max, onesInCurrIntv);
        }
        return ones - max;
    }
}
