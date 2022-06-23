class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> pas = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 1; j <= i ; j++) {
                if (j == 1 || j == i) temp.add(1);
                else temp.add(pas.get(i-2).get(j-2)+pas.get(i-2).get(j-1));
            }
            pas.add(temp);
        }
        return pas;
    }
}