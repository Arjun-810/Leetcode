class Solution {
    public  int find(int s_len,String s, int t_len,String t,int[][] dp){
        if(s_len == 0 || t_len == 0) return 0;
        if(dp[s_len-1][t_len-1] != -1) return dp[s_len-1][t_len-1];
        if(s.charAt(s_len-1) == t.charAt(t_len-1))
            return 1+ find(s_len-1,s,t_len-1,t,dp);
        
        return dp[s_len-1][t_len-1] = Math.max(find(s_len-1,s,t_len,t,dp) ,     find(s_len,s,t_len-1,t,dp));
    }
    public int longestCommonSubsequence(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        for(int[] a: dp)
            Arrays.fill(a,-1);
        return find(s.length(),s,t.length(),t,dp);
    }
}