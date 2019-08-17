package flippingAnImage;

// https://leetcode.com/problems/flipping-an-image/
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int rowLen = A[i].length;
            if (rowLen % 2 == 1) {  // flipping mid if there's odd numbers in row
                A[i][rowLen / 2] = 1 - A[i][rowLen / 2];
            }
            for (int j = 0; j < A[0].length / 2; j++) {
                int temp = 1 - A[i][j];
                A[i][j] = 1 - A[i][rowLen - j - 1];
                A[i][rowLen - j - 1] = temp;
            }
        }
        return A;
    }
}
