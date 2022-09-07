class Solution {
    public int fibTri(int n, int[] dp){
        if(n <= 1)
            return n;
        if(n == 2)
            return 1;
        if(dp[n] != -1)
            return dp[n];
        return dp[n] = fibTri(n-1, dp)+fibTri(n-2, dp)+fibTri(n-3 , dp);
    }
    public int tribonacci(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return fibTri(n,dp);
    }
}