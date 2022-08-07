class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length < 4) return list;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                HashMap<Integer,Integer> map = new HashMap<>();
                for(int k=j+1;k<nums.length;k++){
                    if(map.containsKey(target-nums[i]-nums[j]-nums[k])){
                        long sum = (long)nums[i]+(long)nums[j]+(long)nums[k];
                        if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) continue;
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(target-nums[i]-nums[j]-nums[k]);
                        set.add(temp);
                    }
                    map.put(nums[k],k);
                }
            }
        }
        for(List<Integer> a: set)
            list.add(a);
        return list;
    }
}