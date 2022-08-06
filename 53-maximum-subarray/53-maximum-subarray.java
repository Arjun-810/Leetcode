class Solution {
    public int maxSubArray(int[] arr) {
        if(arr.length == 0) return 0;
        if(arr.length == 1) return arr[0];
        
       int max = Integer.MIN_VALUE,sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            max = Math.max(sum,max);
            if(sum <=0) sum = 0;
        }
        return max;
    }
}