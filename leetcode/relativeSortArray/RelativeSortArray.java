package relativeSortArray;

import java.util.*;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> m = new HashMap<>();
        List<Integer> others = new ArrayList<>();
        int[] result = new int[arr1.length];

        for (int i : arr2) {
            m.put(i, 0);
        }

        for (int num : arr1) {
            m.computeIfPresent(num, (k, v) -> v+1);
        }

        for (int num : arr1) {
            if (!m.containsKey(num))
                others.add(num);
        }
        Collections.sort(others);

        int position = 0;
        for (int n : arr2) {
            for (int j = 0; j < m.get(n); j++) {
                result[position++] = n;
            }
        }

        for (int i = 0; i < others.size(); i++) {
            result[arr1.length - others.size() + i] = others.get(i);
        }
        return result;
    }
}
