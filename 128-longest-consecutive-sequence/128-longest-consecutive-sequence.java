class Solution {
    public int longestConsecutive(int[] arr) {
        int N = arr.length;
        if(N == 0)return N;
        Arrays.sort(arr);
        int max = 1,temp = 1;
        for(int i=1;i<N;i++){ //0 1 1 2
            if(arr[i-1] == arr[i]-1){
                temp += 1;
            }
            else if(arr[i-1] == arr[i])
                 continue;
            else{
                max = Math.max(max,temp);
                temp = 1;
            }
        }
        return Math.max(max,temp);
    }
}