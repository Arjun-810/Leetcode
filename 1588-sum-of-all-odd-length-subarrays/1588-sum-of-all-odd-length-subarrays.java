class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
         int sum = 0;
        for (int i=0;i<arr.length;i++){
            int f=1,test = 0;
            for (int j=i;j<arr.length;j++){
                test +=arr[j];
                if(f%2!=0)
                    sum+=test;
                f++;
            }
        }
        return sum;
    }
}