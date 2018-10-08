package data_structures.SparseArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// https://www.hackerrank.com/challenges/sparse-arrays/problem
public class SparseArrays {
    //    second way: O(n2)
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] idx = new int[queries.length];

        for (String str : strings) {
            for (int i = 0; i < queries.length; i++) {
                if (str.equals(queries[i])) idx[i]++;
            }
        }
        return idx;
    }

    //    second way: O(n)
    static Integer[] matchingStrings2(String[] strings, String[] queries) {
        List<String> queryList = Arrays.asList(queries);
        Map<String, Integer> queryMap = Arrays.stream(queries)
                .collect(Collectors.toMap(q -> q, q -> 0, (q1, q2) -> q1));   // (k, v) == (query, 0)

        for (String str : strings) {
            if (queryList.contains(str)) queryMap.put(str, queryMap.get(str) + 1);
        }
        return queryList.stream().map(queryMap::get).toArray(Integer[]::new);
    }

    public static void main(String[] args) {


        int[] ints1 = matchingStrings(new String[]{"aba", "baba", "aba", "xzxb"}, new String[]{"aba", "xzxb", "ab"});//2 1 0
        int[] ints2 = matchingStrings(new String[]{"def", "de", "fgh"}, new String[]{"de", "lmn", "fgh"});//1 0 1
        int[] ints3 = matchingStrings(new String[]{"abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf"},
                new String[]{"abcde", "sdaklfj", "asdjf", "na", "basdn", "abcde"}); //1 3 4 3 2 1

        System.out.println(Arrays.toString(ints1));
        System.out.println(Arrays.toString(ints2));
        System.out.println(Arrays.toString(ints3));

        Integer[] ints4 = matchingStrings2(new String[]{"aba", "baba", "aba", "xzxb"}, new String[]{"aba", "xzxb", "ab"});//2 1 0
        Integer[] ints5 = matchingStrings2(new String[]{"def", "de", "fgh"}, new String[]{"de", "lmn", "fgh"});//1 0 1
        Integer[] ints6 = matchingStrings2(new String[]{"abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf"},
                new String[]{"abcde", "sdaklfj", "asdjf", "na", "basdn", "abcde"}); //1 3 4 3 2 1

        System.out.println(Arrays.toString(ints4));
        System.out.println(Arrays.toString(ints5));
        System.out.println(Arrays.toString(ints6));
    }
}
