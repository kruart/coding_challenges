package algorithms.ElectronicsShop;

// https://www.hackerrank.com/challenges/electronics-shop/problem
public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxSum = -1;

        for (int keyboard : keyboards) {
            for (int drive : drives) {
                int sum = keyboard + drive;
                if (sum <= b && sum > maxSum) maxSum = sum;
            }
        }
        return maxSum;
    }


    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10)); //9
        System.out.println(getMoneySpent(new int[]{4}, new int[]{5}, 5));           //-1
    }
}
