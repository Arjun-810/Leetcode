class Solution {
    
    public int solve(int[] slices, int s,int e,int size,int[][] dp){
        if(size == 0 || s>e)
            return 0;
        if(dp[s][size]!= -1)return dp[s][size];
        int inc = slices[s]+ solve(slices, s+2,e,size-1,dp);
        int exc = solve(slices,s+1,e,size,dp);
        
        return dp[s][size] = Math.max(inc,exc);
    }
    
    public int maxSizeSlices(int[] slices) {
        int n = slices.length;
        int[][] dp1 = new int[n+1][n+1];
        for(int[] dp :dp1)
        Arrays.fill(dp,-1);
        int[][] dp2 = new int[n+1][n+1];
        for(int[] dp :dp2)
        Arrays.fill(dp,-1);
        int op1 = solve(slices, 0, n-2,n/3,dp1);
        int op2 = solve(slices, 1, n-1,n/3,dp2);
        
        return Math.max(op1, op2);
    }
}