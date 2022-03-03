class Solution {
    public List<List<Integer>> generate(int numRows) {
           List<List<Integer>> list = new ArrayList<>();
        for (int i=1;i<=numRows;i++){
            List<Integer> li = new ArrayList<>();
            for (int j=1;j<=i;j++){
                if (i==1)
                    li.add(1);
                else if (i>1){
                    if (j==1 || j==i)
                        li.add(1);
                    else {
                        li.add(list.get(i - 2).get(j - 2) + list.get(i - 2).get(j-1));
                    }
                }
            }
            list.add(li);
        }
        return list;
    }
}