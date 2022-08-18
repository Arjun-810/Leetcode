class Solution {
//     public int subSeq(int idx,int[] nums,int prev,int[][] dp){
//         if(idx == nums.length){
//             return 0;
//         }
//         if(dp[idx][prev+1] != -1) return dp[idx][prev+1];
//         int a = 0;
//         if(prev== -1 || ( nums[prev] < nums[idx])){
//             a = subSeq(idx+1, nums,idx,dp) + 1;
//         }
        
//         int b = subSeq(idx+1, nums,prev,dp)+0;
        
//         return dp[idx][prev+1] = Math.max(a,b);
//     }
    
    public int subSeq(int[] nums,int n,int[][] dp){
        for(int idx = n-1;idx>=0;idx--){
            for(int prev = idx-1;prev>=-1;prev--){
                int a = 0;
                if(prev== -1 || ( nums[prev] < nums[idx])){
                    a = dp[idx+1][idx+1] + 1;
                }
        
                int b = dp[idx+1][prev+1];
                dp[idx][prev+1] = Math.max(a,b);
            }
        }
        return dp[0][0];
    }
    
    
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length+1][nums.length+1];
        for(int[] a: dp)
            Arrays.fill(a,0);
        return subSeq(nums,nums.length,dp);
    }
}