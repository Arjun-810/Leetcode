class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> twoHash = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            if (!twoHash.isEmpty() && twoHash.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = twoHash.get(target-nums[i]);
                break;
            }

            twoHash.put(nums[i],i);
        }
        return res;
    }
}