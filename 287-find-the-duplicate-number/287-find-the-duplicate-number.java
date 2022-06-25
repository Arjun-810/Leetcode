class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        int[] count = new int[n];
        for(int i=0;i<n;i++) count[i] = 0;
        for(int i=0;i<n;i++){
            if(count[arr[i]] != 0) return arr[i];
            count[arr[i]]++;
        }
        return -1;
    }
}