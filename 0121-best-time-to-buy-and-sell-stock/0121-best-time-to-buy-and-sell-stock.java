class Solution {
    public int maxProfit(int[] prices) {
       if (prices.length == 0) {
        return 0;
        }
        int small = prices[0]; 
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < small) {
                small = prices[i];
            } else {
                int profit = prices[i] - small;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}