class Solution {
    
    public int maxProduct(int[] nums) {
        int pro = 1;
        int max_left = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            pro = pro*nums[i];
            if(pro == 0){
                pro= 1;
                continue;
            }
            max_left = Math.max(max_left,pro);
        }
        pro = 1;
        int max_right = Integer.MIN_VALUE;
        boolean zero = false; 
        for(int i=nums.length-1;i>=0;i--){
            pro = pro*nums[i];
            if(pro == 0){
                zero = true;
                pro= 1;
                continue;
            }
            max_right = Math.max(max_right,pro);
        }
        if(zero) 
            return Math.max(0, Math.max(max_left,max_right));
        return Math.max(max_left,max_right);
    }
}