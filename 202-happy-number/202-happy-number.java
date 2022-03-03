class Solution {
    public boolean isHappy(int n) {
        boolean is_loop = true;
        int sum = 0;
        if (n==1||n==7)return true;
        while (is_loop){
            sum = 0;
            while (n>0){
                sum += Math.pow(n%10,2);
                n/=10;
            }
            if (sum<=9){
                if (sum==1||sum==7)return true;
                else return false;
            }else {
                is_loop = true;
                n = sum;
            }
        }
        return false;
    }
}