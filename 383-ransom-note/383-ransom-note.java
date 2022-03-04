class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for (char a:ransomNote.toCharArray())
            map1.put(a, map1.getOrDefault(a,0)+1);
        for (char a:magazine.toCharArray())
            map2.put(a, map2.getOrDefault(a,0)+1);
        for (Map.Entry mapElement : map1.entrySet()) {
            Character ch = (Character)mapElement.getKey();
            if (!(map2.containsKey(ch) && map2.get(ch)>=map1.get(ch))) {
                return false;
            }
        }
        return true;
    }
}