class Solution {
    public boolean isIsomorphic(String s, String t) {
    Map<Character,Character> s_map = new HashMap<>();
        Map<Character,Character> t_map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (s_map.containsKey(s.charAt(i)) ) {
                if (!(t.charAt(i) == s_map.get(s.charAt(i))))
                    return false;
            }
            else if(t_map.containsKey(t.charAt(i))){
                if (!(t_map.get(t.charAt(i)) == s.charAt(i)))
                    return false;
            } else {
                s_map.put(s.charAt(i), t.charAt(i));
                t_map.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}