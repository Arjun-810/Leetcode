class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
               if (s1.length() != s2.length()) return false;
        int n = s1.length();
        int k=0,count=0;
        char[] to_swap = new char[2];
        int[] index = new int[2];
        for (int i=0;i<n;i++){
            if (s1.charAt(i) != s2.charAt(i)) {
                if (k < 2) {
                    to_swap[k] = s1.charAt(i);
                    index[k] = i;
                    k++;
                }
                count++;
            }
        }
        if (count == 0) return true;
        if (count!=2) return false;
        return s2.charAt(index[0]) == to_swap[1] && s2.charAt(index[1]) == to_swap[0]? true:false;
    }
}