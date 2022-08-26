class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int row_start = 0,row_end = matrix.length-1,col_start = 0,col_end = matrix[0].length-1;
        int dir = 0;
        while(row_start <= row_end && col_start <= col_end){
            
            if(dir == 0){
            for(int i=col_start;i<=col_end;i++){
                res.add(matrix[row_start][i]);
                
            }
            row_start++;
            }
            if(dir == 1){
            for(int i = row_start;i<=row_end;i++){
                res.add(matrix[i][col_end]);
            }
            col_end--;
            }
            if(dir== 2){
            for(int i=col_end;i>=col_start;i--){
                res.add(matrix[row_end][i]);
            }
            row_end--;
            }
            if(dir == 3){
            for(int i=row_end;i>=row_start;i--){
                res.add(matrix[i][col_start]);
            }
            
            col_start++;
            }
            dir = (dir+1)%4;
            
        }
        return res;
    }
}