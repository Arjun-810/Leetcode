class Solution {
    public int subSeq(int idx,int[] nums,int prev,int[][] dp){
        if(idx == nums.length){
            return 0;
        }
        if(dp[idx][prev+1] != -1) return dp[idx][prev+1];
        int a = 0;
        if(prev== -1 || ( nums[prev] < nums[idx])){
            a = subSeq(idx+1, nums,idx,dp) + 1;
        }
        
        int b = subSeq(idx+1, nums,prev,dp)+0;
        
        return dp[idx][prev+1] = Math.max(a,b);
    }
    
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length+1][nums.length+1];
        for(int[] a: dp)
            Arrays.fill(a,-1);
        return subSeq(0,nums,-1,dp);
    }
}