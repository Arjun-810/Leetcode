class Solution {
    public int[] countBits(int n) {
             int[] res = new int[n+1];
        for (int i=0;i<n+1;i++){
            String temp = Integer.toBinaryString(i);
            int j=0,c=0;
            while (j<temp.length()){
                if (temp.charAt(j) == '1')
                    c++;
                j++;
            }
            res[i] = c;
        }
        return res;
    }
}