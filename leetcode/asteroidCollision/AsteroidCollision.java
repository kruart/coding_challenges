package asteroidCollision;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

// https://leetcode.com/problems/asteroid-collision/
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new LinkedList<>();

        for (int a : asteroids) {
            if (!stack.isEmpty() && stack.peek() > 0 && a < 0) {
                doCollision(stack, a);
            } else {
                stack.push(a);
            }
        }

        int[] arr = new int[stack.size()];
        int size = stack.size()-1;

        while (size >= 0) {
            arr[size--] = stack.pop();
        }
        return arr;
    }

    private void doCollision(Deque<Integer> stack, int asteroid) {
        while (!stack.isEmpty()) {
            if (stack.peek() < 0 || asteroid > 0) {
                stack.push(asteroid);
                break;
            }

            int compare = Integer.compare(Math.abs(stack.peek()), Math.abs(asteroid));
            if (compare < 0) {
                stack.pop();
            } else if (compare == 0) {
                stack.pop();
                break;
            } else {
                break;
            }
            if (stack.isEmpty()) {
                stack.push(asteroid);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AsteroidCollision ac = new AsteroidCollision();
        System.out.println(Arrays.toString(ac.asteroidCollision(new int[]{-2,-2,1,-2})));
        System.out.println(Arrays.toString(ac.asteroidCollision(new int[]{5, 10, -5})));
        System.out.println(Arrays.toString(ac.asteroidCollision(new int[]{8, -8})));
        System.out.println(Arrays.toString(ac.asteroidCollision(new int[]{10, 2, -5})));
        System.out.println(Arrays.toString(ac.asteroidCollision(new int[]{-2, -1, 1, 2})));
    }
}
