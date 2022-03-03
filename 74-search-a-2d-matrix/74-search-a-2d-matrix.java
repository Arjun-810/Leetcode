class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i=0;i<matrix.length;i++){
            if (!(matrix[i][0]<=target && matrix[i][matrix[0].length-1]>=target))
                continue;
            if (matrix[i][0]==target || matrix[i][matrix[0].length-1]==target)
                return true;
            for (int j=1;j<matrix[i].length-1;j++)
                if (matrix[i][j]==target) return true;
        }
        return false;
    }
}