class Solution {
    public int subtractProductAndSum(int n) {
            int sum=0,p=1;
        while (n!=0){
            int temp = n%10;
            sum+=temp;
            p*=temp;
            n/=10;
        }
        return p-sum;
    }
}