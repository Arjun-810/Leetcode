class Solution {
    public int maxProfit(int[] prices) {
         if (prices.length < 2) return 0;

        int sold0 = Integer.MIN_VALUE;
        int buy1 = Integer.MIN_VALUE;
        int reset = 0;

        for (int price : prices){
            int prevSold = sold0;
            sold0 = Math.max(sold0, buy1 + price);// sold after buy
            buy1 = Math.max(buy1, reset - price); // buy after reset
            reset = Math.max(reset, prevSold);    // reset after sold
        }
        return Math.max(sold0, reset);
    }
}