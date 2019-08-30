package arithmeticSlices;

// https://leetcode.com/problems/arithmetic-slices/
public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        if (A.length < 3) return 0;

        int count = 0;
        int startPos = 0;

        while (startPos < A.length-2) {
            int currPos = startPos+2;

            while (currPos < A.length) {
                if (A[currPos-2] - A[currPos-1] == A[currPos-1] - A[currPos]) {
                    if (currPos - startPos >= 2) count++;
                    currPos++;
                } else {
                    break;
                }
            }
            startPos++;
        }
        return count;
    }
}
