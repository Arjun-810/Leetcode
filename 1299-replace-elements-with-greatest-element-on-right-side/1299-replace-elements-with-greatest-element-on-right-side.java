class Solution {
    public int[] replaceElements(int[] arr) {
        int grst = -1;
        for(int i=arr.length-1;i>=0;i--){
            int ele = arr[i];
            arr[i] = grst;
            grst = Math.max(grst,ele);
        }
        return arr;
    }
}