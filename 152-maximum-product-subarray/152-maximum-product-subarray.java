class Solution {
    
    public int maxProduct(int[] nums) {
        int max_so_far = nums[0],min_so_far = nums[0], res = nums[0];
        for(int i=1;i<nums.length;i++){
            int temp = Math.max(nums[i],Math.max(min_so_far*nums[i],max_so_far*nums[i]));
        min_so_far = Math.min(nums[i],Math.min(min_so_far*nums[i],max_so_far*nums[i]));
            max_so_far = temp;
            res = Math.max(max_so_far,res);
        }
        return res;
    }
}