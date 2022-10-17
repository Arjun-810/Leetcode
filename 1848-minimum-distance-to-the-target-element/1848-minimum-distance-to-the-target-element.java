class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length,min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i] == target)
                min = Math.min(Math.abs(i-start),min);
        }
        return min;
    }
}