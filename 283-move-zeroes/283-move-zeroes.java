class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length <=1) return;
        int i = 0;
        int j = 1;
        while(i <nums.length && j<nums.length){
            if(i<j && nums[i] == 0 && nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
                continue;
            }
            if(nums[j] != 0 && nums[i] != 0) {
                i++;
                j++;
                continue;
            }
            if(nums[j] ==0) j++;
            if(nums[i] != 0) i++;
        }
        return;
    }
}