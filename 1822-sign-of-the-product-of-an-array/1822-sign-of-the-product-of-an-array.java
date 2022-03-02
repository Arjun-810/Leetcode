class Solution {
    public int arraySign(int[] nums) {
      int pro = 0;
        for (int a:nums){
            if (a<0)
                pro++;
            else if (a == 0)
                return 0;
        }
        return pro%2==0?1:-1;
    }
}