class Solution {
    public int maxProfit(int[] prices, int fee) {
          if (prices.length < 2) return 0;

        int balAfterSold0 = 0, balAfterBuy1 = -prices[0];

        for (int price: prices) {
            int prevSold = balAfterSold0;
            balAfterSold0= Math.max(balAfterSold0, balAfterBuy1 + price - fee);
            balAfterBuy1 = Math.max(balAfterBuy1, prevSold - price);
        }
        return balAfterSold0;
    }
}