package algorithms.implementation.BonAppétit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/bon-appetit/problem
public class BonAppetit {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i == k) continue;
            sum += bill.get(i);
        }
        System.out.println(sum / 2 == b ? "Bon Appetit" : b - sum / 2);
    }

    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>();
        bill.addAll(Arrays.asList(3, 10, 2, 9));
        bonAppetit(bill, 1, 12);  //5
        bonAppetit(Arrays.asList(3, 10, 2, 9), 1, 7);   //Bon Appetit
    }
}
