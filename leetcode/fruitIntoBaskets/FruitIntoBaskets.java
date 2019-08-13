package fruitIntoBaskets;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/fruit-into-baskets/
public class FruitIntoBaskets {
    public int totalFruit(int[] tree) {
        Map<Integer, Integer> fruits = new HashMap<>(); // fruit -> index
        int maxLen = 0;
        int lastIdx = 0;

        for (int i = 0; i < tree.length; i++) {
            fruits.put(tree[i], i);

            if (fruits.size() > 2) {
                int min = Collections.min(fruits.values());
                fruits.remove(tree[min]);
                lastIdx = min + 1;
            }
            maxLen = Math.max(maxLen, i - lastIdx + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        FruitIntoBaskets f = new FruitIntoBaskets();
        System.out.println(f.totalFruit(new int[] {1,2,1}));    //3
        System.out.println(f.totalFruit(new int[] {0,1,2,2}));    //3
        System.out.println(f.totalFruit(new int[] {1,2,3,2, 2}));    //4
        System.out.println(f.totalFruit(new int[] {3,3,3,1,2,1,1,2,3,3,4}));    //5
        System.out.println(f.totalFruit(new int[] {1,2,2,1,3,3,3,1}));    //5
    }
}

