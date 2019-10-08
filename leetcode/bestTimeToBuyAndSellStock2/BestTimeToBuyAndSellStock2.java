package bestTimeToBuyAndSellStock2;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int n = prices.length;
        if (n == 1) return sum;
        int idx = 0;

        while (idx < n-1) {
            while (idx < n-1 && prices[idx] >= prices[idx+1]) idx++;

            int k = idx;
            while (k < n-1 && prices[k] <= prices[k+1]) k++;

            sum += prices[k] - prices[idx];
            idx = k;
        }

        return sum;
    }
}
