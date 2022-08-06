class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int row=-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][0] <= target && mat[i][mat[i].length-1] >= target){
                row = i;
                break;
            }
        }
        if(row == -1) return false;
        for(int a: mat[row])
            if(a == target) return true;
        return false;
    }
}