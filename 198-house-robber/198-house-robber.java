class Solution {
    
    public int find(int idx,int[] nums,int[] dp){
        if(idx >= nums.length)
            return 0;
        
        if(dp[idx] != -1)
            return dp[idx];
        
        int a = find(idx+1,nums,dp);
        int b = find(idx+2,nums,dp)+nums[idx];
        
        return dp[idx] = Math.max(a,b);
    }
    
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return Math.max(find(0,nums,dp),find(1,nums,dp));
    }
}