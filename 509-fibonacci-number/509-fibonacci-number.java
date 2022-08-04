class Solution {
    // public int dpFib(int n, int[] arr){
    //     if(n <=1) return n;
    //     if(arr[n] != -1) return arr[n];
    //     arr[n] = dpFib(n-1, arr) + dpFib(n-2, arr);
    //     return arr[n];
    // }
    // public int fib(int n) {
    //     int[] arr = new int[n+1];
    //     for(int i=0;i<=n;i++) arr[i] =-1;
    //     return dpFib(n, arr);
    // }
    public int dpFib(int n){
        if(n <=1) return n;
        return dpFib(n-1) + dpFib(n-2);
    }
    public int fib(int n) {
        return dpFib(n);
    }
}