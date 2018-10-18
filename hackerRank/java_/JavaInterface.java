package java_;

// https://www.hackerrank.com/challenges/java-interface/problem
public class JavaInterface {
    public static void main(String[] args) {
        System.out.println(new MyCalculator().divisor_sum(6));
    }
}

interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {
//        return IntStream.range(1, n+1).filter(i -> n % i == 0).sum();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) sum += i;
        }

        return sum;
    }
}
