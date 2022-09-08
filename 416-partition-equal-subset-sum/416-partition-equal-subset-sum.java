class Solution {
    
    public int isEqual(int idx, int[] arr, int n,int sum,int cur_sum,int[][] is_pass){
        if(idx == n){
            if(sum == 2*cur_sum)
                return 1;
            return 0;
        }
        if(is_pass[idx][cur_sum] != -1)
            return is_pass[idx][cur_sum];
        
        if(isEqual(idx+1,arr,n,sum,cur_sum+arr[idx],is_pass) == 1 || isEqual(idx+1,arr,n,sum,cur_sum,is_pass) == 1)
            return is_pass[idx][cur_sum] = 1;
        
        
        return is_pass[idx][cur_sum] = 0;
    }
    
    
    public boolean canPartition(int[] arr) {
        int N = arr.length;
        int sum = 0;
        for(int x: arr)
            sum+=x;
        int[][] is_pass = new int[N+1][sum+1];
        for(int[] x: is_pass)
            Arrays.fill(x,-1);
        return isEqual(0,arr,N,sum,0,is_pass)==1?true:false;
    }
}