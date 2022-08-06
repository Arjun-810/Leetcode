class Solution {
    public void sortColors(int[] arr) {
        int one = 0,two = 0,zero = 0, temp = 0;
        for(int a: arr)
            temp = (a == 0)? zero++: (a==1)?one++:two++;
        int idx = 0;
        for(int i=0;i<zero;i++){
            arr[idx] = 0;
            idx++;
        }
        for(int i=0;i<one;i++){
            arr[idx] = 1;
            idx++;
        }
        for(int i=0;i<two;i++){
            arr[idx] = 2;
            idx++;
        }
            
        return;
    }
}