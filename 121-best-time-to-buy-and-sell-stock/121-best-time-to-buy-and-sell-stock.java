class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int a: prices){
            min = Math.min(a, min);
            max = Math.max(max, a-min);
            // System.out.println("max = "+a+" "+min+" "+max);
        }
        return max;
    }
}