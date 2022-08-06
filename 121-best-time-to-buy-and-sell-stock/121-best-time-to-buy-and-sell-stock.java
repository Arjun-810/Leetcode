class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int a: prices){
            min = Math.min(min, a);
            max = Math.max(max, a-min);
        }
        return max;
    }
}