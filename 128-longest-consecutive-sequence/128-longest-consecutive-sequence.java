class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length <= 1) return arr.length; 
        Arrays.sort(arr);
        int count = 1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1] == arr[i]) continue;
            if(arr[i+1]-arr[i] ==1)
                count++;
            else{
                max = Math.max(count,max);
                count = 1;
            }
        }
        return Math.max(count,max);
    }
}