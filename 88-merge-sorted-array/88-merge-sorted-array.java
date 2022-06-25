class Solution {
    public void merge(int[] arr1, int n, int[] arr2, int m) {
        int c = 0,i=0;
        if(m == 0)return;
        while(i<n){
            if(arr1[i] > arr2[0]){
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                Arrays.sort(arr2);
            }
            c++;
            i++;
        }
        i=0;
        while(i<m){
            arr1[n+i] = arr2[i];
            i++;
        }
    }
}