class Solution {
     public int numberOfPath(int m, int n,int[][] dp)
    {
        // code here
        if(m == 1 || n == 1)
            return dp[m][n] = 1;
        if(dp[m][n] != -1) 
            return dp[m][n];
        return dp[m][n] = (numberOfPath(m-1,n,dp)+numberOfPath(m,n-1,dp))%2000000000;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int[] x: dp)
            Arrays.fill(x, -1);
        return numberOfPath(m,n,dp);
    }
}