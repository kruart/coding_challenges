package insertDeleteGetRandom;

import java.util.*;

// https://leetcode.com/problems/insert-delete-getrandom-o1/
class RandomizedSet {
    private Map<Integer, Integer> m;
    private List<Integer> l;
    private Random random;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        this.m = new HashMap<>();
        this.l = new ArrayList<>();
        this.random = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (m.containsKey(val)) {
            return false;
        }
        m.put(val, l.size());
        l.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!m.containsKey(val)) {
            return false;
        }
        Integer idx = m.get(val);
        if (idx != l.size()-1) {
            // set last item in idx position
            int lastItem = l.get(l.size()-1);
            l.set(idx, lastItem);
            m.put(lastItem, idx);
        }
        m.remove(val);
        l.remove(l.size()-1);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int range = random.nextInt(m.size());
        return l.get(range);
    }
}
