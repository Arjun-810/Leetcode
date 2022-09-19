class Solution {
    public int solve(int[] nums,int i,int j) {
        if(j<i)
            return 0;
        
        if(i == j)
            return nums[i];
        
        int op1 = nums[i] + Math.min(solve(nums,i+2,j), solve(nums,i+1,j-1));
        int op2 = nums[j] + Math.min(solve(nums,i+1,j-1), solve(nums,i,j-2));
        
        return Math.max(op1,op2);
    }
    public boolean PredictTheWinner(int[] nums) {
        int p1_score = solve(nums,0,nums.length-1);
        int p2_score = 0;
        
        int total = 0;
        
        for(int x : nums)
            total += x;
        
        p2_score = total - p1_score;
        
        if(p1_score >= p2_score)
            return true;
        
        return false;
    }
}