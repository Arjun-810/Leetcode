class Solution {
    public int maxSubArray(int[] arr) {
        int n = arr.length;
        if(n == 0)
            return 0;
        if(n == 1)
            return arr[0];
        int sum = 0,max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max = Math.max(sum,max);
            if(sum <= 0) sum = 0;
        }
        return max;
    }
}