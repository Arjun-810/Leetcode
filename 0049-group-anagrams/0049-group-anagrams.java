class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
             // key: string sorted by alphabatic order
        // value: list of word that are the anagram of its key
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            anagramMap.putIfAbsent(sortedStr, new LinkedList<>());
            anagramMap.get(sortedStr).add(s);            
        }
        
        return new ArrayList<>(anagramMap.values()); 
    }
}