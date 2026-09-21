class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int price : prices){
            if(price < min_price){
                min_price = price;
            }
            else if(price - min_price > maxprofit){
                maxprofit = price - min_price;
            }
        }
        return maxprofit;
    }
}