package rotateImage;

// https://leetcode.com/problems/rotate-image/
public class RotateImage {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < matrix.length-i-1; j++) {
                int a = matrix[i][j];
                int b = matrix[j][matrix.length-i-1];
                int c = matrix[matrix.length-i-1][matrix.length-j-1];
                int d = matrix[matrix.length-j-1][i];

                matrix[i][j] = d;
                matrix[j][matrix.length-i-1] = a;
                matrix[matrix.length-i-1][matrix.length-j-1] = b;
                matrix[matrix.length-j-1][i] = c;
            }
        }
    }


    public static void main(String[] args) {
        // tests
        RotateImage ri = new RotateImage();
        ri.rotate(new int[][]{{1,2}, {3,4}});
        ri.rotate(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}});
        ri.rotate(new int[][] {
                { 5, 1, 9,11},
                { 2, 4, 8,10},
                {13, 3, 6, 7},
                {15,14,12,16}
        });
        ri.rotate(new int[][]{
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        });


    }
}
