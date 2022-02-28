class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = Integer.MIN_VALUE;
        StringBuilder st = new StringBuilder();
        for (int i=0;i<s.length();i++){
            char t = s.charAt(i);
            int index = st.indexOf(Character.toString(t));
            if (index!=-1){
                max = Math.max(max,st.length());
                st.delete(0,index+1);
            }
            st.append(t);
        }
        return Math.max(max,st.length());
    }
}