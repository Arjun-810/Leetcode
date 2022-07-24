class Solution {
    public int value(char s){
        int res = 0;
        switch(s){
                case 'I':
                    res = 1;
                    break;
                case 'V':
                    res = 5;
                    break;
                case 'X':
                    res = 10;
                    break;
                case 'L':
                    res = 50;
                    break;
                case 'C':
                    res = 100;
                    break;
                case 'D':
                    res = 500;
                    break;
                case 'M':
                    res = 1000;
                    break;
            }
        return res;
    }
    public int romanToInt(String s) {
        int ans = 0;
        for(int i=0;i<s.length()-1;i++){
            if(value(s.charAt(i)) <value(s.charAt(i+1)))
                ans -= value(s.charAt(i));
            else
                ans += value(s.charAt(i));
        }
        return ans+value(s.charAt(s.length()-1));
    }
}