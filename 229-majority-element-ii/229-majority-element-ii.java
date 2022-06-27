class Solution {
    public List<Integer> majorityElement(int[] arr) {
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n1 = (int)Math.floor(arr.length/3);
        for(int a:arr){
            if(map.containsKey(a))
                map.put(a,map.get(a)+1);
            else
                map.put(a,1);
        }
        List<Integer> arr1 = new ArrayList<>();
        List keys = new ArrayList(map.keySet());
        for(Object a:keys)
            if(map.get(a)>n1) arr1.add((int)a);
        return arr1;
    }
}