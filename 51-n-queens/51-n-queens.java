import java.util.*;
class Solution {
    public List<String> construct(char[][] board){
        List<String> res = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    public boolean isValid(int row,int col,char[][] board){
        int temp_row = row;
        int temp_col = col;
        for(int i= 0;i<board.length;i++){
            if(board[row][i] == 'Q') return false;
        }
        while(row >=0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row = temp_row;
        col = temp_col;
        while(col >= 0 && row < board.length){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return  true;
    }
    public void solve(int col,char[][] board,List<List<String>> res){
        if(col == board.length){
            res.add(new ArrayList<>(construct(board)));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isValid(row,col,board)){
                board[row][col] = 'Q';
                solve(col+1,board,res);
                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j] = '.';
        List < List < String >> res = new ArrayList < List < String >> ();
        solve(0,board,res);
        return res;
    }
    
    
    
}