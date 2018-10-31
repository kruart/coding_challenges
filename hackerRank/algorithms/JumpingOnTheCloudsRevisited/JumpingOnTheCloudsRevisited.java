package algorithms.JumpingOnTheCloudsRevisited;

import java.util.stream.IntStream;

public class JumpingOnTheCloudsRevisited {

    static int jumpingOnClouds(int[] c, int k) {
        return IntStream.range(0, c.length)
                .filter(i -> i % k == 0 || i == 0)
                .reduce(100, (acc, v) -> acc - c[v] * 2 - 1);
//        return IntStream.iterate(0, n -> n+k)
//                .limit((long) Math.ceil(c.length / (double) k))
//                .reduce(100, (acc, v) -> acc - c[v] * 2 - 1);
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[] {0, 0, 1, 0}, 2));                         //96
        System.out.println(jumpingOnClouds(new int[] {0, 0, 1, 0, 0, 1, 1, 0}, 2));             //92
        System.out.println(jumpingOnClouds(new int[] {0, 0, 1, 0, 0, 1, 1}, 2));                //92
        System.out.println(jumpingOnClouds(new int[] {1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3));       //94
    }
}
