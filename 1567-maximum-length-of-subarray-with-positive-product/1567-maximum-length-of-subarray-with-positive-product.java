class Solution {
    public int getMaxLen(int[] nums) {
        int pos = 0;
        int neg = 0;
        int max = 0;
        for(int x: nums){
            if(x == 0){
                pos = 0;
                neg = 0;
            }else if(x > 0){
                pos = pos+1;
                neg = neg > 0? neg+1 : 0;
            }else{
                int temp = neg;
                neg = pos+1;
                pos = temp > 0? temp+1:0;
            }
            max = Math.max(pos, max);
        }
        return max;
    }
}