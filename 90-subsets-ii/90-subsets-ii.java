import java.util.*;
class Solution {
    public void findSub(int idx,int[] nums,Set<List<Integer>> list,List<Integer> temp){
        if(idx == nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        findSub(idx+1,nums,list,temp);
        temp.remove(temp.size()-1);
        findSub(idx+1,nums,list,temp);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        findSub(0,nums,list,temp);
        return new ArrayList<>(list);
    }
}