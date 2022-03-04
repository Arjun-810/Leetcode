class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int a:accounts[i])
                sum += a;
            max = Math.max(max,sum);
        }
        return max;
    }
}