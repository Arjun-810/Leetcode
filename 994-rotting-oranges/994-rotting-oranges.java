class Solution {
    public int orangesRotting(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        boolean flag = true;
        int no = 2;
        while(flag){
            int c= 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i][j] == 1){
                        if(j > 0 && arr[i][j-1] == no) arr[i][j]+=no;
                        else if(j < m-1 && arr[i][j+1] == no) arr[i][j]+=no;
                        else if(i > 0 && arr[i-1][j] == no) arr[i][j]+=no;
                        else if(i < n-1 && arr[i+1][j] == no) arr[i][j]+=no;
                        if(arr[i][j] != 1) c++;
                        
                    }
                }
            }
            if(c == 0) flag = false;
            else{
                count++;
                no++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                if(arr[i][j] == 1) return -1;
        }
        return count;
    }
}