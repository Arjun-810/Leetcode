class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        s = Arrays.toString(sc);
        t = Arrays.toString(tc);
        return s.equals(t);
    }
}