class Solution {
    public int rob(int[] houses) {
        int n = houses.length;
        int[] arr = new int[n];
        if(n == 2)
            return Math.max(houses[0],houses[1]);
        if(n == 1)
            return houses[0];
        
        arr[0] = houses[0];
        arr[1] = houses[1];
        int max = arr[0];
        for(int i=2;i<n;i++){
            arr[i] = max+houses[i];
            max = Math.max(arr[i-1],max);
        }
        return Math.max(arr[n-1],arr[n-2]);
    }
}