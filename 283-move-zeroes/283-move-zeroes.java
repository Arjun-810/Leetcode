class Solution {
    public void moveZeroes(int[] nums) {
        int f = 0;
        for (int i=0;i<nums.length;i++)
            if (nums[i] !=0){
                nums[f] = nums[i];
                f++;
            }
        for (int i=0;i<nums.length;i++){
            if (i<f)
                continue;
            else nums[i] = 0;
        }
    }
}