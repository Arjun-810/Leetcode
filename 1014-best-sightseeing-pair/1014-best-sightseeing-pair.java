class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int[] dp = new int[values.length];
        int max =  0;
        dp[0] = 0;
        for(int i=1;i<values.length;i++){
            dp[i] = Math.max(dp[i-1]-values[i-1]+values[i]-1,values[i-1]+values[i]-1); 
            max = Math.max(dp[i],max);
        }
        return max;
    }
}