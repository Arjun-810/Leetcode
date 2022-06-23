class Solution {
    public int maxProfit(int[] prices) {
        int heigh = prices[0],low = prices[0],idxh = 0,idxl = 0,max = 0;
        for(int i=0;i<prices.length;i++){
            if (heigh < prices[i]){
                heigh = prices[i];
                idxh = i;
            }
            if (low > prices[i]){
                low = prices[i];
                idxl = i;
                if (idxl > idxh){
                    idxh = i;heigh = prices[i];

                }
            }
            max = Math.max(max,heigh-low);
        }
        return max;
    }
}