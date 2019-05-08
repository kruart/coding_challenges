package data_structures.DynamicArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

// https://www.hackerrank.com/challenges/dynamic-array/problem
public class DynamicArray {
    static void dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> seqList = new ArrayList<>();
        int lastAnswer = 0;
        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<>());
        }

        for (List<Integer> query : queries) {
            int x = query.get(1);
            int y = query.get(2);
            List<Integer> seq = seqList.get((x ^ lastAnswer) % n);

            if (query.get(0) == 1) {
                seq.add(y);
            } else {
                lastAnswer = seq.get(y % seq.size());
                System.out.println(lastAnswer);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nq = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> queries.add(
                Stream.of(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
        ));
        dynamicArray(n, queries);
    }
}