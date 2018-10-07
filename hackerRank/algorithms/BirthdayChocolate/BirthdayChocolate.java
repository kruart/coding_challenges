package algorithms.BirthdayChocolate;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {

    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        for (int i = m; i <= s.size(); i++) {
            int sum = 0;
            for (int j = i - m; j < i; j++) {
                sum += s.get(j);
            }
            if (sum == d) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(birthday(Arrays.asList(2, 2, 1, 3, 2), 4, 2));       //2
        System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2));       //2
        System.out.println(birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2));    //0
        System.out.println(birthday(Arrays.asList(4), 4, 1));                   //1
    }
}
