package algorithms.MarsExploration;

import java.util.stream.IntStream;

// https://www.hackerrank.com/challenges/mars-exploration/problem
public class MarsExploration {
    static int marsExploration(String s) {
        String msg = "SOS";
        return (int)IntStream.range(0, s.length())
                .filter(i -> s.charAt(i) != msg.charAt(i % 3))
                .count();
    }

    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSPSSQSSOR"));    //3
        System.out.println(marsExploration("SOSSOT"));          //1
        System.out.println(marsExploration("SOSSOSSOS"));       //0
    }
}
