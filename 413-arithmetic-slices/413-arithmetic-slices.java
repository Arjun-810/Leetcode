class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = 0;
        if (nums.length<3) return n;
        for (int j=0;j<nums.length;j++) 
            for (int i = j; i < nums.length - 2; i++) {
                if (nums[i + 1] - nums[i] == nums[i + 2] - nums[i + 1])
                    n++;
                else break;
            }
        return n;
    }
}