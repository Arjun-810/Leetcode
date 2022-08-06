class Solution {
    public List<Integer> majorityElement(int[] arr) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a: arr){
            if(map.containsKey(a)) map.put(a, map.get(a)+1);
            else map.put(a, 1);
        }
        for(Map.Entry<Integer, Integer> value: map.entrySet())
            if(value.getValue() > arr.length/3) list.add(value.getKey());
        return list;
    }
}