class Solution {
    public int lengthOfLongestSubstring(String input) {
            HashMap<Character,Integer> map =new HashMap<>();
        int len = 0,s =0;
        for(int i=0;i<input.length();i++){
            if(map.containsKey(input.charAt(i))){
                len = Math.max(len,i-s);
                i=map.get(input.charAt(i));
                s = i+1;
                map.clear();
            }
            else map.put(input.charAt(i),i);
        }
        return Math.max(len,input.length()-s);
    }
}