class Solution {
       public void transpose(int[][] matrix, int n) {
        for (int i=0;i<n;i++)
            for (int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
    }

    public void shift(int[][] matrix,int n) {
        for (int i=0;i<n;i++)
            for (int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
    }
    public void rotate(int[][] matrix) {
        transpose(matrix,matrix.length);
        shift(matrix,matrix.length);
    }
}