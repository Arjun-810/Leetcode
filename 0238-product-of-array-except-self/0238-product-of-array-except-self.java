class Solution {
    public int[] productExceptSelf(int[] arr) {
        int pro = 1;
        int zero = 0;
        int n = arr.length;
        for(int x: arr){
            if(x == 0)
                zero++;
            else
                pro*=x;
        }
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                if(zero == 1)
                    res[i] = pro;
                else 
                    res[i] = 0;
            }
            else if(zero > 0)
                res[i] = 0;
            else
                res[i] = pro/arr[i];
        }
        return res;
    }
}