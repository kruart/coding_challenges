package algorithms.implementation.MigratoryBirds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> birdsType = new HashMap<>();

        for (Integer item : arr) {
            birdsType.merge(item, 1, (oldVal, newVal) -> oldVal + newVal);
        }

        int min = 0;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : birdsType.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                min = entry.getKey();
            } else if (entry.getValue() == maxCount && min > entry.getKey()) {
                min = entry.getKey();
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1, 4, 4, 4, 5, 3))); //4
        System.out.println(migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4))); //3
    }
}
