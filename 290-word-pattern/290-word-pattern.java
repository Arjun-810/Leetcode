class Solution {
    public boolean wordPattern(String pattern, String s) {
     String[] arr = s.trim().split(" ");
        if (pattern.length()!=arr.length) return false;
        Map<Character,String> map = new HashMap<>();
        Map<String,Character> p = new HashMap<>();
        for (int i=0;i<pattern.length();i++){
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(arr[i])) return false;
            }
            else if (p.containsKey(arr[i])){
                if (!p.get(arr[i]).equals(pattern.charAt(i))) return false;
            }
            else {
                map.put(pattern.charAt(i), arr[i]);
                p.put(arr[i],pattern.charAt(i));
            }
        }
        return true;
    }
}