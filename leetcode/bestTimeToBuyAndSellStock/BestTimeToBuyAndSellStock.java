package bestTimeToBuyAndSellStock;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {

    // O(n)
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices.length != 0 ? prices[0] : 0;

        for (int price : prices) {
            maxProfit = Math.max(maxProfit, price - min);
            min = Math.min(min, price);
        }
        return maxProfit;
    }
}
