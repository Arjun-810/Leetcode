class Solution {
    public int search(int[] arr, int K) {
        int low = 0,high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == K)
                return mid;
            if(arr[mid] > K)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}