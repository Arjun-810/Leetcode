class Solution {
    public String say(String k){
        String res= "";
        int prev = -1,ans = 10;
        for(int i=0;i<k.length();i++){
            if(prev != k.charAt(i)){
                if(i != 0) res += ans;
                ans = 10+k.charAt(i)-'0';
                prev = k.charAt(i);
            }
            else ans += 10;
        }
        return res+ans;
    }
    public String countAndSay(int n) {
        String k = "1";
        if(n == 1) return "1";
        for(int i=1;i<n;i++){
            k = say(k);
        }
        return k;
    }
}