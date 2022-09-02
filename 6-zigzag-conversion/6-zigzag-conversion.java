class Solution {
     public int getIncrement(int row, int initial, boolean down){
        if (down || row == initial || row == 1) {
            if (row == 1)
                row = initial;
            return row * 2 - 2;
        }
        return (initial * 2 - 2) - (row * 2 - 2);
    }
    public String convert(String s, int numRows) {
           if (numRows == 1)
            return s;
        int currentRow = numRows;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; i++){
            int j = i;
            boolean down = true;
            while (j < s.length()){
                res.append(s.charAt(j));
                j += getIncrement(currentRow, numRows, down);
                down = !down;
            }
            currentRow--;
        }
        return res.toString();
    }
}