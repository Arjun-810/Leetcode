class Solution {
    public int[] getConcatenation(int[] nums) {
         int[] ans = new int[2*nums.length];
        int i=0,p=0;
        while (i<2){
            for (int j=0;j<nums.length;j++){
                ans[p] = nums[j];
                p++;
            }
            i++;
        }
        return ans;
    }
}