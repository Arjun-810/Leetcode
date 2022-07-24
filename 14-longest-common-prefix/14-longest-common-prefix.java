class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        String same = strs[0];
        for(int i=1;i<strs.length;i++){
            String temp = "";
            int n = Math.min(same.length(),strs[i].length());
            for(int j=0;j<n;j++){
                if(strs[i].charAt(j) == same.charAt(j))
                    temp += same.charAt(j);
                else break;
            }
            if(temp == "") return "";
            same = temp;
        }
        return same;
    }
}