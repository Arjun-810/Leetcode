class Solution {
    public String minWindow(String s, String p) {
        int s_len = s.length();
        int p_len = p.length();
        
        if(p_len > s_len) return "";
        
        int[] hash_s = new int[256];
        int[] hash_p = new int[256];
        
        for(int i=0;i<p_len;i++)
            hash_p[p.charAt(i)]++;
            
        int start = 0,start_idx = -1,min_len = Integer.MAX_VALUE,count = 0;
        
        for(int i=0;i<s_len;i++){
            
            hash_s[s.charAt(i)]++;
            
            if(hash_s[s.charAt(i)] <= hash_p[s.charAt(i)]) count++;
            
            if(count == p_len){
                while((hash_s[s.charAt(start)] > hash_p[s.charAt(start)]) || hash_p[s.charAt(start)] == 0){
                    if(hash_s[s.charAt(start)] > hash_p[s.charAt(start)]) hash_s[s.charAt(start)]--;
                    start++;
                }
            
                int len = i-start+1;
            
                if(len < min_len){
                    min_len = len;
                    start_idx = start;
                }
            }
            
        }
        
        if(start_idx == -1) return "";
        
        return s.substring(start_idx,start_idx+min_len);
    }
}