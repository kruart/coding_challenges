package algorithms.BeautifulDaysAtTheMovies;

import java.util.stream.IntStream;

// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
public class BeautifulDaysAtTheMovies {

    static int beautifulDays(int i, int j, int k) {
        return (int) IntStream.range(i, j+1)
                .filter(n -> (n - Integer.parseInt(new StringBuilder().append(n).reverse().toString())) % k == 0)
                .count();
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));   //2
    }
}
