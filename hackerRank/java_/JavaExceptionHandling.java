package java_;

// https://www.hackerrank.com/challenges/java-exception-handling/problem
public class JavaExceptionHandling {
    public static void main(String[] args) throws Exception {
        MyCalculator_ myCal = new MyCalculator_();
        System.out.println(myCal.power(3, 5));
        System.out.println(myCal.power(2, 4));
        System.out.println(myCal.power(0, 0));
        System.out.println(myCal.power(-1, -2));
        System.out.println(myCal.power(-1, 3));
    }
}

class MyCalculator_ {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) throw new Exception("n or p should not be negative.");
        else if (n == 0 && p == 0) throw new Exception("n and p should not be zero.");
        return (long) Math.pow(n, p);
    }
}
