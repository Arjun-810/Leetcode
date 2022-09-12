class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
            if(n == 1)
                return true;
            int ans = 0;
            while(n>0){
                int a = n%10;
                ans+= Math.pow(a,2);
                n /= 10;
            }
            if(set.contains(ans))
                return false;
            set.add(ans);
            n = ans;
        }
    }
}