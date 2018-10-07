package algorithms.DrawingBook;

// https://www.hackerrank.com/challenges/drawing-book/problem
public class DrawingBook {

    static int pageCount(int n, int p) {
        return Math.min(p/2, n/2 - p/2);
    }

    public static void main(String[] args) {
        System.out.println(pageCount(6, 2));    //1
        System.out.println(pageCount(6, 5));    //1
        System.out.println(pageCount(5, 4));    //0
        System.out.println(pageCount(6, 4));    //1
        System.out.println(pageCount(4, 4));    //0
        System.out.println(pageCount(13, 8));   //2
    }
}
