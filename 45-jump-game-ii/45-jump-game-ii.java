class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1)
            return 0;
        int max_so_far = nums[0];
        int steps = nums[0];
        int jump = 1;
        for(int i=1;i<nums.length;i++){
            if(i == nums.length-1)
                return jump;
            max_so_far = Math.max(max_so_far,i+nums[i]);
            steps--;
            if(steps == 0){
                if(i >= max_so_far)
                    return -1;
                jump++;
                steps = max_so_far-i;
            }
        }
        return -1;
    }
}