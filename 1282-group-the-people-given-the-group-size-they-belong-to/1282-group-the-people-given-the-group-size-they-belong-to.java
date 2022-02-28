class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer,List<Integer>> map = new HashMap<>();
        for (int i=0;i<groupSizes.length;i++){
            if (map.containsKey(groupSizes[i])){
                List<Integer> l = map.get(groupSizes[i]);
                l.add(i);
                map.put(groupSizes[i],l);
            }else {
                List<Integer> l = new ArrayList<>();
                l.add(i);
                map.put(groupSizes[i],l);
            }
        }
        Set<Integer> keys = map.keySet();
        for (int k:keys){
            int i=0;
            for (int p=0;p<map.get(k).size()/k;p++){
                List<Integer> temp = new ArrayList<>();
                for (int m = 0;m<k;m++)
                    temp.add(map.get(k).get(i++));
                ans.add(temp);
            }
        }
        return ans;
    }
}