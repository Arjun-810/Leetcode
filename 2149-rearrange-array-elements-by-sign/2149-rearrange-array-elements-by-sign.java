class Solution {
    public int[] rearrangeArray(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int x: arr){
            if(x >= 0)
                pos.add(x);
            else
                neg.add(x);
        }
        int i=0,j=0,x = 0;
        int p_n = pos.size();
        int n_n = neg.size();
        while(i<p_n && j< n_n){
            arr[x] = pos.get(i);
            i++;
            x++;
            arr[x] = neg.get(j);
            j++;
            x++;
        }
        while(i<p_n){
            arr[x] = pos.get(i);
            x++;
            i++;
        }
        while(j<n_n){
            arr[x] = neg.get(j);
            x++;
            j++;
        }
        return arr;
    }
}