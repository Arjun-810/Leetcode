class Solution {
    public int majorityElement(int[] nums) {
        int n = (int) Math.floor(nums.length/2);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int a:nums){
            if(map.containsKey(a))
                map.put(a,map.get(a)+1);
            else map.put(a,1);
        }
        List keys = new ArrayList(map.keySet());
        for(Object a:keys){
            if(map.get(a)>n) return (int)a;
        }
        return -1;
    }
}