class Solution {
    public int numOfStrings(String[] patterns, String word) {
               int c = 0;
        for (String a:patterns)
            if (word.contains(a))
                c++;
        return c; 
    }
}