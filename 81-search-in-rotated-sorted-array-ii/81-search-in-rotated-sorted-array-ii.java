class Solution {
    public boolean search(int[] nums, int target) {
        int l = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target || nums[l] == target)
                return true;
            l--;
        }
        return false;
    }
}