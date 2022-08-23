class Solution {
    
    public int find(int i, int j, int n, int m,int[][] grid,int[][] dp){
        if(i==n-1 && j == m-1) return grid[i][j];
        if(i >= n || j >= m) return (int)Math.pow(10,9);
        if(dp[i][j] != -1) return dp[i][j];
        int left = find(i+1,j,n,m,grid,dp)+grid[i][j];
        int right = find(i,j+1,n,m,grid,dp)+grid[i][j];
        return dp[i][j] = Math.min(left,right);
    }
    
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int[] a: dp)
            Arrays.fill(a,-1);
        return find(0,0,n,m,grid, dp);
    }
}