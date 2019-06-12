package algorithms.TheFullCountingSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.hackerrank.com/challenges/countingsort4/problem
public class TheFullCountingSort {
    public static void main(String[] args) throws IOException {
        List<List<String>> s = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            s.add(new ArrayList<>());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int half = n / 2;

        for (int i = 0; i < n; i++) {
            String [] pair = br.readLine().split(" ");
            String ch = i < half ? "-" : pair[1];
            s.get(Integer.parseInt(pair[0])).add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (List<String> strings : s) {
            if (strings.size() != 0) {
                sb.append(String.join(" ", strings)).append(" ");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
