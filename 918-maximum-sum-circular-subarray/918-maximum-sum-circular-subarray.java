class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int a: nums)
            sum += a;
        int max_so_far = nums[0], min_so_far = nums[0],cur_max=nums[0],cur_min = nums[0];
        for(int i=1;i<n;i++){
            cur_max = Math.max(nums[i],cur_max+nums[i]);
            max_so_far = Math.max(max_so_far, cur_max);
            
            cur_min = Math.min(nums[i],cur_min+nums[i]);
            min_so_far = Math.min(min_so_far, cur_min);
        }
        
        if(min_so_far == sum)
            return max_so_far;
        
        return Math.max(max_so_far, sum-min_so_far);
    }
}