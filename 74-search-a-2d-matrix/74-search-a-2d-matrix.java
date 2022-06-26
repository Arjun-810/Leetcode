class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        for(int i=0;i<mat.length;i++){
            if(mat[i][0] == target || mat[i][mat[i].length-1] == target) return true;
            if(mat[i][0] < target && mat[i][mat[i].length-1] > target){
                for(int j=1;j<mat[i].length-1;j++) if(mat[i][j] == target) return true;
            }
        }
        return false;
    }
}