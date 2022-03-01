class Solution {
    public int largestPerimeter(int[] nums) {
        int max_sum = 0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++) {
            if (nums[i+0] + nums[i+1] > nums[i+2] && nums[i+0] + nums[i+2] > nums[i+1] && nums[i+2] + nums[i+1] > nums[i+0])
                max_sum = Math.max(nums[i+0] + nums[i+1] + nums[i+2],max_sum);
        }
        return max_sum;
    }
}