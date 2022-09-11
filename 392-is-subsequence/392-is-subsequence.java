class Solution {
    boolean isSub(int idx_s,int idx_t,String s, String t){
        if(idx_s >= s.length())
            return true;
        if(idx_t >= t.length())
            return false;
        if(s.charAt(idx_s) == t.charAt(idx_t))
            return isSub(idx_s+1,idx_t+1,s,t);
        return isSub(idx_s,idx_t+1,s,t);
        
    }
    public boolean isSubsequence(String s, String t) {
        return isSub(0,0, s,t);
    }
}