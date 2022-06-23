class Solution {
    public void sortColors(int[] arr) {
        int zero = 0,one = 0;
        for(int i:arr){
            if (i == 0) zero++;
            else if (i==1) one++;
        }
        for (int i=0;i< arr.length;i++){
            if (zero>0){
                arr[i] = 0;
                zero--;
            } else if (one > 0) {
                arr[i] = 1;
                one--;
            }else arr[i] = 2;
        }
    }
}