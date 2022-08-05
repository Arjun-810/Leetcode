class Solution {
    public void reverseString(char[] arr) {
        int n = arr.length;
        if(n <= 1) return;
        for(int i=0;i<n/2;i++){
            char temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        return;
    }
}