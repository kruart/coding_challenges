package stringWithoutAAAorBBB;

// https://leetcode.com/problems/string-without-aaa-or-bbb/
public class StringWithoutAAAorBBB {
    public String strWithout3a3b(int A, int B) {
        StringBuilder sb = new StringBuilder();
        int countA = 0;
        int countB = 0;
        int n = A + B;

        for (int i = 0; i < n; i++) {
            if (A > B && countA < 2 || countB == 2) {
                A--;
                sb.append("a");
                countA++;
                countB = 0;
            } else  {
                B--;
                sb.append("b");
                countB++;
                countA = 0;
            }
        }
        return sb.toString();
    }
}
