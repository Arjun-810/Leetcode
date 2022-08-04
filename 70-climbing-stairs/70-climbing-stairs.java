class Solution {
    public int rec(int n, int[] arr){
        if(n<=2) return n;
        if(arr[n] != -1) return arr[n];
        // arr[n] =  ;
        return arr[n] = rec(n-1,arr)+rec(n-2,arr);
    }
    public int climbStairs(int n) {
        // if(n<=2) return n;
        // return climbStairs(n-1) + climbStairs(n-2);
        int[] arr = new int[n+1];
        for(int i=0;i<=n;i++) arr[i] = -1;
        return rec(n, arr);
    }
}