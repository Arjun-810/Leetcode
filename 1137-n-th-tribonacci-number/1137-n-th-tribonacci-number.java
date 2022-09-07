class Solution {
    // public int fibTri(int n, int[] dp){
    //     if(n <= 1)
    //         return n;
    //     if(n == 2)
    //         return 1;
    //     if(dp[n] != -1)
    //         return dp[n];
    //     return dp[n] = fibTri(n-1, dp)+fibTri(n-2, dp)+fibTri(n-3 , dp);
    // }
    // public int tribonacci(int n) {
    //     int[] dp = new int[n+1];
    //     Arrays.fill(dp,-1);
    //     return fibTri(n,dp);
    // }
    
//  Tabularization   
    
    public int tribonacci(int n) {
        if(n <= 1)
            return n;
        if(n == 2)
            return 1;
        int[] dp = new int[n+1];
        int i=3;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        while(i<=n){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
            i++;
        }
        return dp[n];
    }
}