class Solution {
        public static void transpose(int[][] matrix, int n) {
        for (int i=0;i<n;i++)
            for (int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
    }

    public static void shift(int[][] matrix,int n) {
        for (int i=0;i<n;i++)
            for (int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean is_true = false;
        int x=1;
        while(!is_true && x<=4){
            int f =0;
        transpose(mat,mat.length);
        shift(mat,mat.length);
        for (int i=0;i<mat.length;i++)
            for (int j=0;j<mat.length;j++)
                if (mat[i][j] != target[i][j])
                    f++;
            if(f==0)
                is_true = true;
            else
                is_true =false;
            x++;
        }
        return is_true;
    }
}