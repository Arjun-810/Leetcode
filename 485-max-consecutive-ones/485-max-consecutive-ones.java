class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        boolean prevOne = false;
        int count = 0,max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1) count++;
            if(nums[i] != 1){
                max = Math.max(count,max);
                count = 0;
            }
        }
        return Math.max(count,max);
    }
}