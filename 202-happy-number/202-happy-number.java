class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        boolean x = true;
        int sum=0;
        while (x){
            sum = 0;
            while (n>0){
                sum += Math.pow(n%10,2);
                n/=10;
            }
            System.out.println(sum);
            if (sum == 1||sum==7) return true;
            if (set.contains(sum))return false;
            else {
                set.add(sum);
                n = sum;
                x = true;
            }
        }
        return false;
    }
}