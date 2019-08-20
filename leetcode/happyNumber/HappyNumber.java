package happyNumber;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/happy-number/
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> sums = new HashSet<>();
        int res = n;

        while (!sums.contains(res)) {
            sums.add(res);
            n = res;
            int sum = 0;
            while (n > 0) {
                int lastDigit = n % 10;
                sum += (lastDigit * lastDigit);
                n = n / 10;
            }
            res = sum;
        }
        return res == 1;
    }
}
