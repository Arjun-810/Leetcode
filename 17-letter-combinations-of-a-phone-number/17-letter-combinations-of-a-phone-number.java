class Solution {
    public static void theans(String up, String p, List<String> ans){
        if (p.length() == 0){
            ans.add(up);
            return;
        }
        int digit = p.charAt(0) - '0';

        int s = 0;
        int e = 0;

        if (digit<7){
            s= 3*(digit-2);
            e= 3*(digit-1);
        } else if (digit == 7) {
            s= 3*(digit-2);
            e= (3*(digit-1))+1;
        } else if (digit==8) {
            s = (3*(digit-2))+1;
            e= (3*(digit))-2;
        } else {
            s= (3*(digit-2))+1;
            e = (3*(digit-1))+2;
        }

        for (int i = s; i < e; i++) {
            char ch = (char) (i + 'a');
            theans(up + ch,p.substring(1), ans);
        }
    }
    public List<String> letterCombinations(String digits) {
         List<String> ans = new ArrayList<>();
        if (digits.length() == 0){
            return ans;
        }

        theans("",digits, ans);
        return ans;
    }
}